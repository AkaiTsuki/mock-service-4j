package com.hazelnut.admin.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

/**
 * Created by Jiachi on 12/25/2015.
 */
@Document(collection = "mockApi")
public class MockApi {
    @Id
    private String id;

    private HttpMethod method;

    private String url;

    private Map<String, Object> data;

    public MockApi() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
