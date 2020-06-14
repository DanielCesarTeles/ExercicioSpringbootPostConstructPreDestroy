package Teles.Daniel.ExercicioPostConstructPreDestroy;

import Teles.Daniel.ExercicioPostConstructPreDestroy.dao.ClienteDAO;
import Teles.Daniel.ExercicioPostConstructPreDestroy.model.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 21:21
 * @category view
 */
@SpringBootApplication
public class ExercicioPostConstructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExercicioPostConstructPreDestroyApplication.class, args);
		ClienteDAO clienteDAO = applicationContext.getBean(ClienteDAO.class);

		clienteDAO.setCliente(new Cliente("Vitória","Zanoni",18));

		System.out.println(clienteDAO.getCliente() + "\n" + clienteDAO.getCliente().verificarMaiorIdade());
	



	}

}
