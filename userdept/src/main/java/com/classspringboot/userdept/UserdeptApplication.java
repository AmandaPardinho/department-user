package com.classspringboot.userdept;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //similar ao data annotation do .Net
public class UserdeptApplication {

	@Bean // garante que sempre que a aplicação for executada, a configuração será aplicada
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setSkipNullEnabled(true); //ao usar o ModelMapper, ele não irá sobrescrever os valores nulos
		return mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(UserdeptApplication.class, args);
	}

}
