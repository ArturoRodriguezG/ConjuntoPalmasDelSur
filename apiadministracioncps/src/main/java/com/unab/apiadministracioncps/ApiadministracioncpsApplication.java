package com.unab.apiadministracioncps;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiadministracioncpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiadministracioncpsApplication.class, args);
		System.out.println("Correteando API Java...!!!");

	}
	@Bean 
	public ModelMapper modelMapper(){
		ModelMapper modelMapper= new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
