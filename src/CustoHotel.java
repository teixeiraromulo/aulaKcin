import java.util.Scanner;

public class CustoHotel {


    public static void main(String[] args) {

        String nome;
        double valorDaDiaria = 80.00;
        double contaCliente = 0;
        int quantidadeDiarias;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite sua quantidade de diarias: ");
        quantidadeDiarias = ler.nextInt();

        ler.close();

        if (quantidadeDiarias > 15) {
            contaCliente = ((quantidadeDiarias * valorDaDiaria) + (5.50 * quantidadeDiarias));
        } else if (quantidadeDiarias == 15) {
            contaCliente = ((6 * quantidadeDiarias) + (quantidadeDiarias * valorDaDiaria));
        } else if (quantidadeDiarias < 15 && quantidadeDiarias >= 0) {
            contaCliente = ((8 * quantidadeDiarias) + (quantidadeDiarias * valorDaDiaria));
        }else {
            System.out.println("quantidade de diárias, não válida");
        }

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Valor total da estadia: " + contaCliente);
    }

}