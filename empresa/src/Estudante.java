package empresa;

public class Estudante extends Pessoa {
    public String curso;
    public double notaB1 = 0.0;
    public double notaB2 = 0.0;


    public Estudante(String nome, Integer idade, String cpf, String email, String telefone, String curso) {
        super(nome, idade, cpf, email, telefone);
        this.curso = curso;
    }

    // Método média (Item 3a)
    public double calcularMedia() {
        return (this.notaB1 + this.notaB2) / 2;
    }

    // Método situação (Item 3b)
    public String verificarSituacao() {
        return (this.calcularMedia() >= 6.0) ? "APROVADO" : "REPROVADO";
    }

    // Exibir dados (Item 5)
    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nCurso: " + this.curso +
                "\nNota B1: " + this.notaB1 +
                "\nNota B2: " + this.notaB2 +
                "\nMédia Final: " + this.calcularMedia() +
                "\nSituação: " + this.verificarSituacao();
    }
}