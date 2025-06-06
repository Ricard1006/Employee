package com.example.Employee.repository;

import com.example.Employee.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
