package Jogo;

import java.util.Random;

public class PokeSet {
	static int npok = 0;
	static Pokemon[] lista_pok = new Pokemon[100];
	static int vi[] = {0, 0, -1, 1};
	static int vj[] = {1, -1, 0, 0};
	static void add(Pokemon[] p, int np){
		for(int a=0;a<np;a++){
			lista_pok[npok++] = p[a];
		}
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static Pokemon findWild(int i, int j, char[][] m){
		int indWild = npok*2;
		if(m[i][j] == 'G')
			indWild = randInt(0, npok*2);
		//50% chance de encontrar pokemon se estiver na grama
		if(indWild >= npok)
			return null;
		else
			return lista_pok[indWild];
	}
	
	public static void printMap(int i, int j, char[][] m){
		System.out.println();
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				if(i == a && j == b)
					System.out.print("T");
				else
					System.out.print(m[a][b]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean valid(int i, int j){
		//verifica se o treinador saiu dos limites
		return (i >=0 && j >= 0 && i<10 && j<10);
	}
	
	public static void anda(Treinador t, int i, int j, char[][] m){
		Pokemon wild = null;
		while(wild == null){
			int randDir = rand.nextInt(4);
			while(!valid(i + vi[randDir], j + vj[randDir])){
				randDir = rand.nextInt(4);
			}
			i = i + vi[randDir];
			j = j + vj[randDir];
			printMap(i, j, m);
			wild = findWild(i, j, m);
		}
		System.out.println("Um pokemon selvagem foi encontrado!");
		Batalha.batalhaWild(t, wild);
	}
}
