package com.sugarfit.starter.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExampleRequest {

    @NotBlank(message = "userId must not be blank")
    private String userId;

    @NotNull(message = "value must not be null")
    private Integer value;

    public ExampleRequest() {}

    public ExampleRequest(String userId, Integer value) {
        this.userId = userId;
        this.value = value;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getValue() {
        return value;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

