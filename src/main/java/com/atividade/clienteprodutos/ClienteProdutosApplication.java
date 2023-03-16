package com.atividade.clienteprodutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClienteProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteProdutosApplication.class, args);
	}

	@GetMapping("client")
	public Client setClient() {
		Client client = new Client("Samuel", 14);
		client.setProduct(new Product("Carro", 0));
		client.setProduct(new Product("Bicicleta", 0));
		client.setProduct(new Product("Moto", 0));
		return client;
	}

	@GetMapping("product")
	public Product setProduct() {
		return new Product("Carro", 0);
	}


}
