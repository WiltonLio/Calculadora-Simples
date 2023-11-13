import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Escolha uma operação (Soma (s), Subtração (b), Multiplicação (m), Divisão (d)): ");
        String operacao = scanner.next();
        
        double resultado = 0;
        
        switch (operacao) {
            case "s":
                resultado = num1 + num2;
                break;
            case "b":
                resultado = num1 - num2;
                break;
            case "m":
                resultado = num1 * num2;
                break;
            case "d":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println("O resultado é: " + resultado);
        
        scanner.close();
    }
}
