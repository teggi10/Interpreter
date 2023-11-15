package interpreter;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int context;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa el numero a convertir");
       context = scanner.nextInt();
       Expression expression = new EgipcianExpression(context);
        // Construir la expresión: 2 + 3 * 4
       /*  Expression expression = new AddExpression(
                new NumberExpression(3),
                new MultiplyExpression(new NumberExpression(3), new NumberExpression(4))
        );*/

        // Evaluar la expresión
        String result = expression.interpreter(context);
        System.out.println("Resultado: " + result); 
    }
}