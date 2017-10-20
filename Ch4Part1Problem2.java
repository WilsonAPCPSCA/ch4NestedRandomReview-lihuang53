/* Li Huang
 * per.1
 * 10/18/2017
 * Chapter 4 Review: Part 1
 * Problem 2
 */

public class Ch4Part1Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r=1; r<=10; r++){
			for(int c=1; c<=10; c++){
				if(c==1)System.out.printf("%2d",r*c);
				else System.out.printf("%4d",r*c);
			}
			System.out.println();
		}

	}

}
