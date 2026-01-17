package com.sugarfit.starter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataProcessorRequest(
    @NotBlank(message = "userId is required") String userId,
    @NotNull(message = "value is required") Integer value
) {}

