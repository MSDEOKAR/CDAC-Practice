package applet;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
/*
<Applet code= "MyApplet" width=300 height =200></Applet>
 */
public class MyApplet extends JApplet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() 
	{
		ImageIcon icon =new ImageIcon("F:\\Sample_Repository\\Images\\JPGs\\head1.jpg");  
		add(new JLabel(icon));
	}
	
}
