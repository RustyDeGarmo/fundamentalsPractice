package chapter8;

/*
 * This program draws a classic tic-tac-toe board and lets two players 
 * play the game.
 */

import java.util.*;

public class TicTacToe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];
        char player = 'X';
        int turn = 1;

        //establish game loop
        while(!gameOver(board)){
            

            if(turn % 2 == 0){
                player = 'O';
            }else{
                player = 'X';
            }

            displayBoard(board);
            playerTurn(board, player, input);

            turn++;
        }
        System.out.println(turn + " turns played");
        input.close();
    }

    //check for game over condition
    static boolean gameOver(char[][] board){
        //check the diagonals
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            System.out.println("X wins");
            return true;
        }else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            System.out.println("O wins");
            return true;
        }else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X'){
            System.out.println("X wins");
            return true;
        }else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O'){
            System.out.println("O wins");
            return true;
        }
        
        //check the rows and columns
        for(int i = 0; i < board[0].length; i++){
            if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X'){
                System.out.println("X wins on row " + i);
                return true;
            }else if(board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O'){
                System.out.println("O wins on row " + i);
                return true;
            }else if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X'){
                System.out.println("X wins on column " + i);
                return true;
            }else if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O'){
                System.out.println("O wins on column " + i);
                return true;
            }
        }

        //check for full board
        for(int i = 0; i < board.length; i++){
            if(board[i][0] != 'X' && board[i][0] != 'O' ||
            board[i][1] != 'X' && board[i][1] != 'O' ||
            board[i][2] != 'X' && board[i][2] != 'O'){
                System.out.println("Game Continues");
                return false;
            }
        }
        System.out.println("Cat Game. No moves left.");
        return true;
    }

    //display the game board
    static void displayBoard(char[][] board){
        
    }

    //prompt a player for input
    static void playerTurn(char[][] board, char player, Scanner input){
        System.out.println("Player " + player + "'s turn");

        
            
        System.out.print("Enter a row: ");
        int row = input.nextInt();
        System.out.print("Enter a column: ");
        int column = input.nextInt();

        if(board[row][column] != 'X' && board[row][column] != 'O'){
            board[row][column] = player;
        }else{
            System.out.println("That cell is already taken, try again");
            System.out.println();
            playerTurn(board, player, input);
        }

        
    }
}
