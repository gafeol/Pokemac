package Jogo;

public class Batalha {
	public static void batalhaWild(Treinador t, Pokemon w){
		boolean capturado = false;
		while(!EventSet.verificaPerdeu(t) && w.hp>0 && !capturado){
			//se o treinador n perdeu, o pokemon selvagem nao morreu nem foi ccapturado, continua a batalha
			if(w.hp<10){
				//joga pokebola
				
			}
			else{
				Ataque aw1 = new Atacar()
			}
		}
	}
}
