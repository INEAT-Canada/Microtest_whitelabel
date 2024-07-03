package com.projetx.ineat.test1;

import org.springframework.boot.SpringApplication;

public class TestTest1Application {

	public static void main(String[] args) {
		SpringApplication.from(Test1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
