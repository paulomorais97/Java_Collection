
public class Erros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
			}
		
		//Como a frase inicial é nula ela entrou no catch
		catch(NullPointerException e) { // caso tenha um problema sera tratado pelo catch
			System.out.println("A frase inicial é nula, para solucionar tal problema"
					+ " foi atribuido um valor default.");
			frase= "Frase vazia"; // frase recebendo um valor.
			novaFrase = frase.toUpperCase();  // sendo executado a solução do problema
		}
		System.out.println("Frase Antiga: "+ frase);
		System.out.println("Nova Frase: "+ novaFrase);
	}

}
