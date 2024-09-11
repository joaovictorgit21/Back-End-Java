import java.util.*;

public class TerminalCalculator {
    private static String numberOne;
    private static String numberTwo;
    
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        System.out.println("Digite o primeiro número que será somado e tecle Enter");
        numberOne = scnInput.nextLine();
        System.out.println("Digite o segundo número que será somado e tecle Enter");
        numberTwo = scnInput.nextLine();
        System.out.println(String.format("O resultado da soma é: %d", Integer.valueOf(numberOne) + Integer.valueOf(numberTwo)));
        scnInput.close();
    }
}