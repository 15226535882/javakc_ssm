package com.javakc.ssm.modules.organization.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.service.OrganizationService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 数据字典表现层实现
 * @author javakc
 * @version v0.1
 */
@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {

    @Autowired
    protected OrganizationService organizationService;
   
    @RequestMapping(value="/query")
    public List<OrganizationEntity> findAll(OrganizationEntity o){
        return organizationService.findList(o);
    }
}