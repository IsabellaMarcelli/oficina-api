package br.edu.ifsp.pw3.api.mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record DadosMecanico(

        @NotBlank
        String nome,

        @PositiveOrZero
        Integer anosExperiencia) {

}
