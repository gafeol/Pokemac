package Jogo;
import java.util.Random;

public class Item extends Evento{
	private static Random rand;
	private static int prob = 0;
	private int tipo;
	// Item do tipo 1 = pokeball
	// Item do tipo 2 = potion
	
	public Item (Treinador a, Treinador b, int tipo){
		ator = a;
		alvo = b;
		this.tipo = tipo;
		prioridade = 1;
	}	
	
	public static boolean capturou ( Treinador a ){
		prob = 100 - ( (a.p[0].hp) / (a.p[0].hpMax) );
		int randomNum = rand.nextInt(100);
		if ( randomNum < prob )	return true;
		else return false;
	}
	
	public void executar (){
		// 1 = POKEBALL
		if ( tipo == 1 ){
			
		}
		
		// 2 = POTION
		if ( tipo == 2 ){
			if ( ator.p[0].hp+20 > ator.p[0].hpMax ){
				System.out.println("O pok�mon "+ator.p[0].nome+" recuperou "+(ator.p[0].hpMax - ator.p[0].hp)+" pontos de vida"  );
				ator.p[0].hp = ator.p[0].hpMax;	
			}
			else {
				System.out.println("O pok�mon "+ator.p[0].nome+" recuperou 20 pontos de vida" );
				ator.p[0].hp += 20;
			}
		}
	}
}
