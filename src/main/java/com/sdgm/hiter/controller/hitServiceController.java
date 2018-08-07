package com.sdgm.hiter.controller;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.sdgm.hiter.domain.Basic;
import com.sdgm.hiter.services.DService;
import com.sdgm.hiter.services.HitService;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class hitServiceController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private HitService hitService;

    @RequestMapping(value = "/hitService",method = RequestMethod.GET)
    public Long getHit(@RequestParam("data") String hitTag) {
        Long basicId=0l;
        String pattern = "\\d+";
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(hitTag);
        if (m.find()) {
             basicId=Long.parseLong(m.group(0));
        } else {
            log.error("提取BasicId错误！");
        }

        Basic basic= hitService.getById(basicId);
        Basic b= hitService.addHit(basic);
        hitService.saveOrUpdate(b);
        return b.getBasichit();
    }
}
