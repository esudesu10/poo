/**
 * 
 */
import java.util.Scanner;

public class scanDataType{
    public static void main(String[] args) {
        int number ;
        float floatNumber;
        double doubleNumber;
        char caracter;
        boolean trueOrFalse;
        String nome;
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um numero inteiro: ");
        number = input.nextInt();

        System.out.println("Digite um numero float: ");
        floatNumber = input.nextFloat();

        System.out.println("Digite um numero double: ");
        doubleNumber = input.nextDouble();

        System.out.println("Digite um numero character: ");
        caracter = input.next().charAt(0);
        
        System.out.println("Digite uma string: ");
        nome = input.nextLine();

        System.out.println("Digite verdadeiro ou falso: ");
        trueOrFalse = input.nextBoolean();
    }
}
