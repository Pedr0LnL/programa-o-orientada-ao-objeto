package atividade3;

import java.util.ArrayList;
import java.util.Scanner;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}

class Estoque {
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        ItemEstoque item = new ItemEstoque(nome, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getNome().equalsIgnoreCase(nome)) {
                itens.remove(i);
                return;
            }
        }
        System.out.println("Item não encontrado no estoque.");
    }

    public void listarItens() {
        System.out.println("Itens em estoque:");
        for (ItemEstoque item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int quantidade) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.adicionarQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Item não encontrado no estoque.");
    }
}

public class SistemaGerenciamentoEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar Item");
            System.out.println("2 - Remover Item");
            System.out.println("3 - Listar Itens");
            System.out.println("4 - Atualizar Quantidade");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidadeItem = scanner.nextInt();
                    estoque.adicionarItem(nomeItem, quantidadeItem);
                    break;
                case 2:
                    System.out.print("Nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerItem(nomeRemover);
                    break;
                case 3:
                    estoque.listarItens();
                    break;
                case 4:
                    System.out.print("Nome do item a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    estoque.atualizarQuantidade(nomeAtualizar, quantidadeAdicionar);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
