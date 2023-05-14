package random;
import java.util.Scanner;
public class media {
    public static void name(String[] args) {
        Scanner teste = new Scanner(System.in);

        System.out.println("Insira o nome do Estudante:");
        String estudante = teste.nextLine();
    
        System.out.println("Insira as notas do aluno:");
    
    
    
        float N1 = teste.nextFloat();	
        float N2 = teste.nextFloat();	
        float N3 = teste.nextFloat();	
        float N4 = teste.nextFloat();	
    
        float media = ((N1*2 + N2*3 + N3*4 + N4)/4);
     
        
        
        
          if (media >= 5 && media <= 6.9   ){
          System.out.println("Aluno em exame");
          System.out.println("Insira a nota do exame");
          float N5 = teste.nextFloat();
          media = (media+N5)/2;
          if(media >= 5){
            System.out.println("Aluno aprovado: ");
          }else{
            System.out.println("Aluno Reprovado: ");
          }}
          else if (media >= 7 ){
          System.out.println("Aluno Aprovado");
        } 
        else if (media <5  ){
          System.out.println("Aluno Reprovado");
        }
        
     }
    
}

