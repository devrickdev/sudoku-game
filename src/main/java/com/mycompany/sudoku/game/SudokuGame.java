/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sudoku.game;

/**
 *
 * @author Henri
 */
public class SudokuGame {

    public static void main(String[] args) {
        Board board = new Board();
        board.genBoard();
        board.randomEmptys(45);
        board.printBoard();
    }
}
