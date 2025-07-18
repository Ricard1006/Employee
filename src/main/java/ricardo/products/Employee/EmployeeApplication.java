package ricardo.products.Employee;

import ricardo.products.Employee.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {
	@Autowired
	private FuncionarioRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {

	}
}