package empresa;

public class Main {
    public static void main(String[] args) {
        prova1(); // Chamada da prova
    }

    public static void prova1() {
        System.out.println("média semestral - aprovacação/reprovação dos alunos");

        Estudante est1 = new Estudante("Raphael Marcelo", 20, "111.111.111-11", "raphael@email.com", "(16) 91111-1111", "ADS");
        est1.notaB1 = 8.0; est1.notaB2 = 7.0;

        Estudante est2 = new Estudante("Leonardo Castro", 29, "222.222.222-22", "leo@email.com", "(16) 92222-2222", "RH");
        est2.notaB1 = 5.0; est2.notaB2 = 6.5;

        Estudante est3 = new Estudante("Ronald Silva", 21, "333.333.333-33", "ronald@email.com", "(16) 93333-3333", "GPI");
        est3.notaB1 = 4.0; est3.notaB2 = 3.0;

        // Meu nome completo
        Estudante est4 = new Estudante("Renata Saraiva Claudino", 32, "444.444.444-44", "renata@email.com", "(16) 94444-4444", "ADS");
        est4.notaB1 = 9.5; est4.notaB2 = 10.0;

        System.out.println(est1.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est2.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est3.exibirDados());
        System.out.println("-".repeat(40));
        System.out.println(est4.exibirDados());
    }
}