package Teles.Daniel.ExercicioPostConstructPreDestroy.dao;

import Teles.Daniel.ExercicioPostConstructPreDestroy.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 21:21
 * @category DAO
 */
@Getter @Setter
@Component
public class ClienteDAO {

    @Autowired
    private Cliente cliente;

    @PostConstruct
    public void PostConstruct() {
        System.out.println("Objeto criado");
    }

    @PreDestroy
    private void PreDestroy() {
        System.out.println("Objeto removido");
    }
}
