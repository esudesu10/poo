package random;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        int calcular;
        float soma, subtracao, multiplicacao, divisao;
    
        System.out.println("Calculadora: 1- Soma 2- subtracao 3- multiplicacao 4- divisao:");
    
        System.out.println("Insira o primeiro numero :");
        float N1 = teste.nextFloat();	
    
        System.out.println("Insira o segundo numero :");
        float N2 = teste.nextFloat();
    
        System.out.println("Insira a opcao desejada// 1- Soma 2- subtracao 3- multiplicacao 4- divisao :");
        calcular = teste.nextInt();	
    
        switch(calcular){
    
            case 1:
            
            soma = N1 + N2;
            System.out.println("Soma: " + soma);
            
            break;
            
            case 2:
            subtracao = N1 - N2;
            System.out.println("Subtracao: " + subtracao);
            
            
            break;
            
            case 3:
            multiplicacao = N1 * N2;
            System.out.println("multiplicacao: " + multiplicacao);
            
            break;
            
            case 4:
            divisao = N1 / N2;
            System.out.println("divisao: " + divisao);
            
            break;
    
            default:
            System.out.println("Insira um valor entre 1 e 4");
            
            }
        
    
        }
}
