package br.edu.ifsp.pw3.api.conserto;

import br.edu.ifsp.pw3.api.mecanico.DadosMecanico;
import br.edu.ifsp.pw3.api.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")   // formato "xx/xx/xxxx"
        String dataEntrada,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")   // formato "xx/xx/xxxx"
        String dataSaida,

        @NotNull
        @Valid
        DadosMecanico mecanico,

        @NotNull
        @Valid
        DadosVeiculo veiculo) {

}
