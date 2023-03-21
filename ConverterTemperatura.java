package Tarefa2CodigosParaRevisao;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        
        double fahrenheit = sc.nextDouble();
        double celsius = (5.0/9.0) * (fahrenheit - 32.0);
        
        System.out.println("A temperatura em graus Celsius é: " + celsius);
        
        sc.close();
    }
}
