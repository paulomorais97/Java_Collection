import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		// COLLECTIONS 2 - SEGUNDA PARTE;
		// SET
		Locale.setDefault(Locale.US);
		Set<Aluno> conjunto = new HashSet<Aluno>();
		
		Aluno a = new Aluno(" Paulo Morais ", " Java ", 8.0);
		Aluno b = new Aluno(" Vitoria Machado ", " ADM ",9.5);
		Aluno c = new Aluno(" Alexandre Fernandes ", " ED. FISICA", 8.5);
		
		conjunto.add(a); //Adicionando valores 
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
	}

}
