package com.sdgm.hiter.services;

public interface DService<T> {
    T getById(Long Id);

    T saveOrUpdate(T domainObject);
}
