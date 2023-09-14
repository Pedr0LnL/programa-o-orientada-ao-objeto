package atividade5;

class Bicicleta extends Veiculo {
    private int numMarchas;

    public Bicicleta(String marca, String modelo, int anoFabricacao, int numMarchas) {
        super(marca, modelo, anoFabricacao);
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }
}