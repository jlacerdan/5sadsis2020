package composite.base;

public class PilhaNormal implements FornecedorDeEnergia {

	private double cargaDisponivel;

	public PilhaNormal(double cargaDisponivel) {
		this.cargaDisponivel = cargaDisponivel;
	}

	@Override
	public double fornecer() {
		if (cargaDisponivel > 0D) {
			System.out.println("PilhaNormal fornecendo energia....");
			cargaDisponivel = cargaDisponivel - 0.1D;
			return 0.1;
		}
		System.out.println("PilhaNormal energia esgotada... Nada foi feito");
		return 0.0D;
	}

}