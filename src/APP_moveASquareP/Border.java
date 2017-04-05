package APP_moveASquareP;

import java.awt.*;

import javax.swing.*;

public class Border extends JPanel{
	
	static int x = 50;
	static int y = 50;
	
	public void paintComponent(Graphics g){
		
		g.drawRect(10, 10, 800, 800);
		
	}
}
