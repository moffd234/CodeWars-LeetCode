package org.example;

public class Solution {

    public static int isSolved(int[][] board) {

        // Check diagonals
        if(board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return board[0][0];
        }

        if(board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            return board[0][2];
        }


        // Check vertical and horizontal
        for(int i = 0; i < 3; i++){
            // All in the row match
            if(board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]){
                return board[i][0];
            }

            // All in the col match
            if(board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]){
                return board[0][i];
            }
        }

        if(isFull(board)){
            return 0;
        }

        return -1;
    }

    private static boolean isFull(int[][] board){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(board[i][j] == 0){
                    return false;
                }

            }
        }

        return true;
    }

}
