package JavaDSA;

import java.util.Arrays;

public class CheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		// First Logic 
		
	    boolean status=Arrays.equals(arr1,arr2);
	    if(status==true)
	    {
	    	System.out.println("Arrays Are Equal.");
	    }
	    else
	    {
	    	System.out.println("Arrays Are Not Equal.");
	    }
	    
	    
	   //   Second Logic

	   boolean status =true;
	   if(arr1.length == arr2.length)
	   {
		   for(int i=0;i<arr1.length;i++)
		   {
			   if(arr1[i]!=arr2[i])
			   {
				   status= false;
			   }
			   
		   }
	   }
	   else
	   {
		   status = false;
	   }
	   if(status==true)
	   {
		   System.out.println("Arrays Are Equal");
	   }
	   else
	   {
		   System.out.println("Arrays Are Not Equal");
	   }
	    
	}

}
