package br.com.sistema;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public Paciente(String nome, String cpf, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public void esperarAtendimento() {
        System.out.println(nome + " está aguardando atendimento...");
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
