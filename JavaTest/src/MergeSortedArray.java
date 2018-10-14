import java.util.Scanner;

public class MergeSortedArray {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      
        int i,j, a[] = null,b[]= null,c[]= null,n1=0,n2=0,k=0;
        
        
      
        		Scanner s = new Scanner(System.in);
        		System.out.println("Enter the length of Array ");
        		int len = s.nextInt();
        		a = new int[len];
        		System.out.println("Enter" + len + "integers");

        		for (i = 0; i < len; i++) {
        			a[i] = s.nextInt();
        		}
        		System.out.println("Enter the length of Array ");
        		int len1 = s.nextInt();
        		b = new int[len1];
        		System.out.println("Enter" + len1 + "integers");

        		for (j = 0; j < len1; j++) {
        			b[j] = s.nextInt();
        		}
        		
        	
        		 
        		while (i<n1 && j <n2) 
        		{ 
        			if (a[i] < b[j]) 
        				c[k++] = a[i++]; 
        		else
        			c[k++] = b[j++]; 
        		} 

        		while (i < n1) 
        			c[k++] = a[i++]; 


        		while (j < n2) 
        		c[k++] = b[j++]; 
        		} 
      
      
        
        
        
	}




		
         
      

