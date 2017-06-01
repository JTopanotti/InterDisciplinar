package org.cc16;


public class ListaEncadeada {
	private int valor;
	private ListaEncadeada prox = null;
	private ListaEncadeada ant = null;
	private int indice = 0;
	private int sum = 0;

	public int getValor(){
		return valor;
	}
	

	public ListaEncadeada consultaIndice(int ind){
		ListaEncadeada lista = this;
		while(lista != null ){
			if(lista.indice == ind)
				return lista;
			lista = lista.prox;
		}
		return null;
	}
	
	public void consultarLista(){
		ListaEncadeada lista = this;
		while(lista != null){
			System.out.println("Indice: " + lista.indice + " | Valor: " + lista.valor);
			lista = lista.prox;
		}
	}

	private ListaEncadeada getUltimoNo(){
		ListaEncadeada lista = this;
		while(lista.prox != null){
			lista = lista.prox;
		}
		return lista;
	}

	public int getSomatorio(){
		return this.getUltimoNo().sum;
	}
	
	public void criarNo(int valor){
		ListaEncadeada lista = this;
		while(lista.prox != null){
			lista = lista.prox;
		}
		lista.prox = new ListaEncadeada(valor);
		lista.prox.ant = lista;
		lista.prox.indice = lista.indice + 1;
		lista.prox.sum += lista.sum;
	}
	
	public ListaEncadeada(int valor){ 		
		this.valor = valor;
		this.prox = null;
		this.ant = null;
		this.sum = valor;

	}
}
