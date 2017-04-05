package APP_moveASquareP;

import java.awt.*;

import javax.swing.*;

public class Form extends JPanel{
	
	static int x = 0;
	static int y = 0;
	
	static int size_x = 120;
	static int size_y = 120;
	
	
	public void paintComponent(Graphics g){
		
		g.drawRect(x, y, size_x, size_y);
		
	}
	
	public int getYBot(){
		
		
		
		return getY() + size_y;
	}
}
