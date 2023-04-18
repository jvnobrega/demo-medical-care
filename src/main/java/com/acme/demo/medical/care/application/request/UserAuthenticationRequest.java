package com.acme.demo.medical.care.application.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthenticationRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
