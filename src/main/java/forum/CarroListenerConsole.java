package forum;

public class CarroListenerConsole implements CarroListener {

    @Override
    public void carroColocadoEmMovimento() {
        System.out.println("Carro está em movimento");
    }

    @Override
    public void carroFoiParado() {
        System.out.println("Carro está parado");
    }

    @Override
    public void carroColocadoEmRe() {
        System.out.println("Carro está em marcha ré");
    }
}
