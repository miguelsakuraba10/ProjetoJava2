public class ClassePrincipal {
	public static void main(String[] args) {
		System.out.println("Hello, world!"); // sysout CTRRL + SPACE		
		
		// Instanciar a classe Pessoa
		// Criar objeto da classe pessoa
		Pessoas objetoPessoa1 = new Pessoas();
		
		// Modo mais fácil, porém errado! Método
		//objetoPessoa1.nomeAt = "Guilherme";
		//objetoPessoa1.idadeAt = 16;
		//objetoPessoa1.rendaAt = 10_000;
		
		objetoPessoa1.receberNome("Guilherme"); // Parâmetro
		objetoPessoa1.receberIdade(16); // Parâmetro
		objetoPessoa1.receberRenda(10_000); // Parâmetro		
		
		// Modo mais fácil, porém errado! Método
		//System.out.println(objetoPessoa1.nomeAt);
		//System.out.println(objetoPessoa1.idadeAt);
		//System.out.println(objetoPessoa1.rendaAt);
		
		objetoPessoa1.mostrarValorNome();
		objetoPessoa1.mostrarValorIdade();
		objetoPessoa1.mostrarValorRenda();
		
		Pessoas objetoPessoa2 = new Pessoas();
		objetoPessoa2.receberNome("Arthur"); // Parâmetro
		objetoPessoa2.receberIdade(16); // Parâmetro
		objetoPessoa2.receberRenda(20_000); // Parâmetro
		
		objetoPessoa2.mostrarValorNome();
		objetoPessoa2.mostrarValorIdade();
		objetoPessoa2.mostrarValorRenda();
		
		
	}

}
