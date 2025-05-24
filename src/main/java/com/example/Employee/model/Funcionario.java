package com.example.Employee.model;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name = "funcionario")

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