package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("dev")
@Qualifier("email")
@Component
public class NotificadorEmailMock implements Notificador{
	
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {		
		System.out.printf("Mock: Notificando seria enviada para %s através do email %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	

}

