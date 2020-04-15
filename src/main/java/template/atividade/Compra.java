package template.atividade;

public abstract class Compra {

    public final void processarCompra() {
        selecionarItem();
        informarEndereco();
        escolherFormaPagamento();
        realizarPagamento();
        realizarEntrega();
    }

    public abstract void selecionarItem();
    public abstract void informarEndereco();
    public abstract void escolherFormaPagamento();
    public abstract void realizarPagamento();
    public abstract void realizarEntrega();


}
