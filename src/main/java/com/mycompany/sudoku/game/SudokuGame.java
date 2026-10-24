/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sudoku.game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henri
 */
public class SudokuGame {

    public static void main(String[] args) {
        List<List<Integer>> matriz = new ArrayList<>();

        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        matriz.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
         
        System.out.println("------------Sudoku Board------------");
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                System.out.print(matriz.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------Printing[0][1]------------");
        System.out.println(matriz.get(0).get(1));
    }
}
