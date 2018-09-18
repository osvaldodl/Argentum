package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negociacao(double preco, int quantidade, Calendar data) {		
		super();
		if (data == null) {
			throw new IllegalArgumentException("data nao pode ser nula");
			}
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
		
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
		
	public double getVolume() {
		return preco * quantidade;
	}

	public Calendar getData() {
		return (Calendar) this.data.clone();
		}
	
	


}
