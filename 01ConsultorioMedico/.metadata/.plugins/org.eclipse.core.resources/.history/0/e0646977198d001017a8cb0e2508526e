package br.com.sistema;

import java.util.Scanner;
import br.com.sistema.Paciente;
import br.com.sistema.Medico;
import br.com.agendamento.ConsultaOnline;
import br.com.agendamento.Consulta;
import br.com.agendamento.ConsultaPresencial;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando paciente e médico (dados fixos para teste)
        Paciente paciente = new Paciente("Ana Silva", "123.456.789-00", "(61) 91234-5678", "ana@mail.com", "123456");
        Medico medico = new Medico("Dr. João", "Cardiologia", "joao@clinica.com", "123456");

        int opcao;
        do {
            System.out.println("\n=== Sistema de Agendamento ===");
            System.out.println("1 - Login como Paciente");
            System.out.println("2 - Login como Médico");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("E-mail: ");
                    String emailP = sc.nextLine();
                    System.out.print("Senha: ");
                    String senhaP = sc.nextLine();

                    if (paciente.getEmail().equals(emailP) && paciente.getSenha().equals(senhaP)) {
                        System.out.println("Login realizado com sucesso! Bem-vindo(a), " + paciente.getNome());

                        // Criar consultas
                        Consulta c1 = new Consulta("14/06/2026", "19:00", medico, paciente);
                        c1.agendarConsulta();

                        ConsultaPresencial cp = new ConsultaPresencial("15/06/2025", "14:30", medico, paciente, 12);
                        cp.agendarConsulta();

                        ConsultaOnline co = new ConsultaOnline("16/06/2025", "10:00", medico, paciente, "https://meet.link/consulta123");
                        co.agendarConsulta();

                        medico.adicionarConsulta(c1);
                        medico.adicionarConsulta(cp);
                        medico.adicionarConsulta(co);

                        System.out.println("Consultas agendadas!");
                    } else {
                        System.out.println("E-mail ou senha inválidos.");
                    }
                }
                case 2 -> {
                    System.out.print("E-mail: ");
                    String emailM = sc.nextLine();
                    System.out.print("Senha: ");
                    String senhaM = sc.nextLine();

                    if (medico.getEmail().equals(emailM) && medico.getSenha().equals(senhaM)) {
                        System.out.println("Login realizado com sucesso! Bem-vindo(a), " + medico.getNome());
                        System.out.println("=== Agenda do médico ===");
                        if (medico.getAgenda().isEmpty()) {
                            System.out.println("Sem consultas agendadas.");
                        } else {
                            medico.getAgenda().forEach(c -> System.out.println(c.resumo()));
                        }
                    } else {
                        System.out.println("E-mail ou senha inválidos.");
                    }
                }
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
