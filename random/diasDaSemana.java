package random;
import java.util.Scanner;

public class diasDaSemana {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        
        int semana;
        
        System.out.println("Informe o dia da semana: ");
        
        semana = scan.nextInt();
        
        switch(semana){
        
        case 1:
        
        System.out.println("Domingo");
        
        break;
        
        case 2:
        
        System.out.println("Segunda");
        
        break;
        
        case 3:
        
        System.out.println("Terça");
        
        break;
        
        case 4:
        
        System.out.println("Quarta");
        
        break;
        
        case 5:
        
        System.out.println("Quinta");
        
        break;
        
        case 6:
        
        System.out.println("Sexta");
        
        break;
        
        case 7:
        
        System.out.println("Sábado");
        
        
        break;
        
        default:
        System.out.println("Insira um valor entre 1 e 7");
        
        }
        }
}
