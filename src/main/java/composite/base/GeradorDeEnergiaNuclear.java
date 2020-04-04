package composite.base;

public class GeradorDeEnergiaNuclear {

    private double cargaDisponivel;

    public GeradorDeEnergiaNuclear(double cargaDisponivel) {
        this.cargaDisponivel = cargaDisponivel;
    }

    public double energizar() {
        if (cargaDisponivel > 0D) {
            System.out.println("PilhaAlcalina fornecendo energia...");
            cargaDisponivel = cargaDisponivel - 0.1D;
            return 0.1;
        }
        System.out.println("PilhaAlcalina energia esgotada... Nada foi feito");
        return 0.0D;
    }
}
