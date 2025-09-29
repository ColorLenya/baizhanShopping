package com.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.pojo.Brand;

import java.util.List;

/**
 * 品牌服务
 */
public interface BrandService {
    // 根据id查询品牌
    Brand findById(Long id);
    // 查询所有品牌

}
