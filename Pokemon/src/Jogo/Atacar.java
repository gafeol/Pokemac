package Jogo;

public class Atacar extends Evento {
	
	public Atacar ( ){
		this.nome = nome;
		this.dano = dano;
		this.prioridade = prioridade + 3;
	}
	
	public void executa(Treinador t1, Treinador t2){
		System.out.println("O pokemon "+t1.p[0].nome+" usou "+nome);
		if((t1.p[0].tipo == "Fogo" && t1.p[0].tipo == "Grama") || (t1.p[0].tipo == "Agua" && t1.p[0].tipo == "Fogo") || (t1.p[0].tipo == "Grama" && t1.p[0].tipo == "Agua")){
			System.out.println("e foi Super Efetivo!");
			dano *= 2;
		}
		else if(!(t1.p[0].tipo == "Fogo" && t1.p[0].tipo == "Grama") || !(t1.p[0].tipo == "Agua" && t1.p[0].tipo == "Fogo") || !(t1.p[0].tipo == "Grama" && t1.p[0].tipo == "Agua")){
			System.out.println("e foi Pouco Efetivo...");
			dano /= 2;
		}
		t2.p[0].hp -= dano;
	}
}
