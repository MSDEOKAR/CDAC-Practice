//package xsl;
//
//
//// Specify the classes to import.
//import javax.media.jai.JAI;
//import javax.media.jai.RenderedOp;
//import javax.media.jai.widget.ScrollingImagePanel;
//import javax.swing.JFrame;
//
//@SuppressWarnings("deprecation")
//public class ImageEditor extends JFrame 
//{
//
///**
//	 * 
//	 */
//	private static final long serialVersionUID = -7322568841978504721L;
///**
//	 * 
//	 */
//// Specify a default image in case the user fails to specify
//// one at run time.
//public static final String DEFAULT_FILE =  "F:\\Sample_Repository\\Images\\JPGs\\Abdomen4.jpg";
//
//    public static void main(String args[])
//    {
//        String fileName = null;
//
//// Check for a filename in the argument.
//        if(args.length == 0) 
//        {
//            fileName = DEFAULT_FILE;
//        } else if(args.length == 1)
//        {
//            fileName = args[0];
//        } else
//        {
//            System.out.println("\nUsage: java " +   (new ImageEditor()).getClass().getName() +
//                               " [file]\n");
//            System.exit(0);
//        }
//
//        new ImageEditor(fileName);
//    }
//
//    public ImageEditor() 
//    {
//    	
//    }
//	public ImageEditor(String fileName)
//    {
//
//   // Read the image from the designated path.
//   System.out.println("Creating operation to load image from '" +
//                       fileName+"'");
//   RenderedOp img =  JAI.create("fileload", fileName);
//
//   // Set display name and layout.
//   setTitle(getClass().getName()+": "+fileName);
//
//        // Display the image.
//        System.out.println("Displaying image");
//        add(new ScrollingImagePanel(img, img.getWidth(),img.getHeight()));
//        pack();
//        setVisible(true);
//    }
//}
