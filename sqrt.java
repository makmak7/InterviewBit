package BinarySearch;

public class sqrt {
	
	public static void main(String args[]){
		
		int result = sqrtMethod(2147483647);
		System.out.println(result);
		
	}
	
	
	public static int sqrtMethod(int a) {
	    
	    int low =0;
	    
	    int high = a;
	    
	    if(high > 46340 ){
	    	high = 46340;
	    }
	    
	
	    
	    while (low <= high){
	    	
	    
	        
	        int mid = low + (high - low )/2;
	        
	  
	    
	        
	        long midSquare = mid *mid ;
	        
	        if (midSquare  == a){
	            return mid;
	        }else if ( midSquare < a ){
	            
	            low = mid +1;
	        }else {
	            
	            high = mid -1;
	        }
	        
	        
	    }
	    
	    if((high * high < a) && (low *low > a)){
	    	return high;
	    }
	    
	    return -1;
	}
	    
	    
	    
	
	
	

}
