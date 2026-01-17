package com.sugarfit.starter.service;



import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;

public interface ExampleService {
    ExampleResponse process(ExampleRequest request);
}
