package BinarySearch;

import java.util.*;

public class MatrixSearch {
	
	
	public static void main(String args[]){
		
		ArrayList<ArrayList<Integer>> mainLIst = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(3);
		l1.add(11);
		l1.add(12);
		l1.add(14);
		
		mainLIst.add(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(16);
		l2.add(17);
		l2.add(30);
		l2.add(34);
		l2.add(35);
		
		mainLIst.add(l2);
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(45);
		l3.add(48);
		l3.add(49);
		l3.add(50);
		l3.add(52);
		
		mainLIst.add(l3);
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(56);
		l4.add(59);
		l4.add(63);
		l4.add(63);
		l4.add(65);
		
		mainLIst.add(l4);
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.add(67);
		l5.add(71);
		l5.add(72);
		l5.add(73);
		l5.add(79);
		
		mainLIst.add(l5);
		
		ArrayList<Integer> l6 = new ArrayList<Integer>();
		l6.add(80);
		l6.add(84);
		l6.add(85);
		l6.add(85);
		l6.add(88);
		
		mainLIst.add(l6);
		
		ArrayList<Integer> l7 = new ArrayList<Integer>();
		l7.add(88);
		l7.add(91);
		l7.add(92);
		l7.add(93);
		l7.add(94);
		
		mainLIst.add(l7);
		
		int R = searchMatrix(mainLIst,94 );
		System.out.println(R);
		
	}
	
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    
	    int R = a.size();
	    int C = a.get(0).size();
	    
	    int linearIndex = R*C -1;
	    
	    
	    int low = 0;
	    int high = linearIndex;
	    
	    while (low <= high){
	        
	        int mid = low + (high -low)/2;
	        
	        int V = getValueFromMatrix(a,mid,R,C);
	        
	        if( V == b){
	            return 1;
	        }else if ( V < b ){
	            low = mid +1;
	            
	        }else{
	            high = mid -1;
	        }
	        
	        
	    }
	    
	    return 0;
	    
	    
	    
	}
	
	private static int getValueFromMatrix(ArrayList<ArrayList<Integer>> a, int index, int R, int C    ){
	    
	    
	    int r = index/C;
	    
	    int c = index%C;
	    
	    return a.get(r).get(c);
	    
	    
	}

}
