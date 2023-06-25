/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af;

/**
 *
 * @author bruno
 */
public class Node {

    String info;            // Informação tipo String
    Node left;              // Filho à esquerda
    Node right;             // FIlho à direita

    Node(String info) {     // Inicializa os atributos da classe
        this.info = info;   // Inicializa a informação com o parâmetro recebido
        left = null;        // Inicializa o filho à esquerda como vazio
        right = null;       // Inicializa o filho à direita como vazio
    }

}
