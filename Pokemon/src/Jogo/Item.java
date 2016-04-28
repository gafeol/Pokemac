package Jogo;

import java.util.Random;

public class Item extends Evento{
	// 1 = pokeball
	// 2 = potion
	int tipo;
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public Item (Treinador a, Treinador b, int tipo){
		ator = a;
		alvo = b;
		this.tipo = tipo;
		prioridade = 1;
	}	
	
	public void executar (){
		if ( tipo == 1 ){
			System.out.println("O treinador "+ator.nome+" jogou uma pokebola!!");
			System.out.println("Porém não conseguiu capturar o pokemon "+alvo.p[0].nome+"...");
		}
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
