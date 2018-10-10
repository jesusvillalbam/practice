package com.test3.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test3.demo.servicio.TestServicio;

@RestController
public class TestController {
	
	@Autowired
	TestServicio testServicio;
	
	@RequestMapping(path="hola", method= RequestMethod.GET)
	public ResponseEntity<Integer> Hola() {
		Integer result = testServicio.sumar();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
