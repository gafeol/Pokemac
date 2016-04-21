package Jogo;

public class Run extends Evento {
	
	public Run (){
		prioridade = 0;
	}
	
	public void executa ( Treinador a, Treinador b ){
		
		System.out.println( "O treinador " + a.nome + "fugiu. O treinador " + b.nome + "é o vencedor!" );
	}

}
