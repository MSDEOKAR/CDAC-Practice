package collection;
import java.util.SortedSet;
import java.util.TreeSet;


public class MyCollection 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		for(int i= 1;i<=10;i++)
//		{
//			list.add(new Integer(i+i));
//			list.add(new Integer(i));
//		}
//		for(Integer objInteger :list)
//		{
//			System.out.println(objInteger);
//		}
		
//		Collections.sort(list);
//		Set<Integer> objSet = new HashSet<Integer>(list);
//		for(Integer objInteger :objSet)
//		{
//			System.out.println(objInteger);
//		}
		
		SortedSet<String> ss = new TreeSet<String>();
        ss.add("Praphul");
        ss.add("Parag");
        ss.add("Ashish");
        ss.add("Akash");
        ss.add("Sagar");
        ss.add("Suraj");
        ss.add("Pooja");
        System.out.println(ss);
        
       //        Iterator<String> it=ss.iterator();
//
//        while(it.hasNext())
//        {
//          String value=(String)it.next();
//
//          System.out.println("Value :"+value);
//        }
	
	}

}
