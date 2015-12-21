# mock-service-4j
Mockup Service for Testing. Traditional way for integration test among multiple micro-services require all dependency
services deployed to server before running test. With mock service, we can config the service under test point to mock
service server without dependency services setup.

Two components:
- mock-admin: an admin tool to set up rest api and its mocked data
- mock-service: an url handler to dynamic return mocked data based on request url and http method

### Example:
Assuming we have a service which request some resources from external micro service with GET method:
```
http://service-host/service/path/to/resource
```
With mock admin tool, we first set up this request url, http method and returned data into mongoDB:
```
{
    url: '/service/path/to/resource',
    method: 'GET',
    data: {
        some fields: ...
    }
}
```

After setup, use the following api to access to mocked data
```
http://mock-service-host/service/path/to/resource
```
By changing the host to mocker service, mock-service will try to access to mongo database to find the mocked api based on
request url and return the data.adre
