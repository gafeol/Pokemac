package Jogo;

public class Main{
	public static void main (String[] args){
		Ataque a1 = new Ataque("asd", 1, 1);
		Ataque a2 = new Ataque("asadsd", 2, 1);
		Ataque a3 = new Ataque("asdssdad", 11, 14);
		Ataque a4 = new Ataque("dasagfs", 51, 11);
		
		Pokemon p1 = new Pokemon("a", 11231, "Fogo", a1, a2, a3, a4);
		Pokemon p2 = new Pokemon("b", 11231, "Agua", a1,a2, a3, a4);
		Pokemon p3 = new Pokemon("c", 11231, "Agua", a1, a2, a3, a4);
		Pokemon p4 = new Pokemon("d", 11231, "Fogo", a1, a2, a3, a4);
		Pokemon p5 = new Pokemon("e", 11231, "Grama", a1, a2, a3, a4);
		Pokemon p6 = new Pokemon("bostao", 11231, "Fogo", a1, a2, a3, a4);

		Pokemon[] p = {p1, p2, p3, p4, p5, p6};
		Treinador ash = new Treinador("ash", p, 6);
		Treinador gary = new Treinador("gai", p, 6);

		Evento troca1 = new Trocar(ash, 3);
		Evento troca2 = new Trocar(gary, 2);
		//Arrumar EventSet
		//Testar Fugir
		//Testar Item
		((Trocar)troca1).executar();
		((Trocar)troca2).executar();
		Evento ataque1 = new Atacar(ash, gary, p1.a1);
		((Atacar)ataque1).executar();

	}	
}