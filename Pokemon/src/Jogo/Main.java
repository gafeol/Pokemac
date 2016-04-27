package Jogo;

public class Main{
	public static void main (String[] args){
		Ataque a1 = new Ataque("asd", 21, 1);
		Ataque a2 = new Ataque("asadsd", 32, 1);
		Ataque a3 = new Ataque("asdssdad", 11, 14);
		Ataque a4 = new Ataque("dasagfs", 51, 11);
		
		Ataque[] a = {a1, a2, a3, a4};
		
		Pokemon a1 = new Pokemon("a", 50, "Fogo", a);
		Pokemon a2 = new Pokemon("b", 11231, "Agua", a);
		Pokemon a3 = new Pokemon("c", 11231, "Agua", a);
		Pokemon a4 = new Pokemon("d", 11231, "Fogo", a);
		Pokemon a5 = new Pokemon("e", 11231, "Grama", a);
		Pokemon a6 = new Pokemon("bostao", 11231, "Fogo", a);

		Pokemon b1 = new Pokemon("a", 50, "Fogo", a);
		Pokemon b2 = new Pokemon("b", 11231, "Agua", a);
		Pokemon b3 = new Pokemon("c", 11231, "Agua", a);
		Pokemon b4 = new Pokemon("d", 11231, "Fogo", a);
		Pokemon b5 = new Pokemon("e", 11231, "Grama", a);
		Pokemon b6 = new Pokemon("bostao", 11231, "Fogo", a);
		
		Pokemon[] aa = {a1, a2, a3, a4, a5, a6};
		Pokemon[] b = {b1, b2, b3, b4, b5, b6};
		
		Treinador ash = new Treinador("ash", a, 6);
		Treinador gary = new Treinador("gai", b, 6);

		
		
		Evento troca1 = new Trocar(ash, 3);
		Evento troca2 = new Trocar(gary, 5);
		//Arrumar EventSet
		
		EventSet.executa_rodada(troca1, troca2, ash, gary);
		
		Evento ataque1 = new Atacar(ash, gary, 1);
		Evento ataque2 = new Atacar(gary, ash, 2);
		EventSet.executa_rodada(ataque1, ataque2, ash, gary);
		
		Evento item1 = new Item(gary, ash, 2);
		Evento item2 = new Item(ash, gary, 2);
		EventSet.executa_rodada(item1,item2, ash, gary);
		
		//Evento fugir1 = new Run(ash, gary);
		//EventSet.executa_rodada(ataque1, fugir1);
		
	}	
}