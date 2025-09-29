package com.itbaizhan.controller;

import com.pojo.Brand;
import com.result.BaseResult;
import com.service.BrandService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {
    // 远程注入
    @DubboReference
    private BrandService brandService;


    @GetMapping("/findById")
    public BaseResult<Brand> findById(Long id){
        Brand brand = brandService.findById(id);
        return BaseResult.ok(brand);
    }
}
