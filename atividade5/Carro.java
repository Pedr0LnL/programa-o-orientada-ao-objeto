package atividade5;

class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }
}