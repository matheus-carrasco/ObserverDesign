package com.pattern.observer.model;

import java.math.BigDecimal;

import com.pattern.observer.observer.Observer;

public class Gerente implements Observer {

	private String name;
	
	public Gerente() {}
	
	public Gerente(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update(Estoque estoque) {
		BigDecimal valor = estoque.getValor();
		BigDecimal limite = new BigDecimal("1000.0");
		if(valor.compareTo(limite) > 0) {
			System.out.println("Gerente " + name + ": notificação de produto em estoque com "
					+ "valor acima de: R$" + estoque.getValor());
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
