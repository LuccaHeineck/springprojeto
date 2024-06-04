package com.example.springprojeto;

import com.example.springprojeto.model.DadosSerie;
import com.example.springprojeto.service.ConsumoAPI;
import com.example.springprojeto.service.ConverteDados;
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
		var api = new ConsumoAPI();
		var json = api.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=23c527a2&");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
