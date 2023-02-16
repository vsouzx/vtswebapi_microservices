package br.vtsoliveira.vtswebapi_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VtswebapiConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtswebapiConfigserverApplication.class, args);
	}

}
