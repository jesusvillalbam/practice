package com.test3.demo.servicio.impl;

import org.springframework.stereotype.Service;

import com.test3.demo.servicio.TestServicio;

@Service
public class TestServicioImpl implements TestServicio{
	
	private int suma = 0;
	
	@Override
	public Integer sumar() {
		suma = 1+2;
		return suma;
	}
	
}
