package chapter8;

/*
 * This program tests the methods in TicTacToe
 */

import java.util.*;

public class TestTicTacToe {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        testGameOver();
        testDisplayBoard();
        testPlayerTurn();
        
    }

    public static void testDisplayBoard(){
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        System.out.println();
        System.out.println("Empty Board");
        TicTacToe.displayBoard(board);

        System.out.println();
        System.out.println("row 2 column 0 is X");
        board[2][0] = 'X';
        TicTacToe.displayBoard(board);
        System.out.println();

        System.out.println();
        System.out.println("row 2 column 1 is O");
        board[2][1] = 'O';
        TicTacToe.displayBoard(board);
        System.out.println();
    }

    public static void testPlayerTurn(){
        System.out.println("Testing playerTurn()");
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char player = 'X';

        System.out.println("Choose any cell. All are empty");
        TicTacToe.playerTurn(board, player);
        TicTacToe.displayBoard(board);
        System.out.println();

        board[2][0] = player;

        System.out.println("Choose row 2, column 0. Cell already taken");
        TicTacToe.playerTurn(board, player);
        TicTacToe.displayBoard(board);
        System.out.println();
        System.out.println();
    }

    public static void testGameOver(){
        System.out.println("Testing gameOver()");
        System.out.println("Test One");
        System.out.println("X should win");
        char[][] board = {
            {'X', 'O', 'O'},
            {'O', 'O', 'X'},
            {'X', 'X', 'X'}
        };
        TicTacToe.gameOver(board);
        System.out.println();

        System.out.println("Test Two");
        System.out.println("Should be Cat");
        char[][] board2 = {
            {'X', 'O', 'O'},
            {'O', 'X', 'X'},
            {'X', 'O', 'O'}
        };
        TicTacToe.gameOver(board2);
        System.out.println();

        System.out.println("Test Three");
        System.out.println("O should win");
        char[][] board3 = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'O', 'O'}
        };
        TicTacToe.gameOver(board3);
        System.out.println();

        System.out.println("Test Four");
        System.out.println("Game Isn't Over");
        char[][] board4 = {
            {'X', 'O', 'O'},
            {'O', ' ', 'X'},
            {'X', 'O', 'O'}
        };
        TicTacToe.gameOver(board4);
        System.out.println();
        System.out.println();
    }
}
