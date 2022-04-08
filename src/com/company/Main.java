package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber a posição na sequência de Fibonacci.");
        int numDigitado = scanner.nextInt();

        int fibo1 = fibonacci(numDigitado);

        System.out.println(fibo1);
        System.out.println(fibo1*3);
        System.out.println(fibo1+1);

        int fibo2 = fibonacci(8);

        System.out.println(fibo2);
    }

    public static void mensagem(int numero){
        System.out.println("Olá, você terminou a função digitando o num:" + numero);
    }

    public static int fibonacci(int num){

        int atual = 1;
        int anterior = 0;

        for(int i = 1; i < num; i++){
            atual = atual + anterior;
            anterior = atual - anterior;
        }
        mensagem(num);
        return anterior;
    }
}
