import java.util.Scanner;

public class ProdutoComEntrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int b = entrada.nextInt();

        int produto = a * b;

        System.out.println("O produto é: " + produto);

        entrada.close();
    }    
}