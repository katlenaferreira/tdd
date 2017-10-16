
public class Pilha {

	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo] ;
	}

	public boolean estaVazia() {
		return quantidade == 0;
	}

	public int tamanho() {
		return quantidade;
	}

	public void empilha(Object elemento) {
		if(quantidade == elementos.length)
			throw new pilhaCheiaException("Não é possivel adicionar mais elementos!");
			this.elementos[quantidade] = elementos;
			quantidade++;
	}

	public Object topo() {
		return elementos[quantidade];
	}

	public Object desempilha() {
		if(estaVazia())
			throw new PilhaVaziaException("Não é possivel desempilhar!");
		
		Object topo = topo();
		quantidade--;
		return topo;
		
		
		
	}

}
