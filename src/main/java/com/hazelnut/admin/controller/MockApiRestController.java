package com.hazelnut.admin.controller;

import com.hazelnut.admin.domain.MockApi;
import com.hazelnut.admin.service.MockApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jiachi on 12/25/2015.
 */
@Controller
public class MockApiRestController {
    @Autowired
    private MockApiService mockApiService;

    @RequestMapping("/mockApis")
    public
    @ResponseBody
    List<MockApi> queryAll() {
        return mockApiService.findAll();
    }
}
