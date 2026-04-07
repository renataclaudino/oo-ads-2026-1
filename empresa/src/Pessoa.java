package empresa;

public class Pessoa {
    public String nome;
    public Integer idade;
    public String cpf;
    public String email;
    public String telefone;

    public Pessoa(String nome, Integer idade, String cpf, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String exibirDados() {
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf +
                "\nEmail: " + this.email +
                "\nTelefone: " + this.telefone;
    }
}