package Jogo;

public class Item extends Evento{
	// 1 = pokeball
	// 2 = potion
	int tipo;
	
	
	public Item (Treinador a, Treinador b, int tipo){
		ator = a;
		alvo = b;
		this.tipo = tipo;
		prioridade = 1;
	}	
	
	public void executar (){
		if ( tipo == 1 ){
			
		}
		if ( tipo == 2 ){
			if ( ator.p[0].hp+20 > ator.p[0].hpMax ){
				System.out.println("O pokémon "+ator.p[0].nome+" recuperou "+(ator.p[0].hpMax - ator.p[0].hp)+" pontos de vida"  );
				ator.p[0].hp = ator.p[0].hpMax;	
			}
			else {
				System.out.println("O pokémon "+ator.p[0].nome+" recuperou 20 pontos de vida" );
				ator.p[0].hp += 20;
			}
		}
	}
}
