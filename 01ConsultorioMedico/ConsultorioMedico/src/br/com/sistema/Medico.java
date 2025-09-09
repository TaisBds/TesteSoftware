package br.com.sistema;

import java.util.ArrayList;
import java.util.List;
import br.com.agendamento.Consulta;

public class Medico extends Usuario {
    private List<Consulta> agenda;

    public Medico(String nome, String email, String senha) {
        super(nome, email, senha);
        this.agenda = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        agenda.add(consulta);
    }

    public List<Consulta> getAgenda() {
        return agenda;
    }

    public void atenderPacientes() {
        System.out.println(nome + " está preparado para atender.");
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
