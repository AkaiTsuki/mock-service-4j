package com.hazelnut.admin.repository;

import com.hazelnut.admin.domain.HttpMethod;
import com.hazelnut.admin.domain.MockApi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jiachi on 12/25/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:integration-context.xml"})
public class MockApiRepositoryTest {

    @Autowired
    private MockApiRepository mockApiRepository;

    private List<String> savedTestDataIds = new ArrayList<String>();;

    @Before
    public void setup() {
        MockApi api1 = new MockApi();
        api1.setMethod(HttpMethod.DELETE);
        api1.setUrl("/MockApiRepositoryTest/mockapi");
        api1 = mockApiRepository.save(api1);
        savedTestDataIds.add(api1.getId());

        MockApi api2 = new MockApi();
        api2.setMethod(HttpMethod.PUT);
        api2.setUrl("/MockApiRepositoryTest/mockapi");
        api2 = mockApiRepository.save(api2);
        savedTestDataIds.add(api2.getId());
    }

    @After
    public void teardown() {
        for (String id : savedTestDataIds) {
            mockApiRepository.delete(id);
        }
    }

    @Test
    public void testFindAll() {
        List<MockApi> found = mockApiRepository.findAll();
        assertNotNull(found);
        assertEquals(2, found.size());
    }
}