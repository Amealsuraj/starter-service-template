package com.sugarfit.starter.service.impl;



import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.service.ExampleService;
import com.sugarfit.starter.utils.RequestIdGenerator;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleResponse process(ExampleRequest request) {
        String requestId = RequestIdGenerator.generate();
        return new ExampleResponse("SUCCESS", requestId);
    }
}
