package org.cc16;


public class ListaEncadeada {
	private long valor;
	private ListaEncadeada prox = null;
	private ListaEncadeada ant = null;
	private long indice = 0;
	private long sum = 0;

	public long getValor(){
		return valor;
	}
	public void setValor(long valor){
            this.valor = valor;
        }

	public ListaEncadeada consultaIndice(long ind){
		ListaEncadeada lista = this;
		while(lista != null ){
			if(lista.indice == ind)
				return lista;
			lista = lista.prox;
		}
		return null;
	}

	public int getQuantidadeNos(){
	    ListaEncadeada lista = this;
	    int n = 0;
	    while(lista != null){
	        n++;
	        lista = lista.prox;
        }
        return n;
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

	public long getSomatorio(){
		return this.getUltimoNo().sum;
	}
	
	public void criarNo(long valor){
		ListaEncadeada lista = this;
		while(lista.prox != null){
			lista = lista.prox;
		}
		lista.prox = new ListaEncadeada(valor);
		lista.prox.ant = lista;
		lista.prox.indice = lista.indice + 1;
		lista.prox.sum += lista.sum;
	}
	
	public ListaEncadeada(long valor){ 		
		this.valor = valor;
		this.prox = null;
		this.ant = null;
		this.sum = valor;

	}
}
