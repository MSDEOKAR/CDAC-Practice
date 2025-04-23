package image;

import javax.swing.JFrame;

public class DisplayImage extends JFrame
{

	/**
	 * @author praphul
	 */
	private static final long serialVersionUID = 1L;
	
	public DisplayImage()
	{
		
	}
	
	public void showImage()
	{
		setTitle("Image display");
		add( new DisplayPanel());
		setSize(500, 600);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		
		DisplayImage objDisplayImage = new DisplayImage();
		objDisplayImage.showImage();
	}
	

}
