package com.pattern.observer;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
		
		//Teste 1 Valor acima de 1000.00 reais
		BigDecimal valorInicialProduto = new BigDecimal("1100.00");
		Gerente gerente = new Gerente("Matheus Carrasco");
		Estoque estoque = new Estoque("Camiseta", valorInicialProduto, new BigDecimal("0"));
		estoque.attach(gerente);
		estoque.setValor(valorInicialProduto);
		
		System.out.println("---------------------------");
		
		//Teste 2 - Valor abaixo de 1000.00 reais
		valorInicialProduto = new BigDecimal("999.99");
		estoque.setValor(valorInicialProduto);
	}
}
