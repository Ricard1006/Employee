package ricardo.products.Employee.service;

import ricardo.products.Employee.entity.Funcionario;
import ricardo.products.Employee.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {

        this.repository = repository;
    }

    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Funcionario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
