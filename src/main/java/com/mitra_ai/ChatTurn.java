package com.mitra_ai;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ChatTurn(
        @NotBlank
        @Size(max = 8000)
        String role,

        @NotBlank
        @Size(max = 8000)
        String content
) {
}
