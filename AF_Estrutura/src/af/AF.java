
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package af;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class AF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int escolha = 1, opcao = 1;
        Fila F = new Fila(20);
        Tree tree = new Tree();
        Tree ArvoreGato = new Tree();
        Tree ArvoreCachorro = new Tree();
        ListaEncadeada L = new ListaEncadeada();

        while (escolha != 0) {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("--- PETSHOP ---\n"
                    + "1- Registrar pet \n" //Fila registra nome, raça e especie do animal
                    + "2- Atender pet \n" //Remove o primeiro da Fila e as informações
                    + "3- Organizar os nomes dos pets\n" //Usando arvore binaria para organizar os pets em ordem alfabetica
                    + "4- Pets registrados\n" //2 Árvores binária para separar gato e cachorro, deixando em ordem alfabética
                    + "0- Para sair"
            ));

            switch (escolha) {
                case 1:
                    String especie = JOptionPane.showInputDialog("Digite a espécie do animal:");
                    String raca = JOptionPane.showInputDialog("Digite a raça do animal:");
                    String nome = JOptionPane.showInputDialog("Digite o nome do animal:");

                    F.enfileirar(nome);
                    tree.insert(nome, tree.root);

                    if (especie.equalsIgnoreCase("cachorro")) {
                        ArvoreCachorro.insert(nome, ArvoreCachorro.root);
                    } else if (especie.equalsIgnoreCase("gato")) {
                        ArvoreGato.insert(nome, ArvoreGato.root);
                    }

                    L.insereNo_fim(new StringNoSimples("Raca: " + raca + ", Especie: " + especie));
                    JOptionPane.showMessageDialog(null, "Registro do pet realizado com sucesso!");
                    F.exibeFila();
                    L.exibeLista();
                    break;
                case 2:
                    if (!F.vazia()) {
                        String petRemovido = F.desenfileirar();
                        StringNoSimples infoRemovida = L.primeiro;
                        L.excluiNo(infoRemovida.valor);
                        JOptionPane.showMessageDialog(null, "Pet atendido: " + petRemovido + "\nInformações removidas: " + infoRemovida.valor);
                    } else {
                        JOptionPane.showMessageDialog(null, "A fila está vazia. Não há pets para atender.");
                    }
                    break;
                case 3:
                    System.out.println("Ordem alfabetica de animais:");
                    tree.inOrder(tree.root);
                    break;
                case 4:
                    while (opcao != 0) {
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("---PETS---\n"
                                + "1- Cachorros\n"
                                + "2- Gatos\n"
                                + "0- Voltar para o menu"
                        ));
                        switch (opcao) {
                            case 1:
                                System.out.println("Cachorros registrados: ");
                                ArvoreCachorro.inOrder(ArvoreCachorro.root);
                                break;
                            case 2:
                                System.out.println("Gatos registrados: ");
                                ArvoreGato.inOrder(ArvoreGato.root);
                                break;
                            case 0:
                                break;
                        }
                    }

                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;

            }

        }
    }
}
