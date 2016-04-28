package Jogo;

class EventSet {
	static private Evento[] events = new Evento[4];
	static private int index = 0;
	static private int next = 0;
	static Treinador a;
	static Treinador b;
	
	static public void add(Evento e) {
		events[index++] = e;
	}

	static public Evento getNext() {
		return events[next++];
	}

	static public void removeCurrent() {
		events[next] = null;
	}
	
	static public void ordenaEvento(){
		Evento aux = null;
		if ( events[0].prioridade > events[1].prioridade ){
			aux = events[0];
			events[0] = events[1];
			events[1] = aux;
		}
	}
	
	static public void executa_rodada (Evento e1, Evento e2 ){
		add(e1);
		add(e2);
		System.out.println();
		System.out.println( e1.ator.p[0].nome + "    HP: "+e1.ator.p[0].hp);
		System.out.println( e2.ator.p[0].nome + "    HP: "+e2.ator.p[0].hp);
		ordenaEvento();
		
		while ( next < 2){
			events[next].executar();
			if(events[next].prioridade == 0){
				break;
			}
			if(verificaPerdeu(events[next].alvo)){
				System.out.print("O treinador "+events[next].alvo.nome+" não tem mais pokemons vivos, portanto foi derrotado!");
				System.out.println(" O treinador "+events[next].ator.nome+" é o vencedor!!!");
				break;
			}
			if(verificaPerdeu(events[next].ator)){
				System.out.print("O treinador "+events[next].ator.nome+" não tem mais pokemons vivos, portanto foi derrotado!");
				System.out.println(" O treinador "+events[next].alvo.nome+" é o vencedor!!!");
				break;
			}
			if(events[next].alvo.p[0].hp == 0){
				//Se o pokemon do oponente acabou de morrer, nao executo um ataque do pokemon morto
				break;
			}
			next++;
		}
		next = 0;
		index = 0;
	}

	public static boolean verificaPerdeu(Treinador t) {
		if(t == null)
			return false;
		for(int indice_p = 0; indice_p < 6; indice_p++){
			if(t.p[indice_p] == null)
				continue;
			if(t.p[indice_p].hp > 0)
				return false;
		}
		return true;
	}
}
