package com.funcoes;

import java.util.Scanner;

public class Intruções {
    public static void comoJogar(){
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                1 - Escolha sua peça.
                    [X] [O] [0] [U] [C]

                2 - Escolha a peça do computador.
                    [X] [O] [0] [U] [C]

                3 - Voce deve digitar 2 numeros inteiros separados por espaço a sua jogar, onde o primeiro numero e a linha e o segundo e a coluna.
                    exemplo:
                            Jogada linha[2] coluna[3]

                           Coluna:       1     2      3
                           linha 1         |      |
                                     ------+------+------
                           linha 2         |      |   X
                                     ------+------+------
                           linha 3         |      | 
                """);
        System.out.println("Pressione Enter para finalizar...");
        teclado.nextLine();
    }
}
