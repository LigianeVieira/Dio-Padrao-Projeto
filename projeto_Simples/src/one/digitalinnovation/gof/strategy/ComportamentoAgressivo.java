package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}
	@Override
	public void sentar() {
		System.out.println("Sentando-se bruscamente..");
	}
}
