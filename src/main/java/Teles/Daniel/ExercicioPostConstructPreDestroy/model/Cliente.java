package Teles.Daniel.ExercicioPostConstructPreDestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 21:21
 * @category model
 */

@ToString
@Getter @Setter
@AllArgsConstructor
@Component
public class Cliente {

    private String nome;
    private String sobrenome;
    private int idade;

    public Cliente() {
        System.out.println("Classe cliente");
    }

    public String verificarMaiorIdade() {
        if(this.idade >= 18) {
            return "Adulto";
        } {
            return "Menor de idade";
        }
    }
}
