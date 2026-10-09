package br.edu.ifsp.pw3.api.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {

    private String nome;
    private Integer anosExperiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome = dados.nome();
        this.anosExperiencia = dados.anosExperiencia();
    }

    // Cada informação é opcional: só altera o que foi efetivamente informado.
    public void atualizarInformacoes(String nome, Integer anosExperiencia) {
        if (nome != null) {
            this.nome = nome;
        }
        if (anosExperiencia != null) {
            this.anosExperiencia = anosExperiencia;
        }
    }
}
