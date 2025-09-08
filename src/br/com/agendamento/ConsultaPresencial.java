package br.com.agendamento;

import br.com.sistema.Medico;
import br.com.sistema.Paciente;

public class ConsultaPresencial extends Consulta {
    private int sala;

    public ConsultaPresencial(String data, String hora, Medico medico, Paciente paciente, int sala) {
        super(data, hora, medico, paciente);
        this.sala = sala;
    }

    public int getSala() { return sala; }

    @Override
    public void agendarConsulta() {
        super.agendarConsulta();
        System.out.println("Consulta presencial na sala: " + sala);
    }

    @Override
    public String resumo() {
        return super.resumo() + " | Presencial (Sala " + sala + ")";
    }
}
