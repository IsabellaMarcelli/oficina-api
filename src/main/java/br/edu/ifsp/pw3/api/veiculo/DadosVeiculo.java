package br.edu.ifsp.pw3.api.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosVeiculo(

        @NotBlank
        String marca,

        @NotBlank
        String modelo,

        @NotBlank
        @Pattern(regexp = "\\d{4}")   // formato "xxxx"
        String ano,

        String cor) {                 // opcional

}
