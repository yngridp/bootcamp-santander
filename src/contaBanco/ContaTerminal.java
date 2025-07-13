package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor , digite o número da Agência:");
        int numero = scanner.nextInt();

        System.out.println("Por favor , digite a  Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor , digite seu nome:");
        String nome = scanner.next().toUpperCase();

        System.out.println("Por favor , digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência," +
                "é %s, conta %s e seu saldo %s já está disponível para saque!", nome, agencia,
                numero, saldo);

    }
}
