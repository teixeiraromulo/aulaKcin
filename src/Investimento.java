import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {

        char tipoInvestimento;
        double valorInvestimento;
        double totalInvestimento = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de investimento: ");
        System.out.println("Digite P para poupança");
        System.out.println("Digite F para Fundo de renda fixa");
        System.out.println("Digite C para CDB");
        System.out.println("Digite A para ações");

        tipoInvestimento = sc.next().charAt(0);

        System.out.println("Digite o valor de investimento: ");
        valorInvestimento = sc.nextDouble();

        if (tipoInvestimento == 'P') {
            System.out.println("O tipo de investimento escolhido foi a Poupança!");
            totalInvestimento = valorInvestimento * 1.03;
        } else if (tipoInvestimento == 'F') {
            System.out.println("O tipo de investimento escolhido foi o Fundo de renda fixa!");
            totalInvestimento = valorInvestimento * 1.05;
        } else if (tipoInvestimento == 'C') {
            System.out.println("O tipo de investimento escolhido foi o CDB!");
            totalInvestimento = valorInvestimento * 1.06;
        } else if (tipoInvestimento == 'A') {
            System.out.println("O tipo de investimento escolhido foi Ações!");
            totalInvestimento = valorInvestimento * 1.1;
        }

        System.out.println("O total do rendimento após 30 dias será: ");
        System.out.println(totalInvestimento);


    }

}
