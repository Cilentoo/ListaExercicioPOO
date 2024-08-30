package com.poo.lista;

import com.poo.lista1.Exercicio1;
import com.poo.lista1.Exercicio2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);
		//Exercicio1.resolucao();
		Exercicio2.resolucao();
	}

}
