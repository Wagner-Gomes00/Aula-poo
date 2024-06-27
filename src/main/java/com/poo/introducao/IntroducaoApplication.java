package com.poo.introducao;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		//new Lista04() .FechamentoDeVendas();

		new Lista04() .ListaDeCompras();

		//Lista03 lista3 = new Lista03();
		//lista3.exerci7();
		

	}

}
