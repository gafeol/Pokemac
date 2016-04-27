package Jogo;

public class Pokemon {
	public String nome;
	int hp;
	int hpMax;
	String tipo;
	Ataque[] atk = new Ataque[10];
	
	public Pokemon ( String nome, int hp, String tipo, Ataque[] a){
		this.nome = nome;
		this.hp = hp;
		hpMax = hp;
		this.tipo = tipo;
		for(int i=0;i<4;i++){
			atk[i] = a[i];
		}
	}
}
