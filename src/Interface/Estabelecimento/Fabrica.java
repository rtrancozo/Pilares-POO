package Interface.Estabelecimento;

import Interface.Impressoras.Deskjet;
import Interface.Impressoras.Impressora;
import Interface.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        em.copiar();
        em.imprimir();
        em.Digitalizar();




    }
}
