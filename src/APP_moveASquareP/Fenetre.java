package APP_moveASquareP;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Fenetre extends JFrame{
	private int x = 0;
	private int y = 0;
	
	private JPanel content = new JPanel();
	private Form carre = new Form();

		public Fenetre(){
			this.setTitle("Jeu");
			this.setSize(805, 805);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//content.add(for1);
			this.addKeyListener(new enterListener());
			content.setLayout(new BorderLayout());

			
			content.add(carre);

			this.setContentPane(content);
			//this.setContentPane(for1);
			this.setVisible(true);
		}
		
	class enterListener implements KeyListener{
	    public void keyPressed(KeyEvent e) {
	        // TODO Auto-generated method stub
	    	Component[] contentarray = content.getComponents();
	    	
	        if((e.getKeyCode()==KeyEvent.VK_UP)){
	        	//for1.getLocation().getY() < -50.0*/){
	        		y -= 50;    		
	        			               
        	}
	        if((e.getKeyCode()==KeyEvent.VK_RIGHT)){
	        	if(carre.getY() != -50.0){
        			x += 50;
	        	}  
    		}
	        if((e.getKeyCode()==KeyEvent.VK_LEFT)){
        			x -= 50;
                
    		}
	        if((e.getKeyCode()==KeyEvent.VK_DOWN)){
	        	if(!(carre.getYBot() + 50 > content.getHeight())){
        			y += 50;
	        	}
			}	

        	carre.setLocation(x, y);
        	
	    	System.out.println(carre.getY() +  " " + carre.getX());

	    }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					
				}
			}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
			}
		}
}