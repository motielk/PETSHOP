/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    String vetor[];

    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new String[tam];
    }

    public boolean vazia() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if (total >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public void enfileirar(String elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
            if (fim >= tamanho) {
                fim = 0;
            }
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public String desenfileirar() {
        String elem;
        if (vazia() == false) {
            elem = String.valueOf(vetor[inicio]);
            System.out.println(elem);
            inicio++;
            if (inicio >= tamanho) {
                inicio = 0;
            }
            total--;
        } else {
            elem = "Fila vazia";
        }
        return elem;
    }

    public void exibeFila() {
        for (int i = inicio; i < fim; i++) {
            System.out.println(" Posição " + i + " Nome " + vetor[i]);
        }
    }
}
