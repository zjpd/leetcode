import java.util.*;

public class ValidSudoku36 {
	
	/**
	 * Three hashsets are created
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
		int[][] copy = new int[board.length][board[0].length];
		boolean f1, f2, f3 = false;
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[0].length; j++) {
				
				copy[i][j] = Integer.valueOf(board[i][j]-48);
			}
		}
		
		f1 = validRow(copy);
		f2 = validCol(copy);
		f3 = validCub(copy);
		
		if (f1 && f2 && f3)
			return true;
		else 
			return false;
	}
	
	private boolean validCub(int[][] board) {
		
		for (int i=0; i<9; i++) {
			HashSet<Integer> tmp = new HashSet<>();
			for (int j=0; j<9; j++) {
				
				int rowIndex = 3 * (i/3);
				int colIndex = 3 * (i%3);
				if(board[rowIndex + j/3][colIndex + j%3]>=0 && !tmp.add(board[rowIndex + j/3][colIndex + j%3]))
	                return false;
			}
		}
		
		return true;
	}
	
	private boolean validCol(int[][] board) {
		int r = board[0].length, c = board.length;
		
		for (int j=0; j<r; j++) {
			HashSet<Integer> tmp = new HashSet<>();
			
			for (int i=0; i<c; i++) {
				if (board[i][j]>=0)
					if (!tmp.add(board[i][j]))
						return false;
			}
		}
		
		return true;
	}
	
	private boolean validRow(int[][] board) {
		
		int r = board[0].length, c = board.length;
		
		for (int i=0; i<c; i++) {
			HashSet<Integer> tmp = new HashSet<>();
			
			for (int j=0; j<r; j++) {
				if (board[i][j]>=0)
					if (!tmp.add(board[i][j]))
						return false;
			}
		}
		return true;
	}
	
	/**
	 * '4' in row 7 is encoded as "(4)7".
	 * '4' in column 7 is encoded as "7(4)".
	 * '4' in the top-right block is encoded as "0(4)2".
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku2(char[][] board) {
	    HashSet<String> seen = new HashSet<>();
	    for (int i=0; i<9; ++i) {
	        for (int j=0; j<9; ++j) {
	            char number = board[i][j];
	            if (number != '.')
	                if (!seen.add(number + " in row " + i) ||
	                    !seen.add(number + " in column " + j) ||
	                    !seen.add(number + " in block " + i/3 + "-" + j/3))
	                    return false;
	        }
	    }
	    return true;
	}
}
