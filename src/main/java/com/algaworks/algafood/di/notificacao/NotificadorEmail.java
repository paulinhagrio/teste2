package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("prod")
@Qualifier("email")
@Component
public class NotificadorEmail implements Notificador{
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {		
		System.out.printf("Notificando %s através do email %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
	
	

}

