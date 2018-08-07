package com.sdgm.hiter.services;

import com.sdgm.hiter.domain.Basic;

public interface HitService extends DService<Basic>{
    Basic addHit(Basic domainObject);

}
