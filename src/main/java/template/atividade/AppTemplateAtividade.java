package template.atividade;

public class AppTemplateAtividade {
    public static void main(String[] args) {
        CompraLojaVirtual compraVirtual = new CompraLojaVirtual();
        compraVirtual.processarCompra();

        CompraLojaFisica compraLojaFisica = new CompraLojaFisica();
        compraLojaFisica.processarCompra();
    }
}
