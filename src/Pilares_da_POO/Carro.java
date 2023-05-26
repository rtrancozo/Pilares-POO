package Pilares_da_POO;

public class Carro extends Veiculo{



    public void ligar(){
        conferindoCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
     private  void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }
    private void conferindoCambio(){
        System.out.println("Conferindo Câmbio em P");
    }
}
