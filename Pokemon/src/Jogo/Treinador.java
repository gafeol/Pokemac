
package Jogo;

public class Treinador {
	public Pokemon[] p = new Pokemon[10];
	public String nome;
	
	public Treinador ( String nome, Pokemon[] p, int npoke){
		this.nome = nome;
		for(int a=0;a<npoke;a++){
			this.p[a] = p[a];
		}
	}
}
