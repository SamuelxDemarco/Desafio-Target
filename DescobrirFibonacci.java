import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fib1 = 0, fib2 = 1, fib_atual = 0;
        boolean pertence = false;
        
        // Obtendo o número a ser verificado
        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();
        
        // Calculando a sequência de Fibonacci até encontrar o número informado ou ultrapassá-lo
        while (fib_atual <= num) {
            fib_atual = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_atual;
            
            if (fib_atual == num) {
                pertence = true;
                break; // interrompe o laço se encontrar o número na sequência
            }
        }
        
        // Verificando se o número pertence à sequência
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci!");
        }
        
        input.close();
    }
}
