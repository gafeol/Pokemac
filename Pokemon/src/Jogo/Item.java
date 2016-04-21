package Jogo;

public class Item extends Evento{
	
	private int tipo;
	// 1 = pokeball
	// 2 = potion
	
	static public void executa ( Treinador a, Treinador b, int tipo ){
		if ( tipo == 1 ){
			
		}

		if ( tipo == 2 ){
			a.p[0].hp += 20;  
			
			if ( a.p[0].hp > a.p[0].hpMax )
			a.p[0].hp = a.p[0].hpMax;
		}
	
		
	}
}
