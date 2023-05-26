package Interface.Copiadora;

import Interface.Copiadora.Copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO");
    }
}
