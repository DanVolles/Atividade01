import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        System.out.println("Olá! Seja bem vindo ao programa de cálculo de salários!\n" +
                "Por favor, digite as informações que serão solicitadas!");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do colaborador: ");
        String nome = input.nextLine();

        System.out.print("Digite o valor da hora trabalhada desse colaborador: ");
        double valorHora = input.nextDouble();

        System.out.print("Digite quantas horas esse colaborador trabalhou nesse mês: ");
        double horasTrabalhadas = input.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println(nome + " receberá, neste mês " + salario + " reais de salário!");
        System.out.println("Obrigado por ter utilizado o programa de cálculo de salários!\n" +
                "Até a próxima!");
    }
}
