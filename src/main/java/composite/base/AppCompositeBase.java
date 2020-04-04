package composite.base;

public class AppCompositeBase {

	public static void main(String[] args) {
//		PilhaNormal pilhaNormal = new PilhaNormal(0.1D);
//		PilhaAlcalina pilhaAlcalina = new PilhaAlcalina(0.1D);
		GeradorDeEnergiaNuclearAdapter geradorDeEnergiaNuclear = new GeradorDeEnergiaNuclearAdapter(new GeradorDeEnergiaNuclear(0.1));

		ControleRemoto controleDaSala = new ControleRemoto();

		//controleDaSala.setFornecedorDeEnergia(pilhaAlcalina);
		//controleDaSala.setFornecedorDeEnergia(pilhaNormal);

//		FornecedorComposite composite = new FornecedorComposite();
//		composite.adicionarFornecedor(pilhaAlcalina);
//		composite.adicionarFornecedor(pilhaNormal);

		controleDaSala.setFornecedorDeEnergia(geradorDeEnergiaNuclear);

		controleDaSala.ligar();
		controleDaSala.trocarCanal(72);
		controleDaSala.trocarCanal(25);
		controleDaSala.trocarCanal(72);
		controleDaSala.trocarCanal(25);
		controleDaSala.trocarCanal(72);
		controleDaSala.trocarCanal(25);
		controleDaSala.desligar();

		System.out.println("Fim.");
	}

}