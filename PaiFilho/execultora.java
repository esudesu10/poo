package PaiFilho;
import PaiFilho.heranca.Filho;
import PaiFilho.heranca.Pai;
public class execultora{
	public static void main(String[] args){
		System.out.println("Herança");

		Pai joao = new Pai();
		joao.sobrenome = "Rodrigues";		
		System.out.println("Pai: " + joao.sobrenome);
		
		Filho diego = new Filho();
		diego.sobrenome = "Rodrigues";
		System.out.println("Filho: " + diego.sobrenome);
		
	}
}


