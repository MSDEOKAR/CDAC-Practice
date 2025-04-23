package collection;
import java.util.HashSet;
import java.util.Vector;


/**
 * 
 */

/**
 * @author praphul
 *
 */
public class Sizeprint 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		HashSet<Short> s = new HashSet<Short>();//1
        for(short i = 0; i<100;i++)
        {//2
            s.add(i);//3
            s.remove(i-1);//4
        }
        System.out.println(s.size());//5
		
		Vector<Short> vct = new Vector<Short>();//1
        for(short i = 0; i<100;i++)
        {//2
        	vct.add(i);//3
        	vct.remove(i-1);//4
        }
        System.out.println(vct.size());//5

	}
	
	
		

}
