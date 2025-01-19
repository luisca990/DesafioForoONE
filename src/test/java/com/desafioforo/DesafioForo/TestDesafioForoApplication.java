package com.desafioforo.DesafioForo;

import org.springframework.boot.SpringApplication;

public class TestDesafioForoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DesafioForoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
