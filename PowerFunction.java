package BinarySearch;

public class PowerFunction {
	
	public static void main (String args[]){
		
		int r= pow(-1,1,20);
		System.out.println("Result = "+r);
		
	}
	
	
	public static int pow(int x, int n, int d) {
	    
	     int  temp;
	    if( n == 0){
	    	 return 1 % d;
	    }
	      
	    temp = pow(x, n/2,d);       
	    if (n%2 == 0)
	        return (temp*temp) %d;
	    else
	    {
	        if(n > 0)
	            return (x*temp*temp )%d;
	        else{
	            
	            int S = (temp*temp)/x;
	               if(S < 0 ){
	                 return S + d;
	               }else{
	                   return S%d;
	               }
	        
	          //  S = S - (2*S);
	           // return S%d;
	            
	        }
	            
	    }

}
}
