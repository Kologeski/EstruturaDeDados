
public class Lista {
	private Nodo inicio;
	
	//Cria a lista
	public Lista() {
		this.inicio = null;
	}
	
	//Devolve o ponteiro para o in�cio da lista (ponteiro para o nodo inicial)
	public Nodo getInicio() {
		return inicio;
	}
	
	//Insere no final da lista 
	public void insereFinal(int valor){
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);
		
		if(this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = inicio;
			//Percorre a lista, at� o fim, a partir do primeiro nodo
			while(aux.getProximo() != null) 
				aux = aux.getProximo();
			aux.setProximo(novo);
		}
	}
	

	//Insere nodo na lista vazia
	/*public void insereListaVazia(int valor){
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);
		
		this.inicio = novo;
	}*/
	
	public void RemoveFinal() {
		Nodo aux;
		if(this.inicio != null)
			//Se s� tem um nodo na lista, remove este
			if(this.inicio.getProximo()==null)
				this.inicio = null;
			else {
				aux = inicio;
				//Percorre a lista, at� o fim, a partir do primeiro nodo
				while(aux.getProximo().getProximo() != null) 
					aux = aux.getProximo();
				aux.setProximo(null);	
			}
	}
	

	//Imprime a lista
	public void print(){
		if(this.inicio == null)
			System.out.println("Lista vazia!");
		else
			for(Nodo aux = this.inicio; aux != null; aux = aux.getProximo())
				System.out.println(aux.getValor());
	}
}
