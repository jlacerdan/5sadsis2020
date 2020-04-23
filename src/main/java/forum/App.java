package forum;

public class App {

    public static void main(String[] args) {
        CarroAutomatico carro = new CarroAutomatico();
        CarroListenerConsole carroListenerConsole = new CarroListenerConsole();
        carro.adicionarListener(carroListenerConsole);
        carro.dirigir();
        carro.parar();
        carro.engatarRe();
        carro.parar();
        carro.dirigir();
    }
}
