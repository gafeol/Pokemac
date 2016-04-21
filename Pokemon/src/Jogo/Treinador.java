package Jogo;

public class Treinador {
	public Pokemon[] p = new Pokemon[10];
	String nome;
	
	public Treinador ( String nome, Pokemon[] p, int npoke){
		this.nome = nome;
		for(int a=0;a<npoke;a++){
			this.p[a] = p[a];
		}
	}
	public static void main (String[] args){
		Pokemon[] v = new Pokemon[10];
		Ataque splash = new Ataque("splash", 10, 2);
		v[0] = new Pokemon("bla", 12, "agua", splash, splash, splash, splash);
		v[1] = new Pokemon("bla3", 12, "agua", splash, splash, splash, splash);
		v[2] = new Pokemon("bla2", 12, "agua", splash, splash, splash, splash);
		Treinador garca = new Treinador("garcia", v, 3);
	}
}
