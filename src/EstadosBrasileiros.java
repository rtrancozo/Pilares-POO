public enum EstadosBrasileiros {
    SAO_PAULO ("SP","São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
    PIAUI ("PI", "Piauí", 42),
    MARANHAO ("MA","Maranhão", 45),
    CEARA("CE", "Ceará", 82);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
