package com.hazelnut.admin.service;

import com.hazelnut.admin.domain.MockApi;
import com.hazelnut.admin.repository.MockApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jiachi on 12/25/2015.
 */
@Service
public class MockApiService {
    @Autowired
    private MockApiRepository repository;

    public List<MockApi> findAll() {
        return repository.findAll();
    }
}
