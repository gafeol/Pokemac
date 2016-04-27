package Jogo;

public class Ataque{
	String nome;
	int dano;
	int prioridade;
	public Ataque(){}
	
	public Ataque ( String nome, int dano, int prioridade ){
		this.nome = nome;
		this.dano = dano;
		this.prioridade = prioridade + 3;
	}
}
