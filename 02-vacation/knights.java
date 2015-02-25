import java.io.*;
import java.util.*;

public class knights{

    private char[][] board;
    private int startPosx;
    private int startPosy;
    private int size = 5;
    private int maxX = size;
    private int maxY = size;
    private char knight = 'x';
    private char open = 'o';

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e){}
    }

    public knights() {
        board = new char[size][size];
	for (int i = 0;i<board.length;i++){
	    for (int j = 0;j<board[0].length;j++){
		board[i][j] = 'o';
	    }
	}
    }
    
    public String toString(){
	String s = "";
	for (int i = 0;i<board.length;i++){
	    for (int j = 0;j<board[0].length;j++){
		s+=board[i][j];
		s+=' ';
	    }
	    s += "\n";
	}
	return s;
    }

    public int[][] possibleMoves(int x, int y) {
        int[][] moves = {
            {y+2,x+1},
            {y+2,x-1},
            {y-2,x+1},
            {y-2,x-1},
            {y+1,x+2},
            {y+1,x-2},
            {y-1,x+2},
            {y-1,x-2}
        };
        return moves;
    }
    
    public boolean isDeadEnd(int x,int y){
	if (x < 0 ||
            x >= maxX ||
            y < 0 ||
            y >= maxY ||
            board[x][y]==knight){
	    return true;
	}
	else{
	    return false;
	}
    }
    
    public boolean Solved(){
	for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[0].length; j++) {
                if (board[i][j]==open) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean solve(int x,int y){
	if (isDeadEnd(x,y)){
	    return false;
	}
	
	board[x][y] = knight;
	System.out.println(this);
	delay(10);
	
	if (Solved()){
	    System.out.println("YOU DID IT!");
	    return true;
	}
	else{
	    for (int[] move : possibleMoves(x,y)) {
		solve(move[1], move[0]);
	    }
	}

	board[x][y] = open;
	System.out.println(this);
	delay(10);
	return false;
    }

    public static void main(String[] args){
	knights m = new knights();
	System.out.println(m);
	
	m.solve(0,0);
    }
}
