/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku.game.controller;

import com.mycompany.sudoku.game.model.Board;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Henri
 */
public class TMBoard extends AbstractTableModel {

    private final Board board;

    public TMBoard(Board board) {
        this.board = board;
    }

    @Override
    public int getRowCount() {
        return board.getHeigth();
    }

    @Override
    public int getColumnCount() {
        return board.getWidth();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int valor = board.getMatriz().get(rowIndex).get(columnIndex);
        if (valor == 0) {
            return "";
        }
        return valor;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        int valorOriginal = board.getMatriz().get(rowIndex).get(columnIndex);
        return valorOriginal == 0;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {
            int valor = Integer.parseInt(aValue.toString());
            if (valor >= 1 && valor <= 9) {
                board.getMatriz().get(rowIndex).set(columnIndex, valor);
                fireTableCellUpdated(rowIndex, columnIndex);
            }
        } catch (NumberFormatException e) {
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return " ";
    }
}
