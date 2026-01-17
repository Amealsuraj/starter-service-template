
package com.sugarfit.starter.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ExampleControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void exampleShouldReturnSuccessAndRequestId() throws Exception {
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
                .andExpect(jsonPath("$.requestId").exists());
    }

    @Test
    void exampleShouldReturn400WhenUserIdMissing() throws Exception {
        mockMvc.perform(post("/example")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                  "value": 42
                                }
                                """))
                .andExpect(status().isBadRequest());
    }

    @Test
    void exampleShouldReturn400WhenValueMissing() throws Exception {
        mockMvc.perform(post("/example")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                  "userId": "123"
                                }
                                """))
                .andExpect(status().isBadRequest());
    }
}
