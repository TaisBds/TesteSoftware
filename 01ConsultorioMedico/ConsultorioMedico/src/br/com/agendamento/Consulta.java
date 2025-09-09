package br.com.agendamento;

import br.com.sistema.Medico;
import br.com.sistema.Usuario;

public class Consulta {
    protected String data;
    protected String hora;
    protected Medico medico;
    protected Usuario paciente;

    public Consulta(String data2, String hora2, Medico medico2, Usuario paciente2) {
		// TODO Auto-generated constructor stub
	}



	public String resumo() {
        return "Consulta: " + paciente.getNome() + " com " + medico.getNome() + " em " + data + " às " + hora;
    }

	
}