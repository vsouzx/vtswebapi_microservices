package br.vtsoliveira.vtswebapi_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VtswebapiDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtswebapiDiscoveryApplication.class, args);
	}

}
