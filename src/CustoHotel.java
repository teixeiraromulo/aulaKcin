import java.util.Scanner;

public class CustoHotel {
    //padrao de nomenclatura de classes e variáveis JAVA!
    //SEMPRE utilizar o padrao de nomenclatura cammelcase
    //o que é o cammelcase? todaVezQueTrocamosAPalavraUtilizamosLetraMaiuscula
    // para nomenclatura de classes SEMPRE utilizar a primeira letra Maiuscula
    //para nomenclatura de variaveis SEMPRE utilizar a primeira letra minuscula
    // NomeDeClasse -- nomeDeVariavel

    public static void main(String[] args) {

        String nome;
        double valorDaDiaria = 80.00;
        double contaCliente;
        int quantidadeDiarias;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite sua quantidade de diarias: ");
        quantidadeDiarias = ler.nextInt();

        ler.close();

        if (quantidadeDiarias < 15) {
            contaCliente = ((quantidadeDiarias * valorDaDiaria) + (5.50 * quantidadeDiarias));
        } else if (quantidadeDiarias == 15) {
            contaCliente = ((6 * quantidadeDiarias) + (quantidadeDiarias * valorDaDiaria));
        } else {
            contaCliente = ((8 * quantidadeDiarias) + (quantidadeDiarias * valorDaDiaria));
        }

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Valor total da estadia: " + contaCliente);
    }

}
