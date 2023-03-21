package Tarefa2CodigosParaRevisao;
import java.util.Scanner;

public class CalculadoraMassaPneu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pressão do pneu em kPa: ");
        double pressao = sc.nextDouble();

        System.out.print("Digite o volume do pneu em metros cúbicos: ");
        double volume = sc.nextDouble();

        System.out.print("Digite a temperatura do pneu em graus Celsius: ");
        double temperatura = sc.nextDouble();

        double massa = pressao * volume / (0.37 * (temperatura + 273.15));
        System.out.println("A massa de ar contida no pneu é: " + massa + " kg");
        
        sc.close();
    }
}   