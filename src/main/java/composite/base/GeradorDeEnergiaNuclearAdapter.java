package composite.base;

public class GeradorDeEnergiaNuclearAdapter implements FornecedorDeEnergia {

    private GeradorDeEnergiaNuclear geradorDeEnergiaNuclear;

    public GeradorDeEnergiaNuclearAdapter(GeradorDeEnergiaNuclear geradorDeEnergiaNuclear) {
        this.geradorDeEnergiaNuclear = geradorDeEnergiaNuclear;
    }

    @Override
    public double fornecer() {
        return geradorDeEnergiaNuclear.energizar();
    }
}
