package com.sugarfit.starter.unittests.service;


import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.service.ExampleService;
import com.sugarfit.starter.service.impl.ExampleServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;



public class ExampleServiceTest {

    private final ExampleService exampleService = new ExampleServiceImpl();

    @Test
    void processShouldReturnSuccessAndRequestId() {
        ExampleRequest request = new ExampleRequest("123", 42);
        ExampleResponse response = exampleService.process(request);

        assertEquals("SUCCESS", response.getStatus());
        assertNotNull(response.getRequestId());
        assertFalse(response.getRequestId().isBlank());
    }
}

