package br.com.codiub.mew.model.output;

import br.com.codiub.mew.model.entity.Cores;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoresOutput {
    private Long id;
    private String tipo;
    private String cor;

    public CoresOutput(Cores user) {
        this.id = user.getId();
        this.tipo = user.getTipo();
        this.cor = user.getCor();
    }

}
