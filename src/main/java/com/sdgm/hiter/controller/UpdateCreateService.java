package com.sdgm.hiter.controller;

import com.sdgm.hiter.domain.Basic;
import com.sdgm.hiter.services.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UpdateCreateService {
    @Autowired
    private HitService hitService;
    @PostMapping(value = "/getArticleDateAndTitle")
    public Map<Date,String> getArticleDate(@RequestParam("articleId") Long articleId){
        try {
            Map dateAndTitle=new HashMap<Date,String>();
            Basic basic = hitService.getById(articleId);
            dateAndTitle.put(basic.getBasicdate(),basic.getBasictitle());
            return dateAndTitle;
        }catch (NullPointerException e){
            return null;
        }
    }
    @PostMapping(value = "/updateArticleDate")
    public String updateArticleDate(@RequestParam("articleId") Long articleId,
                                    @RequestParam("articleDate") Date articleDate){
        try {
            Basic basic = hitService.getById(articleId);
            basic.setBasicdate(articleDate);
            basic.setBasicupdatetime(articleDate);
            hitService.saveOrUpdate(basic);
            return "修改成功！";
        }catch (Exception e){
            return "修改错误！";
        }
    }

}
