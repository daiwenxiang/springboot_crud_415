package cn.dwx.springboot_crud_415.controller;

import cn.dwx.springboot_crud_415.service.SaleService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class SaleController {
    @Resource
    SaleService saleService;

    @GetMapping("getSales")
    public List<Map> getAllSales() {
        return saleService.getAll();
    }

    @DeleteMapping("del")
    public Integer del(@RequestParam("id") Integer id) {
        return saleService.del(id);
    }

    @GetMapping("getByPage")
    public PageInfo<Map> getByPage(@RequestParam Map map) {
//        System.out.println("map = " + map);
        return saleService.getByPage(map);
    }

    @RequestMapping("add")
    public int add(@RequestParam Map map) {
        return saleService.add(map);
    }

    @PutMapping("update")
    public Integer update(@RequestParam Map map) {
        return saleService.update(map);
    }
}
