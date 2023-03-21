package Tarefa2CodigosParaRevisao;

import java.util.Scanner;

public class CalculadoraPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        double primeiroTermo = sc.nextDouble();

        System.out.print("Digite a razão da PA: ");
        double razao = sc.nextDouble();

        System.out.print("Digite o número N: ");
        int n = sc.nextInt();

        double nesimoTermo = primeiroTermo + (n - 1) * razao;
        System.out.println("O " + n + "º termo da PA é: " + nesimoTermo);
    
        sc.close();
    }
}
