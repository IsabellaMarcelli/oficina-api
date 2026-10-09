package br.edu.ifsp.pw3.api.conserto;

import br.edu.ifsp.pw3.api.mecanico.Mecanico;
import br.edu.ifsp.pw3.api.veiculo.Veiculo;

// DTO com todos os dados do conserto (nunca devolvemos a entidade direto)
public record DadosDetalhamentoConserto(Long id, String dataEntrada, String dataSaida,
                                        Mecanico mecanico, Veiculo veiculo, Boolean ativo) {

    public DadosDetalhamentoConserto(Conserto conserto) {
        this(conserto.getId(), conserto.getDataEntrada(), conserto.getDataSaida(),
             conserto.getMecanico(), conserto.getVeiculo(), conserto.getAtivo());
    }
}
