package composite.base;

public class PilhaAlcalina implements FornecedorDeEnergia {

	private double cargaDisponivel;

	public PilhaAlcalina(double cargaDisponivel) {
		this.cargaDisponivel = cargaDisponivel;
	}

	@Override
	public double fornecer() {
		if (cargaDisponivel > 0D) {
			System.out.println("PilhaAlcalina fornecendo energia...");
			cargaDisponivel = cargaDisponivel - 0.1D;
			return 0.1;
		}
		System.out.println("PilhaAlcalina energia esgotada... Nada foi feito");
		return 0.0D;
	}

}