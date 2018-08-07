package com.sdgm.hiter.repository;

import com.sdgm.hiter.domain.Basic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends CrudRepository<Basic,Long> {
    Basic findByBasicid(Long basic_id);
}
