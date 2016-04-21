package Jogo;

public class Pokemon {
	String nome;
	int hp;
	int hpMax;
	String tipo;
	Ataque a1;
	Ataque a2;
	Ataque a3;
	Ataque a4;
	
	public Pokemon ( String nome, int hp, String tipo, Ataque a1, Ataque a2, Ataque a3, Ataque a4 ){
		this.nome = nome;
		this.hp = hp;
		hpMax = hp;
		this.tipo = tipo;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
}
