package com.test3.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.test3.demo.controlador.TestController;
import com.test3.demo.servicio.TestServicio;
import com.test3.demo.servicio.impl.TestServicioImpl;

@RunWith(MockitoJUnitRunner.class)
public class EjemploTest {

	@Mock
	TestServicio testServicio;

	@InjectMocks
	TestController testController;

	@Test
	public void testVerificarSuma() {
		when(testServicio.sumar()).thenReturn(8);
		assertEquals(HttpStatus.OK, testController.Hola().getStatusCode());
	}

}
