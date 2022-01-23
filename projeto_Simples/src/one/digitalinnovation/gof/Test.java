package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		System.out.println("*************Singleton*****************");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		System.out.println();
		System.out.println("******************************");
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		System.out.println();
		System.out.println("******************************");
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		System.out.println();
		// Strategy
		System.out.println("************Strategy******************");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		System.out.println();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.sentar();
		robo.mover();
				System.out.println("******************************");
				System.out.println();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.sentar();
		System.out.println("******************************");
		System.out.println();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.sentar();
		robo.sentar();
		robo.mover();
		System.out.println();
		System.out.println("*************Facade*****************");
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Ana Lara", "89903-200");
	}

}
