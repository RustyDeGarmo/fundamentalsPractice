package chapter8;

/*
 * This program draws a classic tic-tac-toe board and lets two players 
 * play the game.
 */

import java.util.*;

public class TicTacToe {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        //create the board and fill it with empty spaces
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++){
            Arrays.fill(board[i], ' ');
        }
        //initialize the player and turn counter
        char player = 'X';
        int turn = 1;
        int playAgain = 1;

        //establish game loop
        while(playAgain != 0){
            while(!gameOver(board)){
            

                if(turn % 2 == 0){
                    player = 'O';
                }else{
                    player = 'X';
                }
    
                displayBoard(board);
                playerTurn(board, player);
    
                turn++;
            }
            System.out.println(turn + " turns played");
            System.out.print("Play again? Enter 0 to end the game ");
            playAgain = input.nextInt();
            //reset the board and counter if the players keep playing
            for(int i = 0; i < board.length; i++){
                Arrays.fill(board[i], ' ');
            }
            turn = 1;
        }
        
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

        //the board is full
        System.out.println("Cat Game. No moves left.");
        return true;
    }

    //display the game board
    static void displayBoard(char[][] board){

        //print the column headers
        System.out.println("    0   1   2");
        //print the top border
        System.out.println("---------------");

        //print the rows
        for(int i = 0; i < board.length; i++){
            System.out.println(i + " | " + board[i][0] + " | " + board[i][1] + 
                " | " + board[i][2] + " |");
            System.out.println("---------------");
        }

        System.out.println();//space
    }

    //prompt a player for input
    static void playerTurn(char[][] board, char player){
        System.out.println("Player " + player + "'s turn");

        
            
        System.out.print("Enter a row: ");
        int row = input.nextInt();
        System.out.print("Enter a column: ");
        int column = input.nextInt();

        if(row > 2 || row < 0 || column < 0 || column > 2){
            System.out.println("Invalid input. Choose between 0 and 2");
            playerTurn(board, player);
        }

        if(board[row][column] != 'X' && board[row][column] != 'O'){
            board[row][column] = player;
        }else{
            System.out.println("That cell is already taken, try again");
            System.out.println();
            playerTurn(board, player);
        }
        System.out.println();
    }
}
