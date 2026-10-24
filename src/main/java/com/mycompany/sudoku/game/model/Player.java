/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku.game.model;

/**
 *
 * @author Henri
 */
public class Player {

    private String name;
    private boolean hardEnable;
    private int completionCounter;
    private int points;

    public Player(String name, int completionCounter, int points, boolean hardEnable) {
        this.name = name;
        this.completionCounter = completionCounter;
        this.points = points;
        this.hardEnable = hardEnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompletionCounter() {
        return completionCounter;
    }

    public void setCompletionCounter(int completionCounter) {
        this.completionCounter = completionCounter;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isHardEnable() {
        return hardEnable;
    }

    public void setHardEnable(boolean hardEnable) {
        this.hardEnable = hardEnable;
    }

}
