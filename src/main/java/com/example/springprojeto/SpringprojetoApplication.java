package com.example.springprojeto;

import com.example.springprojeto.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprojetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}
}
