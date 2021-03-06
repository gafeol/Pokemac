package Jogo;

public class Main{
	static char m[][] = new char[50][50];
	
	public static void criaMapa(){
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				m[a][b] = 'G';
			}
		}
		m[0][0] = 'E';
		m[0][1] = 'E';
		m[0][2] = 'E';
		m[1][2] = 'E';
		m[2][2] = 'E';
		m[3][2] = 'E';
		m[3][3] = 'E';
		m[4][3] = 'E';
		m[5][2] = 'E';
		m[7][9] = 'E';
		m[8][9] = 'E';
		m[7][3] = 'E';
		m[2][7] = 'E';
		m[2][8] = 'E';
		
		
	}
	
	public static void main (String[] args){
		Ataque a1 = new Ataque("Tackle", 21, 1);
		Ataque a2 = new Ataque("Harden", 32, 2);
		Ataque a3 = new Ataque("Body Slam", 11, 14);
		Ataque a4 = new Ataque("Fire Blast", 51, 11);		
		Ataque a5 = new Ataque("Razor Leaf", 12, 4);
		Ataque a6 = new Ataque("Water Gun", 10, 7);
		Ataque a7 = new Ataque("Metronome", 20, 8);
		Ataque a8 = new Ataque("Quick Attack", 10, 1);
		
		Ataque[] atk1 = {a1,a2,a3,a4};
		Ataque[] atk2 = {a5,a1,a3,a8};
		Ataque[] atk3 = {a2,a3,a7,a6};
		Ataque[] atk4 = {a4,a5,a1,a8};
		
		
		Pokemon c1 = new Pokemon("Bulbasaur", 50, "Grama", atk1);
		Pokemon c2 = new Pokemon("Squirtle", 32, "Agua", atk3);
		Pokemon c3 = new Pokemon("Charmander", 41, "Fogo", atk2);
		Pokemon c4 = new Pokemon("Pidgey", 20, "Fogo", atk1);
		Pokemon c5 = new Pokemon("Magikarp", 100, "Agua", atk4);
		Pokemon c6 = new Pokemon("Caterpie", 90, "Grama", atk3);

		Pokemon b1 = new Pokemon("Moltres", 50, "Fogo", atk3);
		Pokemon b2 = new Pokemon("Articuno", 69, "Agua", atk1);
		Pokemon b3 = new Pokemon("Zapdos", 2, "Grama", atk4);
		Pokemon b4 = new Pokemon("Mewtwo", 30, "Fogo", atk4);
		Pokemon b5 = new Pokemon("Mew", 14, "Grama", atk1);
		Pokemon b6 = new Pokemon("Metapod", 200, "Grama", atk2);
		
		Pokemon[] c = {c1, c2, c3, c4, c5, c6};
		Pokemon[] b = {b1, b2, b3, b4, b5, b6};
		
		Treinador ash = new Treinador("Ash", c, 6);
		Treinador gary = new Treinador("Gary", b, 6);
			
		Evento ataque1 = new Atacar(ash, gary, 1);
		Evento ataque2 = new Atacar(gary, ash, 2);
		EventSet.executa_rodada(ataque1, ataque2);
		
		Evento troca1 = new Trocar(ash, gary, 3);
		Evento ataque3 = new Atacar(gary, ash, 4);
		EventSet.executa_rodada(troca1, ataque3);
		
		Evento troca2 = new Trocar(ash, gary, 2);
		Evento ataque4 = new Atacar(gary, ash, 3);
		EventSet.executa_rodada(troca2, ataque4);
		
		Evento item1 = new Item(gary, ash, 2);
		Evento item2 = new Item(ash, gary, 2);
		EventSet.executa_rodada(item1,item2);
		
		// Dois ataques com diferentes prioridades entre si - ataque6.prioridade < ataque5.prioridade - ataque6 vem primeiro
		Evento ataque5 = new Atacar(ash, gary, 2);
		Evento ataque6 = new Atacar(gary, ash, 1);
		EventSet.executa_rodada(ataque5, ataque6);
		
		Evento ataque7 = new Atacar(ash,gary,2);
		Evento troca3 = new Trocar(gary, ash, 2);
		EventSet.executa_rodada(ataque7	, troca3);
		
		Evento ataque8 = new Atacar(ash,gary,2);
		Evento troca4 = new Trocar(gary, ash, 1);
		EventSet.executa_rodada(ataque8, troca4);
		
		Evento ataque9 = new Atacar(ash,gary,2);
		Evento ataque10 = new Atacar(gary,ash,3);
		EventSet.executa_rodada(ataque9, ataque10);
		
		Evento troca5 = new Trocar(ash, gary, 1);
		Evento ataque11 = new Atacar(gary, ash, 4);
		EventSet.executa_rodada(troca5, ataque11);		

		Evento troca6 = new Trocar(ash, gary, 2);
		Evento item3 = new Item(gary, ash, 2);
		EventSet.executa_rodada(troca6, item3);	
		
		//Mesmo que o Articuno tenha sido ordenado para usar o ataque 3, ele não executa tal ação 
		// pois morre com o ataque de seu oponente antes de consguir atacar
		Evento ataque12 = new Atacar(ash, gary, 4);
		Evento ataque13 = new Atacar(gary, ash, 3);
		EventSet.executa_rodada(ataque12, ataque13);
		
		// Ash foge da batalha, portanto Gary ganhou
		Evento fuga = new Run(ash, gary);
		Evento ataque14 = new Atacar(gary, ash, 1);
		EventSet.executa_rodada(fuga, ataque14);
		
		
		//Segue um caso em que não sobram pokemons vivos de um treinador
		Pokemon pichu = new Pokemon("Pichu", 15, "Agua", atk1);
		Pokemon dig = new Pokemon("Digglet", 17, "Fogo", atk3);
		
		Pokemon[] g = {pichu, null, null, null, null, null};
		Pokemon[] s = {dig, null, null, null, null, null};
		
		Treinador garcia = new Treinador("Garcia", g, 1);
		Treinador sussu = new Treinador("Sussu", s, 1);
		
		Evento ataque15 = new Atacar(garcia, sussu, 1);
		Evento ataque16 = new Atacar(sussu, garcia, 2);
		EventSet.executa_rodada(ataque15, ataque16);
		
		
		Pokemon s1 = new Pokemon("Bulbasaur", 50, "Grama", atk1);
		Pokemon s2 = new Pokemon("Squirtle", 32, "Agua", atk3);
		Pokemon s3 = new Pokemon("Charmander", 41, "Fogo", atk2);
		Pokemon s4 = new Pokemon("Pidgey", 20, "Fogo", atk1);
		Pokemon s5 = new Pokemon("Magikarp", 100, "Agua", atk4);
		Pokemon s6 = new Pokemon("Caterpie", 90, "Grama", atk3);

		Pokemon d1 = new Pokemon("Moltres", 50, "Fogo", atk3);
		Pokemon d2 = new Pokemon("Articuno", 69, "Agua", atk1);
		Pokemon d3 = new Pokemon("Zapdos", 2, "Grama", atk4);
		Pokemon d4 = new Pokemon("Mewtwo", 30, "Fogo", atk4);
		Pokemon d5 = new Pokemon("Mew", 14, "Grama", atk1);
		Pokemon d6 = new Pokemon("Metapod", 200, "Grama", atk2);
		
		Pokemon[] selvagens = {s1, s2, s3, s4, s5, s6, d1, d2, d3, d4, d5, d6};
		PokeSet.add(selvagens, 12);
		//cria mapa
		criaMapa();
		//Os pokemons de ash continuam com a vida de depois de sua batalha com gary
		//E significa estrada no mapa, nao aparecem pokemons ai
		//G significa grama
		//T é o próprio treinador ash
		PokeSet.anda(ash, 0, 0, m);
		
		//Evento fugir1 = new Run(ash, gary);
		//EventSet.executa_rodada(ataque1, fugir1);
		
	}	
}