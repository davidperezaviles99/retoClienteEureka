package com.reto.ec.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class InfoActuator {
	
	@GetMapping("/info")
	public ResponseEntity<String> actuator(){
		return new ResponseEntity<>("Hola", HttpStatus.OK);
	}

}
