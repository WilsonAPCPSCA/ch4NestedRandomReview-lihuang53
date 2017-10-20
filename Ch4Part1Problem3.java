/* Li Huang
 * per.1
 * 10/18/2017
 * Chapter 4 Review: Part 1
 * Problem 3
 */

import java.util.Scanner;
public class Ch4Part1Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the side length: ");
		int sideLength = in.nextInt();
		
		for(int c=1;c<=sideLength;c++){
			for (int s=sideLength-c;s>=1;s--)System.out.print(" ");
			for (int a=2*c-1;a>=1;a--)System.out.print("*");
			System.out.println();
		}
		
		for(int c=sideLength-1;c>=1;c--){
			for (int s=3;s>=c;s--)System.out.print(" ");
			for (int a=2*c-1;a>=1;a--)System.out.print("*");
			System.out.println();
		}
	}

}
