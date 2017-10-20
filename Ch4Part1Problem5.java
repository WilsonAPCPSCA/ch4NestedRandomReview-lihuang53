/* Li Huang
 * per.1
 * 10/18/2017
 * Chapter 4 Review: Part 1
 * Problem 5
 */

import java.util.Scanner;
public class Ch4Part1Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("This program will stimulae tossing  pair of dice.");
		System.out.print("How many times would you like the dice to be tossed?");
		int times = in.nextInt();
		System.out.println("Here is the sequence of sums, one for each toss:");
		
		int sum;
		String result="";
		
		for(int i=times;i>=1;i--){
			sum=(int)(Math.random()*6)+2+(int)(Math.random()*6);
			System.out.print(sum+" ");
			if(sum==10)result+="A";
			else if(sum==11)result+="B";
			else if(sum==12)result+="C";
			else result+=Integer.toString(sum);
		}
		
		for(int c=2;c<=12;c++){
			System.out.printf("%4s",c+": ");
			for(int j=0;j<result.length();j++){
				if(result.substring(j,j+1).equals(Integer.toString(c)))
					System.out.print("*");
				else if(result.substring(j,j+1).equals("A")&&c==10)
					System.out.print("*");
				else if(result.substring(j,j+1).equals("B")&&c==11)
					System.out.print("*");
				else if(result.substring(j,j+1).equals("C")&&c==12)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
