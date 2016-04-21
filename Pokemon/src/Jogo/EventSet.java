package Jogo;

class EventSet {
	static private Evento[] events = new Evento[2];
	static private int index = 0;
	static private int next = 0;
	
	
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
		if ( events[0].prioridade > events[1].prioridade )
			aux = events[0];
			events[0] = events[1];
			events[1] = aux;
	}
	
	static public void executa_rodada (){
		while ( next!= 2){
			if(events[next].prioridade == 0){
				events[next++].executa(events[next].ator, events[next].alvo);
			}
			if(events[next].prioridade == 1){
				events[next++].executa(events[next].ator, );
			}
			if(events[next].prioridade == 2){
				
			}
			else{
				
			}
		}
	}
	
}
