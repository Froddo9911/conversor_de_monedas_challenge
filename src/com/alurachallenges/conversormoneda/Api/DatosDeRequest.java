package com.alurachallenges.conversormoneda.Api;

public record DatosDeRequest(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result) {
}
