package org.example;

import java.util.Map;

public class SnakesLadders {
    Player player1 = new Player();
    Player player2 = new Player();

    private final Map<Integer, Integer> snakeLadderMap = Map.ofEntries(
            Map.entry(2, 38),
            Map.entry(7, 14),
            Map.entry(8,31),
            Map.entry(15, 26),
            Map.entry(16, 6),
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
        return "";
    }

    public void movePlayer(Player player, int moveDist){
        int newPos = player.move(moveDist);

        player.setPos(snakeLadderMap.getOrDefault(newPos, newPos));
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}