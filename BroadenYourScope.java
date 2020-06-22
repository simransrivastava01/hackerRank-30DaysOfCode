import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
     public Difference(int []arr)
 {
     
     this.elements = arr;
 }
public void computeDifference()
{
   int l=elements.length;
    for(int i=0;i<l-1;i++)
    {
        for(int j=0;j<l-1;j++)
        {
            if(elements[j]>elements[j+1])
            {
                int temp=elements[j];
                elements[j]=elements[j+1];
                elements[j+1]=temp;
            }
        }
    }
    maximumDifference=Math.abs(elements[0]-elements[l-1]);
}
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}