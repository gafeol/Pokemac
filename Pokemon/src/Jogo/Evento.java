package Jogo;

abstract public class Evento {
	public int prioridade;
	protected Treinador ator;
	protected Treinador alvo;
	public String acao;
	abstract public void executar();
}
