package composite.base;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
    private List<FornecedorDeEnergia> fornecedoresDeEnergia;

    public FornecedorComposite() {
        fornecedoresDeEnergia = new ArrayList<>();
    }

    @Override
    public double fornecer() {
		/*
		for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
			fe.fornecer();
		}
		*/
        fornecedoresDeEnergia.forEach(fe -> fe.fornecer());
        return 0.0;
    }

    public void adicionarFornecedor(FornecedorDeEnergia fornecedor) {
        this.fornecedoresDeEnergia.add(fornecedor);
    }

}