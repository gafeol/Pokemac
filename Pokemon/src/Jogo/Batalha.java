package Jogo;
import java.util.Random;

public class Batalha {
	public static void batalhaWild(Treinador t, Pokemon w){
		Random rand = new Random();
		
		System.out.println("O pokemon selvagem "+w.nome+" apareceu!");
		Pokemon[] v = {w, null, null, null, null, null};
		Treinador wild = new Treinador("Wild Pokemon", v, 1);
		
		boolean capturado = false;
		
		while(!EventSet.verificaPerdeu(t) && !EventSet.verificaPerdeu(wild) && !capturado){
			//se o treinador n perdeu, o pokemon selvagem nao morreu nem foi ccapturado, continua a batalha
			int randomAw = rand.nextInt(4)+1;
			Evento aw = new Atacar(wild, t, randomAw);
			Evento at = null;
			
			if(t.p[0].hp <= 0){
				for(int a=0;a<6;a++){
					if(t.p[a].hp > 0){
						at = new Trocar(t, wild, a);
						break;
					}
				}
				
			}
			else if(wild.p[0].hp < wild.p[0].hpMax/3){
				//joga pokebola
				at = new Item(t, wild, 1);
				if(Item.capturou(wild) == true){
					System.out.println("O treinador "+t.nome+" jogou uma pokebola!!");
					System.out.println("E conseguiu capturar o pokemon "+wild.p[0].nome+"!!!");
					System.out.println(wild.p[0].nome+" foi direcionado para o PC");
					capturado = true;
				}
			}
			else{
				int randomAt = rand.nextInt(4)+1;
				at = new Atacar(t, wild, randomAt);
			}
			if(!capturado) 
				EventSet.executa_rodada(at, aw);
		}
		System.out.println("");
	}
}
