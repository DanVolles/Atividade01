import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao programa de cálculo de médias dos alunos!");
        System.out.println("Lembre-se: as notas dos alunos podem ir de 0 a 10!");

        System.out.println("Por favor, inclua a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Obrigado! Você inseriu a nota " + nota1 + "!");

        System.out.println("Por favor, inclua a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Obrigado! Você inseriu a nota " + nota2 + "!");

        double media = (nota1+nota2)/2;

        if (media > 7.00) {
            System.out.println("O aluno foi APROVADO com nota " + media + "!");
        } else {
            System.out.println("O aluno foi REPROVADO com nota " + media + "!");
        }

        System.out.println("Obrigado por utilizar este programa! Bom trabalho!");

    }
}
