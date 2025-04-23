package interview;

public class RecursiveReverseString {
	
	
	public static String reverseLoop( String source){
	        if(source == null || source.isEmpty()){
	            return source;
	        }      
	        String reverse = "";
	        for(int i = source.length() -1; i>=0; i--){
	            reverse = reverse + source.charAt(i);
	        }
	     
	        return reverse;
	}
	
	public static String reverseSwap( String source){
        if(source == null || source.isEmpty()){
            return source;
        }     
        
        StringBuffer sBuff = new StringBuffer(source);
        
        for(int end = sBuff.length() -1, start = 0; start >  end; end--, start++){
        	String temp = sBuff.substring(start, start+1);
        	sBuff.replace(start, start+ 1, sBuff.substring(end,end+1));
        	sBuff.replace(end,end+1,temp);
            
        }
     
        return sBuff.toString();
}
	public static String reverse( String input){
		String result ="";
		if(input.length() > 1){
			String lastChar = input.substring(input.length()-1, input.length());
			result = lastChar + reverse(input.substring(0, input.length()-1));
			return result;
		}else{
			return input;
		}
	}
	
	public static int reverseNumber(int no)
	{
		int revNo =0;
		if(no > 10)
		{
			revNo = no%10 * (int) Math.pow(10, (int) Math.log10(no)) + reverseNumber(no/10); 
			return revNo;
		}
		else
		{
			return  no;
		}
	}
	
	public static int factorial(int no){
		int result =0;
		if(no> 1)
		{
			result = no * factorial(no-1);
			return result;
		}
		else{
			return 1;
		}
	}
	
	public static void fibbonacci(int n, int f0, int f1){
		if(n > 0)
		{
		System.out.println(f0);
		fibbonacci(n-1,f1,f1+f0);
		}
	}
	
	public static void fibbonacciLoop(int n){
		int f0= 0;
		int f1 = 1;
		int temp=0;
		while(n > 0)
		{
		System.out.println(f0);
		temp = f1 + f0;
		 f0 = f1;
		 f1 = temp;
		 n--;
		}
	}
	
	
	public static void main(String[] args) {
//		String result = RecursiveReverseString.reverse("abcdefg");
//		System.out.println(result);
//		
//		int result1 = RecursiveReverseString.reverseNumber(123456);
//		System.out.println(result1);
//		
//		int result2 = RecursiveReverseString.factorial(6);
//		System.out.println(result2);

//		RecursiveReverseString.fibbonacci(10, 0, 1);
//		
//		RecursiveReverseString.fibbonacciLoop(10);
		
		System.out.println(RecursiveReverseString.reverseSwap("abcdef"));
	}
	

}
