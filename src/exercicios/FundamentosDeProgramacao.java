package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class FundamentosDeProgramacao {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

//        int baseYear = OffsetDateTime.now().getYear();
//
//        System.out.println("Digite seu nome: ");
//        var nome = scanner.next();
//
//        System.out.println("Digite seu ano de nascimento: ");
//        int ano = scanner.nextInt();
//
//        var idade = baseYear - ano;
//
//        System.out.printf("Olá %s você tem %s anos \n", nome, idade);
//
//        //Exe2
//        System.out.println("Digite o tamanho do lado do quadrado: ");
//        double lado = scanner.nextDouble();
//
//        double area = lado * lado;
//
//        System.out.printf("O valor da área do quadrado é %s: \n", area);
//
//        //Exe3
//        System.out.println("Digite o valor da base do retÂngulo: ");
//        double base = scanner.nextDouble();
//
//        System.out.println("Digite o valor da altura do retÂngulo: ");
//        double altura = scanner.nextDouble();
//
//        double areaRetangulo = base * altura;
//
//        System.out.printf("O valor da área do retÂngulo é %s: ", areaRetangulo);

        //Exe4
        System.out.println("Digite o primeiro nome: ");
        var pessoa1 = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite o segundo nome: ");
        var pessoa2 = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = idade1 % idade2;

        System.out.printf("A diferença de idade entre as duas pessoas é %s anos \n", diferencaIdade);



















    }
}
