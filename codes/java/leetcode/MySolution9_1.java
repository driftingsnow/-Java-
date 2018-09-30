package leetcode;

import java.util.HashSet;

//数独，判断九宫格里面的数是否符合规则
//题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
//网上抄的答案，leetcode通过

public class MySolution9_1 {
	public boolean isValidSudoku(char[][] board) {

	    HashSet<Character> set = new HashSet<Character>();

	    // Check for each row
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	        	System.out.println("board[i][j]= " + board[i][j]);
	            if (board[i][j] == '.')
	                continue;
	            if (set.contains(board[i][j]))
	                return false;
	            set.add(board[i][j]);
	        }
	        set.clear();
	    }


	    // Check for each column

	    for (int j = 0; j < 9; j++) {

	        for (int i = 0; i < 9; i++) {

	            if (board[i][j] == '.')

	                continue;

	            if (set.contains(board[i][j]))

	                return false;

	            set.add(board[i][j]);

	        }

	        set.clear();

	    }


	    // Check for each sub-grid

	    for (int k = 0; k < 9; k++) {

	        for (int i = k/3*3; i < k/3*3+3; i++) {

	            for (int j = (k%3)*3; j < (k%3)*3+3; j++) {

	                if (board[i][j] == '.')

	                    continue;

	                if (set.contains(board[i][j]))

	                    return false;

	                set.add(board[i][j]);

	            }

	        }

	        set.clear();

	    }


	    return true;

	}
	
	
	//System.out.println的简写
	void println(Object object) {
		System.out.println(object);
	}
	
	//用来print 2d的char[][]
	void print2d(char[][] board) {
		 
		for(char[] row : board) 
			System.out.println(row);
	}
	
	
	
	public static void main(String[] args) {
		MySolution9_1 obj = new MySolution9_1();
		char[][] array2d = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		
		char[][] array2d1 = {
				{'9','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		
		System.out.println(obj.isValidSudoku(array2d));
		System.out.println(obj.isValidSudoku(array2d1));
		
		
		/*
		//创建一个char
		// char testt = 'ab'; 两个字母不行
		char test = 'a';
		obj.println("test ab: " + test);
		
		
		//创建一个char[]
		char[] test0 = "abcd".toCharArray();
			System.out.println(test0);//abcd
			System.out.println(test0.length);//4
		
		
		//创建一个char[][]
		char[][] test1 = {{'a','b'},{'c','d'}};
			obj.print2d(test1);
		*/	

		
		
	}
}
