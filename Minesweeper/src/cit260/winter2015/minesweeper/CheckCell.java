/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper;

import java.io.Serializable;

/**
 *
 * @author Keith Banner
 */
public class CheckCell implements Serializable{
    private static final long serialVersionUID = 1L;

    private int row;
    private int column;

    public CheckCell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public CheckCell() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CheckCell other = (CheckCell) obj;
        if (this.row != other.row) {
            return false;
        }
        return this.column == other.column;
    }

    @Override
    public String toString() {
        return "CheckCell{" + "row=" + row + ", column=" + column + '}';
    }
}
