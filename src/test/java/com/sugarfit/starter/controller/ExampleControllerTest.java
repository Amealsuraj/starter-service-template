package com.sugarfit.starter.controller;

import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = ExampleController.class)

public class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ExampleService exampleService;

    @Test
    void exampleShouldReturnSuccess() throws Exception {

        Mockito.when(exampleService.process(any()))
                .thenReturn(new ExampleResponse("SUCCESS", "test-uuid"));

        mockMvc.perform(post("/example")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                  "userId": "123",
                                  "value": 42
                                }
                                """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("SUCCESS"))
                .andExpect(jsonPath("$.requestId").value("test-uuid"));
    }


}
