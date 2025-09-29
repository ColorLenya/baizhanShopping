package com.itbaizhan.service;

import com.itbaizhan.mapper.BrandMapper;
import com.pojo.Brand;
import com.result.BaseResult;
import com.result.BusException;
import com.result.CodeEnum;
import com.service.BrandService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@DubboService
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;


    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    @Override
    public Brand findById(Long id) {
        if (id == 0){
            int i = 1/0; // 模拟系统异常
        }else if (id == -1){
            throw new BusException(CodeEnum.PARAMETER_ERROR); // 模拟业务异常
            //抛出异常被异常处理器捕获，马上处理
        }
        return brandMapper.selectById(id);
    }


}
