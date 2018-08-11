package snake.toedit;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
/**
 * @author Jaryt Bustard
 */
public class RenderPanel extends JPanel
{

	Color bgcolor = new Color(0,(int)(Math.random() * 255),0);       //new Color(red, green, blue)
															         //random color different green
	Color color_gameover = new Color((int)(Math.random() * 255),0,0);//random color different red

//	public static final Color bgcolor = new Color((int)(Math.random() * 0x1000000));
										
	
																				
//	@Override ???覆写？什么意思
	protected void paintComponent(Graphics g)
	{
		//background
		super.paintComponent(g);
		Snake snake = Snake.snake;
		g.setColor(bgcolor);
		g.fillRect(0, 0, 1000, 700); //为什么数字调大了没作用
		
		//snake		
		Color color_snake = new Color((int)(Math.random() * 255),0,0);   //自带特效，打算让它闪得慢些
		g.setColor(color_snake);

		for (Point point : snake.snakeParts){
			g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		}
		
		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		g.setColor(Color.PINK);
		g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

		
		//记录得分时间的数据
		String string = "Score: " + snake.score + ", Length: " + snake.tailLength + ", Time: " + snake.time / 20; // 创建 记录得分时间的数据 的字符串
		g.setColor(Color.WHITE); //设置 字符串 颜色
		Font strfont = new Font("Helvetica", 5,10);//设置字体大小
		FontMetrics fm = getFontMetrics(strfont);
		g.drawString(string, (int) ((getWidth() - fm.stringWidth(string)) / 2 ), 10);//设置 字符串 的位置
	
		
		//显示 GAME OVER
		string = "GAME OVER"; //创建 字符串 "GAME OVER"
	//	final Color color_gameover = new Color((int)(Math.random() * 0x1000000)); //在此处会自带特效一闪一闪的，是动态地变化颜色？？？；
		g.setColor(color_gameover);
		Font strfont1 = new Font("Helvetica",10,100);
		g.setFont(strfont1);
		FontMetrics fm1 = getFontMetrics(strfont1); //import getFontMetrics
		if (snake.over) {       //条件：snake.over 蛇死掉了？
		g.drawString(string, (int) ((getWidth()-fm1.stringWidth(string)) / 2),(int) (getHeight() / 2));
		}

		string = "Paused!";
		Font strfont2 = new Font("Helvetica",10,100);
		g.setFont(strfont2);
		FontMetrics fm2 = getFontMetrics(strfont2); //import getFontMetrics
		if (snake.paused && !snake.over)
		{
			g.drawString(string, (int) ((getWidth()-fm2.stringWidth(string)) / 2),(int) (getHeight() / 2));
		}
		
	}
}

/*	
 * 不会，怎么弄一个方法，把字符串自动居中
	int[] setStringMiddleWidth(){
		String string = null;
		Font strfont = new Font(Font);
		FontMetrics fm = getFontMetrics(strfont);
		return new int[] {(int) ((getWidth()-fm.stringWidth(string)) / 2), (int) (getHeight() / 2)}	;
*/		
	//设想： string.methodwidth() 
		

		
	