import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {

	//COLLECTIONS 3 - MAP

	public static void maisn(String args[]) {
		
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno(" Paulo Morais ", " Java ", 8.0);
		Aluno b = new Aluno(" Vitoria Machado ", " ADM ",9.5);
		Aluno c = new Aluno(" Alexandre Fernandes ", " ED. FISICA", 8.5);
		
		mapa.put("Paulo Morais",a); //Adicionando valores ao mapa
		mapa.put("Vitoria Machado", b);
		mapa.put("Alexandre Fernandes", c);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Vitoria Machado"));
		
		Collection<Aluno> alunos = mapa.values(); // Instanciando alnos com valores do mapa
		
		for(Aluno e : alunos) {
			System.out.println(e);
		}
		
	}
	
}
