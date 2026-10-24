/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Henri
 */
public class Board {

    private List<List<Integer>> matriz;
    private Random random;
    private int width;
    private int heigth;

    public void genBoard() {
        for (int i = 0; i < width; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 1; j <= heigth; j++) {
                linha.add(j);
            }
            Collections.shuffle(linha);
            matriz.add(linha);
        }
    }

    public void randomEmptys(int quantidadeZeros) {
        int zerosAdicionados = 0;
        while (zerosAdicionados < quantidadeZeros) {
            int i = random.nextInt(9);
            int j = random.nextInt(9);
            if (matriz.get(i).get(j) != 0) {
                matriz.get(i).set(j, 0);
                zerosAdicionados++;
            }
        }
    }

    public void printBoard() {
        System.out.println("------------Sudoku Board------------");
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                System.out.print(matriz.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("------------Sudoku Board------------");
    }

    public Board() {
        this.matriz = new ArrayList<>();
        this.random = new Random();
        this.width = 9;
        this.heigth = 9;
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

}
