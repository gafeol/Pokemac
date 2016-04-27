package Jogo;

public class Atacar extends Evento {
	Ataque a;

	public Atacar (Treinador t, Treinador t2, int ind_atk){
		ator = t;
		alvo = t2;
		//ind_atk recebe valores de 1 a 4
		ind_atk--;
		this.a = t.p[0].atk[ind_atk];
		prioridade = t.p[0].atk[ind_atk].prioridade;
	}
	
	public void executar(){
		int dano = a.dano;
		System.out.print("O pokemon "+ator.p[0].nome+" usou "+a.nome);

		if((ator.p[0].tipo == "Fogo" && alvo.p[0].tipo == "Grama") || (ator.p[0].tipo == "Agua" && alvo.p[0].tipo == "Fogo") || (ator.p[0].tipo == "Grama" && alvo.p[0].tipo == "Agua")){
			System.out.println(" e foi Super Efetivo!");
			dano *= 2;
		}
		else{
			System.out.println();
		}
		/*else if((ator.p[0].tipo == "Fogo" && ator.p[0].tipo == "Grama") || !(ator.p[0].tipo == "Agua" && ator.p[0].tipo == "Fogo") || !(ator.p[0].tipo == "Grama" && ator.p[0].tipo == "Agua")){
			System.out.println("e foi Pouco Efetivo...");
			a.dano /= 2;
		}*/
		if(dano > alvo.p[0].hp)
			dano = alvo.p[0].hp;
		
		System.out.println("O pokemon "+alvo.p[0].nome+" recebeu "+dano+" de dano");
		alvo.p[0].hp -= dano;
		if(alvo.p[0].hp == 0){
			System.out.println("O pokemon "+alvo.p[0].nome+" morreu!");
		}
	}
}
