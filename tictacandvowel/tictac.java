package tictacandvowel;

import java.util.Scanner;

public class tictac {


	    public static void main(String[] args) {
	    	
	    	System.out.print("Welcome to Aryan's program Series\n");
	        char[][] board = {
	            {' ', ' ', ' '},
	            {' ', ' ', ' '},
	            {' ', ' ', ' '}
	        };

	        boolean xTurn = true;
	        int moves = 0;
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            printBoard(board);

	            char currentPlayer = xTurn ? 'X' : 'O';
	            System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
	            int row = scanner.nextInt();
	            System.out.print("Player " + currentPlayer + ", enter column (0-2): ");
	            int col = scanner.nextInt();

	            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
	                System.out.println("Invalid move. Try again.");
	                continue;
	            }

	            board[row][col] = currentPlayer;
	            moves++;

	            if (checkWin(board, currentPlayer)) {
	                printBoard(board);
	                System.out.println("Player " + currentPlayer + " wins!");
	                break;
	            } else if (moves == 9) {
	                printBoard(board);
	                System.out.println("It's a draw!");
	                break;
	            }

	            xTurn = !xTurn;
	        }

	        scanner.close();
	    }

	    public static void printBoard(char[][] board) {
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                System.out.print(board[row][col]);
	                if (col < 2) {
	                    System.out.print(" | ");
	                }
	            }
	            System.out.println();
	            if (row < 2) {
	                System.out.println("---------");
	            }
	        }
	    }

	    public static boolean checkWin(char[][] board, char player) {
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
	                return true;
	            }
	            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
	                return true;
	            }
	        }
	        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
	            return true;
	        }
	        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
	            return true;
	        }
	        return false;
	    }
	}


