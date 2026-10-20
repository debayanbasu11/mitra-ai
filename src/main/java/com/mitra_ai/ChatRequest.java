package com.mitra_ai;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public record ChatRequest(
        @NotBlank
        @Size(max = 4000)
        String message,

        @Valid
        @Size(max = 20)
        List<ChatTurn> history
) {
}

