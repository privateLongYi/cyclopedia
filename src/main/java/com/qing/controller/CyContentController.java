package com.qing.controller;


import com.qing.entity.CyContent;
import com.qing.service.impl.CyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cc2")
public class CyContentController {

        @Autowired
        private    CyContentService cyContentService;

        //查询所有
        @RequestMapping("queryall")
        public String queryall(ModelMap map){
            List<CyContent> cyContent = cyContentService.queryall();
            map.addAttribute("CyClassifyes", cyContent);
            return "list";
        }

        //新增
        @RequestMapping("saveCyContent")
        public String saveCyContent(CyContent cyContent){
            cyContentService.saveCyContent(cyContent);
            return "redirect:queryAll";
        }

        //类别删除
        @RequestMapping("delCyContentbytype")
        public String delCyContentbytype(CyContent cyContent){
            cyContentService.delCyContentbytype(cyContent);
            return "redirect:queryAll";
        }

        //id删除
        @RequestMapping("delCyContentbyid")
        public String delCyContentbyid(CyContent cyContent){
            cyContentService.delCyContentbyid(cyContent);
            return "redirect:queryAll";
        }
        //id修改
        @RequestMapping("updCyContentbyid")
        public String updCyContentbyid(CyContent cyContent){
            cyContentService.updCyContentbyid(cyContent);
            return "redirect:queryAll";
        }
        //类别查询
        @RequestMapping("queryCyContentbytype")
        public String queryCyContentbytype(CyContent cyContent){
            cyContentService.queryCyContentbytype(cyContent);
            return "redirect:queryAll";
        }
        //id查询
        @RequestMapping("queryCyContentbyid")
        public String queryCyContentbyid(CyContent cyContent){
            cyContentService.queryCyContentbyid(cyContent);
            return "redirect:queryAll";
        }
}