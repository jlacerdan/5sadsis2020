package template.atividade;

public class CompraLojaFisica extends Compra {

    @Override
    public void selecionarItem() {
        System.out.println("Item foi selecionado. - Loja Física");
    }

    @Override
    public void informarEndereco() {
        System.out.println("Endereço foi selecionado. - Loja Física");
    }

    @Override
    public void escolherFormaPagamento() {
        System.out.println("Forma de pagamento foi selecionada. - Loja Física");
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento foi realizado. - Loja Física");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Item saiu para entrega. - Loja Física");
    }
}
