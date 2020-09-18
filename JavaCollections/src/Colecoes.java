import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		//LIST
		
		Collection<String> nomes = new ArrayList();
		nomes.add("João");
		nomes.add("Marcelo");
		nomes.add("Jose");
		
		
		Collection<String> nomes2 = Arrays.asList("Maria", "Mario"); // para adicionar valores de uma lsita para outra
		nomes.addAll(nomes2); // adicionando valores da lista 2 na lista 1
		
		for(String name : nomes) {
		System.out.println(name);
		}
		nomes.remove("Marcelo");	//Remove uma possição da lista
		
		if(nomes.isEmpty()) //Verifica se a lista está vazia
		{
			System.out.println("Lista vazia"); 
		} else {
		System.out.println(nomes);
		}
		
		System.out.print("Contem o nome Jose?"+nomes.contains("Jose"));  // para verificar os dados da lista
		
		System.out.println("\n"+nomes);
		
		nomes.clear(); // limpa a lista
		System.out.println(nomes);

	}

}
