package org.example;

import java.util.Map;

public class SnakesLadders {
    Player player1 = new Player();
    Player player2 = new Player();
    Player currentPlayer = player1;
    boolean isGameOver = false;

    private final Map<Integer, Integer> snakeLadderMap = Map.ofEntries(
            Map.entry(2, 38),
            Map.entry(7, 14),
            Map.entry(8,31),
            Map.entry(15, 26),
            Map.entry(16, 6),
            Map.entry(21, 42),
            Map.entry(28, 84),
            Map.entry(36, 44),
            Map.entry(46, 25),
            Map.entry(49, 11),
            Map.entry(51, 67),
            Map.entry(62, 19),
            Map.entry(64, 60),
            Map.entry(71, 91),
            Map.entry(74, 53),
            Map.entry(78, 98),
            Map.entry(87, 94),
            Map.entry(89, 68),
            Map.entry(92, 88),
            Map.entry(95, 75),
            Map.entry(99, 80));

    public SnakesLadders() {}
    public String play(int die1, int die2) {
        if(isGameOver){
            return "Game over!";
        }

        movePlayer(currentPlayer, die1 + die2);

        if(currentPlayer.getPos() == 100){
            isGameOver = true;
            return getWinner();
        }

        return endTurn(die1, die2);
    }

    private String endTurn(int die1, int die2) {
        if(die1 != die2) {
            if (currentPlayer == player1) {
                currentPlayer = player2;
                return "Player 1 is on square " + player1.getPos();
            }

            currentPlayer = player1;
            return "Player 2 is on square " + player2.getPos();
        }
        if (currentPlayer == player1) {
            return "Player 1 is on square " + player1.getPos();
        }

        return "Player 2 is on square " + player2.getPos();
    }

    public void movePlayer(Player player, int moveDist){
        int newPos = player.move(moveDist);

        player.setPos(snakeLadderMap.getOrDefault(newPos, newPos));
    }

    private String getWinner(){
        if(currentPlayer == player1){
            return "Player 1 Wins!";
        }

        return "Player 2 Wins!";
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }


    public static class Player {
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
}

