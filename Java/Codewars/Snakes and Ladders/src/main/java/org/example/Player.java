package org.example;

public class Player {
    private int pos = 0;

    public int move(int num) {
        pos += num;

        if (pos > 100) {
            pos = 100 - (pos - 100);
        }

        return pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
