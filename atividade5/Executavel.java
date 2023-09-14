package atividade5;
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a marca do veículo:");
            String marca = scanner.nextLine();

            System.out.println("Digite o modelo do veículo:");
            String modelo = scanner.nextLine();

            System.out.println("Digite o ano de fabricação do veículo:");
            int ano = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Digite o tipo de veículo (Carro, Moto ou Bicicleta):");
            String tipo = scanner.nextLine();

            Veiculo veiculo;

            switch (tipo.toLowerCase()) {
                case "carro":
                    System.out.println("Digite o número de portas do carro:");
                    int numPortas = scanner.nextInt();
                    veiculo = new Carro(marca, modelo, ano, numPortas);
                    break;
                case "moto":
                    System.out.println("Digite a cilindrada da moto:");
                    int cilindradas = scanner.nextInt();
                    veiculo = new Moto(marca, modelo, ano, cilindradas);
                    break;
                case "bicicleta":
                    System.out.println("Digite o número de marchas da bicicleta:");
                    int numMarchas = scanner.nextInt();
                    veiculo = new Bicicleta(marca, modelo, ano, numMarchas);
                    break;
                default:
                    System.out.println("Tipo de veículo inválido. Encerrando programa.");
                    return;
            }

            System.out.println("\nInformações do Veículo:");
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano de Fabricação: " + veiculo.getAnoFabricacao());

            if (veiculo instanceof Carro) {
                System.out.println("Número de Portas: " + ((Carro) veiculo).getNumPortas());
            } else if (veiculo instanceof Moto) {
                System.out.println("Cilindradas: " + ((Moto) veiculo).getCilindradas());
            } else if (veiculo instanceof Bicicleta) {
                System.out.println("Número de Marchas: " + ((Bicicleta) veiculo).getNumMarchas());
            }

            System.out.println("\nEscolha a ação (1 para acelerar, 2 para frear):");
            int acao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (acao == 1) {
                veiculo.acelerar();
            } else if (acao == 2) {
                veiculo.frear();
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
