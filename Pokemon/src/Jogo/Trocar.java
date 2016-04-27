package Jogo;

class Trocar extends Evento{
	public int indice_pok;
	public Trocar (Treinador t, int ind){
		ator = t;
		indice_pok = ind;
		prioridade = 1;
	}

	public void executar(){
		Treinador t = ator;
		Pokemon paux = null;
		if(t.p[indice_pok].hp <= 0){
			System.out.println("Este Pokemon está morto, escolha outro...");
		}
		System.out.println("O treinador "+t.nome+" trocou seu pokemon "+t.p[0].nome+" pelo pokemon "+t.p[indice_pok].nome);
		paux = t.p[0];
		t.p[0] = t.p[indice_pok];
		t.p[indice_pok] = paux;	
	}
}