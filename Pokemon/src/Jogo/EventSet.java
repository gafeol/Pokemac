package Jogo;

class EventSet {
	private Evento[] events = new Evento[2];
	private int index = 0;
	private int next = 0;
	
	
	public void add(Evento e) {
		events[index++] = e;
	}

	public Evento getNext() {
		return events[next++];
	}

	public void removeCurrent() {
		events[next] = null;
	}
	
	public void ordenaEvento(){
		Evento aux = null;
		if ( events[0].prioridade > events[1].prioridade )
			aux = events[0];
			events[0] = events[1];
			events[1] = aux;
	}
	
	public void executa_rodada (){
		while ( next!= 2){
			events[next].executa;
		}
	}
	
}
