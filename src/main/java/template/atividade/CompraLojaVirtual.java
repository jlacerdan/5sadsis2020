package template.atividade;

public class CompraLojaVirtual extends Compra {

    @Override
    public void selecionarItem() {
        System.out.println("Item foi selecionado. - Loja Virtual");
    }

    @Override
    public void informarEndereco() {
        System.out.println("Endereço foi selecionado. - Loja Virtual");
    }

    @Override
    public void escolherFormaPagamento() {
        System.out.println("Forma de pagamento foi selecionada. - Loja Virtual");
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento foi realizado. - Loja Virtual");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Item saiu para entrega. - Loja Virtual");
    }
}
