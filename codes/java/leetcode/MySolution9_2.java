package leetcode;
//数独，判断九宫格里面的数是否符合规则
//题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/
//刚刚看了一下答案，现在试着默一遍。默一遍又弄出自己的想法（九格那里的方法）

import java.util.HashSet;

public class MySolution9_2 {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> set = new HashSet<Character>();
		
		//检查每行是否有重复
		for(int j=0; j<board.length; j++) {//?
			for(int i=0; i<board.length; i++) {
				if(board[j][i] == '.') 
					continue;
				if(set.contains(board[j][i])) 
					return false;
					set.add(board[j][i]);
			}
			set.clear();//?
		}
		
		//检查每列是否有重复
		for(int j=0; j<board.length; j++) {//?
			for(int i=0; i<board.length; i++) {
				if(board[i][j] == '.') 
					continue;
				if(set.contains(board[i][j])) 
					return false;
					set.add(board[i][j]);
			}
			set.clear();//?
		}
		
		//检查每个3*3九格是否有重复 这里是我自己想出来的循环，四重循环，别人的那个我觉得我想不出来，利用余数和除法，搞不懂原理
		for(int r = 0; r < 7; r=r+3){
			for(int c = 0; c < 7; c=c+3){
				for(int j=r; j<r+3; j++) {
					for(int i=c; i<c+3; i++) {
						if(board[j][i] == '.') 
							continue;
						if(set.contains(board[j][i])) //? if这里为什么不用{}
							return false;
						set.add(board[j][i]);
					}
				}
				set.clear();//?
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		MySolution9_2 obj = new MySolution9_2();
		char[][] array2d = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','7','.','.','.','6','.'},
				
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		//System.out.println(array2d[0][4]);array2d[row][col]
		System.out.println(obj.isValidSudoku(array2d));

		
		
	}
}
