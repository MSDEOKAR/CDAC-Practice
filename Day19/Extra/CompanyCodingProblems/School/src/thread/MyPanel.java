package thread;
import java.awt.Graphics;

import javax.swing.JPanel;



public class MyPanel extends JPanel implements Runnable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1291551333877988372L;
	int x=10;
	int y=10;
	int p=10;
	int k=10;
	int m =10;
	int n =10;

	@Override
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		x+=20;
		//y+=20;
		//p+=20;
		k+=20;
		m+=20;
		n+=20;
		g.fillOval(x, y, 40, 40);
		g.fillOval(p, k, 40, 40);
		g.fillOval(m, n, 40, 40);
		if(x>=300)
		{
			x=10;
			y=10;
			p=10;
			k=10;
			m=10;
			n=10;
		}

	}
	
	@Override
	public void run() 
	{ 
		while(x < 400)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
			
		}

	}
}
