package Jogo;

public class Atacar extends Evento {
	Ataque a;

	public Atacar (Treinador t, Treinador t2, Ataque a){
		ator = t;
		alvo = t2;
		this.a = a;
	}
	
	public void executar(){
		System.out.println("O pokemon "+ator.p[0].nome+" usou "+a.nome);
		if((ator.p[0].tipo == "Fogo" && ator.p[0].tipo == "Grama") || (ator.p[0].tipo == "Agua" && ator.p[0].tipo == "Fogo") || (ator.p[0].tipo == "Grama" && ator.p[0].tipo == "Agua")){
			System.out.println("e foi Super Efetivo!");
			a.dano *= 2;
		}
		else if(!(ator.p[0].tipo == "Fogo" && ator.p[0].tipo == "Grama") || !(ator.p[0].tipo == "Agua" && ator.p[0].tipo == "Fogo") || !(ator.p[0].tipo == "Grama" && ator.p[0].tipo == "Agua")){
			System.out.println("e foi Pouco Efetivo...");
			a.dano /= 2;
		}
		ator.p[0].hp -= a.dano;
	}
}
