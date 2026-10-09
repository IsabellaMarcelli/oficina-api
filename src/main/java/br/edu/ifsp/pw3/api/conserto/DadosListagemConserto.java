package br.edu.ifsp.pw3.api.conserto;

// Listagem parcial: id, datas, nome do mecânico, marca e modelo do veículo
public record DadosListagemConserto(Long id, String dataEntrada, String dataSaida,
                                    String nomeMecanico, String marca, String modelo) {

    public DadosListagemConserto(Conserto conserto) {
        this(conserto.getId(),
             conserto.getDataEntrada(),
             conserto.getDataSaida(),
             conserto.getMecanico().getNome(),
             conserto.getVeiculo().getMarca(),
             conserto.getVeiculo().getModelo());
    }
}
