package thread;
import java.awt.Color;

import javax.swing.JFrame;


public class MyWindow extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyPanel objMyPanel = null;

	public MyWindow()
	{
		objMyPanel = new MyPanel();
		setBackground(Color.WHITE);
		setSize(400,400);
		add(objMyPanel);
		Thread objThread = new Thread(objMyPanel);
		objThread.start();
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MyWindow();
	}

}
