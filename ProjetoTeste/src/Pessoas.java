// Classe é só um modelo!
public class Pessoas {
	
	String nomeAt; // Não é variável
	int idadeAt;
	float rendaAt;
	
	public void mostrarValorNome() {
		System.out.println(this.nomeAt);
	}
	
	public void mostrarValorIdade() {
		System.out.println(this.idadeAt);
	}
	
	public void mostrarValorRenda() {
		System.out.println(this.rendaAt);
	}
	
	// 3 métodos para receber os valores
	public void receberNome(String nomePar) {
		this.nomeAt = nomePar;
	}
	
	public void receberIdade(int idadePar) {
		this.idadeAt = idadePar;
	}
	
	public void receberRenda(float rendaPar) {
		this.rendaAt = rendaPar;
	}
	
}
