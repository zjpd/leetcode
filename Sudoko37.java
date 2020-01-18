
public class Sudoko37 {
	
	/**
	 * Backtracking to find the unique solution
	 * @param board
	 */
	public void solveSudoku(char[][] board) {
		if ( board == null || board.length == 0) return;
		
		solve(board);
    }
	
	private boolean solve(char[][] board) {
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				
				if (board[i][j] == '.') {
					for (char c='1'; c <= '9'; c++) {
						
						if ( isValid(board, i,j,c)) {
							
							board[i][j] = c;
							
							if (solve (board)) return true;
							else board[i][j] = '.';
							
						}
					}
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean isValid (char[][] board, int row, int col, char c) {
		
		for (int i=0; i<9; i++) {
			
			int rowIndex = 3 * (row/3);
			int colIndex = 3 * (col/3);
			if (board[i][col] == c) return false;	//check row
			if (board[row][i] == c) return false;	//check col
			if (board[rowIndex + i/3][colIndex + i%3] == c) return false;
			
		}
		return true;
	}
}
