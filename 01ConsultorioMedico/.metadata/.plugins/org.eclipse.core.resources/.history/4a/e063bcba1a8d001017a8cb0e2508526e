package br.com.sistema;

import java.util.ArrayList;
import java.util.List;
import br.com.agendamento.Consulta;

public class Medico {
    private String nome;
    private String especialidade;
    private String email;
    private String senha;

    private List<Consulta> agenda;

    public Medico(String nome, String especialidade, String email, String senha) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.email = email;
        this.senha = senha;
        this.agenda = new ArrayList<>();
    }

    public void atenderPacientes() {
        System.out.println(nome + " está preparado para atender.");
    }

    public void adicionarConsulta(Consulta consulta) {
        agenda.add(consulta);
    }

    public List<Consulta> getAgenda() {
        return agenda;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
