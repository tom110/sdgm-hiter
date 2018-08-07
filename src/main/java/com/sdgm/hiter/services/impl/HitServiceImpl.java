package com.sdgm.hiter.services.impl;

import com.sdgm.hiter.domain.Basic;
import com.sdgm.hiter.repository.BasicRepository;
import com.sdgm.hiter.services.DService;
import com.sdgm.hiter.services.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;

@Service
public class HitServiceImpl implements HitService,DService<Basic>{

    @Autowired
    private BasicRepository basicRepository;
    @Override
    public Basic addHit(Basic basic) {
        basic.setBasichit(basic.getBasichit()+1);
        return basic;
    }

    @Override
    public Basic getById(Long Id) {
        return basicRepository.findByBasicid(Id);
    }

    @Override
    public Basic saveOrUpdate(Basic domainObject) {
        return basicRepository.save(domainObject);
    }

}
