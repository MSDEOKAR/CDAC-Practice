package image;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ImageOperation extends JPanel implements ActionListener
{
	/**
	 * @author Praphul Kolte
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnRotate = null;
	private JButton btnScale = null;
	private JButton btnReset = null;
	private JButton btnFlip = null;
	private ImagePanel objImagePanel = null;

	public ImageOperation()
	{
		
		objImagePanel = new ImagePanel();
		setLayout(new BorderLayout());
		btnRotate = new JButton ("Rotate");
		btnRotate.addActionListener(this);
		btnScale = new JButton ("Scale");
		btnScale.addActionListener(this);
		btnFlip = new JButton ("Flip");
		btnFlip.addActionListener(this);
		btnReset = new JButton ("Reset");
		btnReset.addActionListener(this);
		
		JScrollPane objJScrollPane = new JScrollPane(objImagePanel);
		add(objJScrollPane, BorderLayout.CENTER);
		
		JPanel pnl = new JPanel();
		pnl.add(btnRotate);
		pnl.add(btnScale);
		pnl.add(btnFlip);
		pnl.add(btnReset);
		add(pnl, BorderLayout.AFTER_LAST_LINE);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(btnRotate == ae.getSource())
		{
			objImagePanel.rotate();
		}
		else if(btnScale == ae.getSource())
		{
			objImagePanel.scale();
			btnScale.setEnabled(false);
		}
		else if(btnFlip == ae.getSource())
		{
			objImagePanel.flip();
		}
		else if(btnReset == ae.getSource())
		{
			objImagePanel.reset();
			btnScale.setEnabled(true);
		}
	}


/**
 * @param args
 */
public static void main(String[] args) 
{
	JFrame objJFrame = new JFrame();
	objJFrame.setTitle("Image Operation Demo");
	objJFrame.addWindowListener(new WindowAdapter() 
	{
		@Override
		public void windowClosing(WindowEvent e) 
		{
			System.exit(0);
		}
	});
	ImageOperation objImageOperation = new ImageOperation();
	objJFrame.add(objImageOperation);
	objJFrame.setSize(1024, 768);
	objJFrame.setResizable(false);
	objJFrame.setVisible(true);

}

}
