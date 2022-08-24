import java.util.*;
public class Dimond
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m =n;
	    int h = (n+1)/2;
	    int k = 0;
		for(int i= 1;i<=n;i++){
		  if(i<=h){
		      k++;
	  }else{
	      k--;
	  }
		    for(int j =1;j<=n;j++){
		        if(j>=h+1-k && j<=h-1+k){
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}




// 7
//    *   
//   ***  
//  ***** 
// *******
//  ***** 
//   ***  
//    *   
