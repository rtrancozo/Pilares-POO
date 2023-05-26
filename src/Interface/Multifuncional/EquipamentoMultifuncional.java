package Interface.Multifuncional;

import Interface.Copiadora.Copiadora;
import Interface.Digitalizador.Digitalizador;
import Interface.Impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizador {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void Digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
    }
}
