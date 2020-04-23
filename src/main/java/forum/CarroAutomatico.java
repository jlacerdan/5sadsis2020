package forum;

import java.util.HashSet;
import java.util.Set;

public class CarroAutomatico {
    private Set<CarroListener> listeners = new HashSet<>();
    private Marcha marchaAtual = Marcha.PARADO;

    public void dirigir() {
        marchaAtual = Marcha.DIRIGINDO;

        for (CarroListener listener : listeners) {
            listener.carroColocadoEmMovimento();
        }
    }

    public void engatarRe() {
        marchaAtual = Marcha.RE;

        for (CarroListener listener : listeners) {
            listener.carroColocadoEmRe();
        }
    }

    public void parar() {
        marchaAtual = Marcha.PARADO;

        for (CarroListener listener : listeners) {
            listener.carroFoiParado();
        }
    }

    public void adicionarListener(CarroListener listener) {
        listeners.add(listener);
    }

    enum Marcha {
        PARADO("P"),
        RE("R"),
        DIRIGINDO("D");

        public String marcha;

        Marcha(String marcha) {
            this.marcha = marcha;
        }
    }
}
