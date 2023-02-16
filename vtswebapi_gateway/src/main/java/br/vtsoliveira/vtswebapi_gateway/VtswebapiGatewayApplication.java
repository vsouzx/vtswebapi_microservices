package br.vtsoliveira.vtswebapi_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VtswebapiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtswebapiGatewayApplication.class, args);
	}

}
