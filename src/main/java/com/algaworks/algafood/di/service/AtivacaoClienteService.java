package com.algaworks.algafood.di.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;



//@Component
public class AtivacaoClienteService {
	
	@Qualifier("email")
	@Autowired
	private Notificador notificador;	
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT" + notificador);
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
		
		
	public void ativar(Cliente cliente) {		
		cliente.ativar();	
		
		
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
				
				
	}

}
