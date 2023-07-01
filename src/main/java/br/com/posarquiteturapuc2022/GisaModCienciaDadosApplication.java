package br.com.posarquiteturapuc2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class GisaModCienciaDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GisaModCienciaDadosApplication.class, args);
	}
	
	/*
	 * Gerar relatorios de quantos associado e prestadores por UF
	 *  
	 */

}
