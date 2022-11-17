package dio.digitalinnovetion.gof;

import dio.digitalinnovetion.gof.facade.Facade;
import dio.digitalinnovetion.gof.strategy.Comportamento;
import dio.digitalinnovetion.gof.strategy.ComportamentoAgressivo;
import dio.digitalinnovetion.gof.strategy.ComportamentoDefensivo;
import dio.digitalinnovetion.gof.strategy.ComportamentoNormal;
import dio.digitalinnovetion.gof.strategy.Robo;

public class Test {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "2323534322");

	}
}
