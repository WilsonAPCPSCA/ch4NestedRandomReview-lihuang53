/* Li Huang
 * per.1
 * 10/18/2017
 * Chapter 4 Review: Part 1
 * Problem 4
 */

import java.util.Scanner;
public class Ch4Part1Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("This program will simulate flipping a fair coin.");
		System.out.print("How many times would you like the coin to be flipped?");
		int times= in.nextInt();
		String coin="";
		System.out.println("Here is the sequence of coin flips:");
		int random;
		int hCount=0;
		int tCount=0;
		for(int i=times;i>=1;i--){
			random=(int)(Math.random()*10);
			if(random<5){
				hCount++;
				coin+="H";
			}else{
				tCount++;
				coin+="T";
			}
		}
		System.out.println(coin);
		System.out.println("There were "+hCount+" heads and "+tCount+" tails.");
	}

}
