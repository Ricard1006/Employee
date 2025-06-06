package com.example.Employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome, String cpf, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nome + " | CPF: " + cpf + " | Cargo: " + cargo +
                " | Salário: R$" + salario + " | Departamento: " + departamento;
    }
}
