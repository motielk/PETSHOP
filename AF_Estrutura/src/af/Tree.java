/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af;

import af.Node;

/**
 *
 * @author bruno
 */
public class Tree {

    Node root = null;                                           // Nó pai, ou raíz

    void insert(String info, Node place) {                      // algoritmo para inserir uma informação
        if (place == null) {                                    // Se o local está vazio, então a árvore está vazia
            root = new Node(info);                              // e o root vai receber o novo nó
            System.out.print(" " + info);                       // Imprime a informação inserida
        } else if (info.compareToIgnoreCase(place.info) < 0) { // Senão, se a informação é menor do que a do local
            if (place.left == null) {                           // Se o filho da esquerda está vazio
                place.left = new Node(info);                    // Então insere à esquerda o novo nó
                System.out.print(" " + info);                   // Imprime a informação inserida
            } else {                                            // São, se não for vazio
                insert(info, place.left);                  // Pula para o filho à esquerda usando a recursividade
            }
        } else if (info.compareToIgnoreCase(place.info) > 0) { // Senão, se a informação é maior que a do local
            if (place.right == null) {                          // Se o filho à direita está vazio
                place.right = new Node(info);                   // Insere a informação em um novo nó à direita
                System.out.print(" " + info);                   // e imprime a informação
            } else {                                            // Senão, se o nó à direita não está vazio
                insert(info, place.right);                 // Pula para o filho à direita usando a recursividade
            }
        }
    }

    void preOrder(Node place) {                                 // Algoritmo de navegação em pré ordem
        System.out.print(" " + place.info);                     // Primeiro imprime a informação do nó
        if (place.left != null) {                               // Se o filho à esquerda não está vazio
            preOrder(place.left);                          // Pula para o filho à esquerda pela recursividade
        }
        if (place.right != null) {                              // Se filho à direita não está vazio
            preOrder(place.right);                         // Pula para o filho à direita pela recursividade
        }
    }

    void inOrder(Node place) {                                  // Algoritmo de navegação em ordem
        if (place.left != null) {                               // Se o filho à esquerda não está vazio
            inOrder(place.left);                           // Pula para o filho à esquerda pela recursividade
        }
        System.out.print(" " + place.info);                     // Depois imprime a informação do nó
        if (place.right != null) {                              // Se filho à direita não está vazio
            inOrder(place.right);                          // Pula para o filho à direita pela recursividade
        }
    }

    void postOrder(Node place) {                                // Algoritmo de navegação em pós ordem
        if (place.left != null) {                               // Se o filho à esquerda não está vazio
            postOrder(place.left);                         // Pula para o filho à esquerda pela recursividade
        }
        if (place.right != null) {                              // Se filho à direita não está vazio
            postOrder(place.right);                        // Pula para o filho à direita pela recursividade
        }
        System.out.print(" " + place.info);                     // Por último, imprime a informação do nó
    }
}
