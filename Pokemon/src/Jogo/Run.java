package Jogo;

public class Run extends Evento {
	
	public Run (Treinador a, Treinador b){
		ator = a;
		alvo = b;
		prioridade = 0;
	}
	
	public void executar (){
		
		System.out.println( "O treinador " + ator.nome + " fugiu. O treinador " + alvo.nome + " é o vencedor!" );
	}

}
