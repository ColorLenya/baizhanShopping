package com.itbaizhan.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itbaizhan.mapper.AdminMapper;
import com.pojo.Admin;
import com.service.AdminService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@DubboService
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Admin findById(Long id) {
        return null;
    }

    @Override
    public Page<Admin> search(int page, int size) {
        return null;
    }

    @Override
    public void updateRoleToAdmin(Long aid, Long[] rids) {

    }
}
