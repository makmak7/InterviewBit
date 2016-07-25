package BinarySearch;

import java.util.*;

public class RotatedArraySearch {
	
	public static void main (String args[]){
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(0);
		a.add(1);
		a.add(2);
		
		
		search(a,0);
		
	}
	
	
	public static int search(final List<Integer> a, int b) {
	    
	    int result = binSearch(a,b,0, a.size()-1);
	    System.out.println("Result = "+ result);
	    return result;
	}
	
	private static int binSearch(List<Integer> a , int b , int left , int right){
	    
	    if(left > right){
	        return -1;
	    }
	    
	    int mid = left + (right-left)/2;
	    
	    if(a.get(mid) == b){
	        return mid;
	    }
	    
	    if(a.get(left) < a.get(mid) ){ // Left side is sorted
	        
	        if( b >= a.get(left) && b <= a.get(mid) ){
	            
	            return binSearch( a , b, left, mid-1);
	            
	        }else{
	            
	            return binSearch( a , b, mid+1, right);
	        }
	        
	        
	        
	        
	        
	        
	    }else if ( a.get(mid) < a.get(right)) { // Right Side is sorted
	        
	        if( b >= a.get(mid) && b <= a.get(right) ){
	            
	            return binSearch(a , b, mid+1, right);
	            
	        }else{
	            
	            return binSearch( a , b, left, mid -1);
	        }
	        
	        
	        
	    }else{
	        
	        return -2;
	    }
	    
	    
	    
	}

}
