package com.javakc.ssm.modules.organization.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.organization.entity.LiuContractEntity;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.service.OrganizationService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
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
    public ModelAndView query(OrganizationEntity entity, ModelAndView model,
                              HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        System.out.println(entity.getOrganizationName());
        System.out.println("--------------------------------------------------------");
        model.addObject("page", organizationService.queryPage(new Page<OrganizationEntity>(request, response), entity));
        model.addObject("entity", entity);
        model.setViewName("organization/list");
        return model;
    }

    @RequestMapping(value="/save")
    public String Save(OrganizationEntity o){
        System.out.println("执行保存方法");
//        organizationService.save(o);
        return "redirect:/organization/query.do";
    }
      @RequestMapping(value="/delete")
    public String delete(){
        System.out.println("删除操作");

        return "";
    }
    @RequestMapping(value="/view")
    public String view(){
        System.out.println("执行操作");

        return "organization/create";
    }
    @RequestMapping(value="/createcontract")
    public ModelAndView createcontract(LiuContractEntity liuContractEntity,ModelAndView modelAndView){

        OrganizationEntity organizationEntity = new OrganizationEntity();
        List<LiuContractEntity> liuContractEntities =new ArrayList<LiuContractEntity>();
        liuContractEntities.add(liuContractEntity);
        organizationEntity.setLiuContractEntities(liuContractEntities);
        modelAndView.addObject("organizationEntity",organizationEntity);
        modelAndView.setViewName("organization/create");

        return modelAndView;
    }


}
