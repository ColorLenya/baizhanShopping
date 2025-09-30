package com.itbaizhan.controller;

import com.pojo.Admin;
import com.result.BaseResult;
import com.service.AdminService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台管理员
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @DubboReference
    private AdminService adminService;

    /**
     * 新增管理员
     *
     * @param admin 管理员对象
     * @return 执行结果
     */
    @PostMapping("/add")
    public BaseResult add(@RequestBody Admin admin) {
        adminService.add(admin);
        return BaseResult.ok();
    }
}