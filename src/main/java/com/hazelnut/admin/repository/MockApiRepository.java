package com.hazelnut.admin.repository;

import com.hazelnut.admin.domain.MockApi;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jiachi on 12/25/2015.
 */
@Repository
public interface MockApiRepository extends MongoRepository<MockApi, String> {
}
