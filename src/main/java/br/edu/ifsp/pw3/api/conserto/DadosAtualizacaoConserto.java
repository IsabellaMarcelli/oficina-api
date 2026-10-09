package br.edu.ifsp.pw3.api.conserto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

// Apenas os dados que podem ser alterados:
// data de saída / nome do mecânico / anos de experiência do mecânico
public record DadosAtualizacaoConserto(

        @NotNull
        Long id,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
        String dataSaida,

        String nomeMecanico,

        @PositiveOrZero
        Integer anosExperienciaMecanico) {

}
