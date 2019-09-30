package dailycodingproblem.problem;

/**
 * Daryl Thomas
 * Sep 30, 2019
 *
 */
/** This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i 
of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
*/
import java.util.*;
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Type a list of numbers");
		String [] list = s.nextLine().trim().split(" ");
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(String st : list) {
			newList.add(Integer.parseInt(st));
		}
		int total = 1;
		for(int i: newList) {
			total*=i;
		}
		System.out.println(total);
		
	}

}
