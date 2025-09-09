package br.com.agendamento;

import br.com.sistema.Medico;
import br.com.sistema.Usuario;

public class ConsultaOnline extends Consulta {
    private String link;

    public ConsultaOnline(String data, String hora, Medico medico, Usuario paciente, String link) {
        super(data, hora, medico, paciente);
        this.link = link;
    }

    public String getLink() {
        return link;
    }

public class Consulta {
    protected String data;
    protected String hora;
    protected Medico medico;
    protected Usuario paciente;

    public Consulta(String data, String hora, Medico medico, Usuario paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada:");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data: " + data + " Hora: " + hora);
    }

    public String resumo() {
        return "Consulta: " + paciente.getNome() + " com " + medico.getNome() + " em " + data + " às " + hora;
    }
}
}