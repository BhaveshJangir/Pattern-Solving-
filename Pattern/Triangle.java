import java.util.*;
public class Triangle
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m ;
	    m = 2*n-1;
		int k;
		for(int i= 1;i<=n;i++){
		     k =1;
		    for(int j =1;j<=m;j++){
		        if(j>=n+1-i && j<= n-1+i && k==1){
		            System.out.print("*");
		            k = 0;
		        }else{
		            System.out.print(" ");
		            k =1;
		        }
		    }
		    System.out.println();
		}
	}
}
