package com.company;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        String word = "CRYPTOGRAPHY";

        RailFence railFence = new RailFence();
        String codedMessage = railFence.code(word, k);
        System.out.println(codedMessage);
        String decodedMessage = railFence.decode(codedMessage, k);
        System.out.println(decodedMessage);
    }
}
