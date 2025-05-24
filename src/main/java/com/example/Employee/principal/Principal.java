package com.example.Employee.principal;

import com.example.Employee.model.DadosFuncionario;
import com.example.Employee.model.Funcionario;
import com.example.Employee.repository.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private FuncionarioRepository repositorio;
    private List<Funcionario> series = new ArrayList<>();

    public Principal(FuncionarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {

            int opcao = -1;

            System.out.println("=== Sistema de Funcionários ===");

            while (opcao != 0) {
                System.out.println("\n1. Cadastrar funcionário");
                System.out.println("2. Listar funcionários");
                System.out.println("3. Buscar por CPF");
                System.out.println("4. Relatório: Maior salário");
                System.out.println("0. Sair");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                switch (opcao) {
                    case 1 -> cadastrarFuncionario();
                    case 2 -> listarFuncionarios();
                    case 3 -> buscarPorCpf();
                    case 4 -> mostrarMaiorSalario();
                    case 0 -> System.out.println("Encerrando sistema...");
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    private void buscarFuncionario() {
        DadosFuncionario dados = getDadosSerie();
       Funcionario funcionario = new Funcionario(dados);
        repositorio.save(funcionario);
         System.out.println(dados);
    }

        public static void cadastrarFuncionario () {
            System.out.println("--   Cadastro de Funcionário --");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            Funcionario f = new Funcionario(nome, cpf, cargo, salario, departamento);
            funcionarios.add(f);
            System.out.println("Funcionário cadastrado com sucesso!");
        }

        public static void listarFuncionarios () {
            System.out.println("\n-- Lista de Funcionários --");
            if (funcionarios.isEmpty()) {
                System.out.println("Nenhum funcionário cadastrado.");
            } else {
                for (Funcionario f : funcionarios) {
                    System.out.println(f);
                }
            }
        }

        public static void buscarPorCpf () {
            System.out.print("\nDigite o CPF para buscar: ");
            String cpf = scanner.nextLine();
            boolean encontrado = false;
            for (Funcionario f : funcionarios) {
                if (f.getCpf().equals(cpf)) {
                    System.out.println("Funcionário encontrado:");
                    System.out.println(f);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Funcionário não encontrado.");
            }
        }

        public static void mostrarMaiorSalario () {
            if (funcionarios.isEmpty()) {
                System.out.println("Nenhum funcionário cadastrado.");
                return;
            }

            Funcionario maior = funcionarios.get(0);
            for (Funcionario f : funcionarios) {
                if (f.getSalario() > maior.getSalario()) {
                    maior = f;
                }
            }

            System.out.println("\nFuncionário com maior salário:");
            System.out.println(maior);
        }
    }