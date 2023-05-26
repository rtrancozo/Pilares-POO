package Pilares_da_POO;



public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("4578862");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("15468946");
        z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }

}
