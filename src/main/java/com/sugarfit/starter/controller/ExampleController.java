package com.sugarfit.starter.controller;



import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.service.ExampleService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping("/example")
    public ResponseEntity<ExampleResponse> process(@Valid @RequestBody ExampleRequest request) {
        return ResponseEntity.ok(exampleService.process(request));
    }
}

