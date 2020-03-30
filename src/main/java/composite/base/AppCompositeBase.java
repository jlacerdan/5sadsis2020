package composite.base;

public class AppCompositeBase {
	
	public static void main(String[] args) {
		PilhaNormal pilhaNormal = new PilhaNormal();
		PilhaAlcalina pilhaAlcalina = new PilhaAlcalina();
		
		ControleRemoto controleDaSala = new ControleRemoto();
		
		controleDaSala.setFornecedorDeEnergia(pilhaAlcalina);
		controleDaSala.setFornecedorDeEnergia(pilhaNormal);
		
		controleDaSala.ligar();
		controleDaSala.trocarCanal(72);
		controleDaSala.trocarCanal(25);
		controleDaSala.desligar();
		
		System.out.println("Fim.");
	}

}
