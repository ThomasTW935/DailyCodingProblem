package dailycodingproblem.problem;

/**
 * Daryl Thomas
 * Sep 30, 2019
 * 
 * This problem was recently asked by Google.
   Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
   For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
   Bonus: Can you do this in one pass?
 */
import java.util.*;

public class Day1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type a list of numbers seperated by a space");
		String [] list = (s.nextLine()).split(" ");
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(String st : list) {
			newList.add(Integer.parseInt(st));
		}
		
		System.out.println("Type the equivalent of the 2 numbers");
		int k = s.nextInt();
		boolean addUpToK = false;
		for(int i = 0; i<newList.size(); i++) {
			int diff = k-(Integer.parseInt(list[i]));
			if(newList.contains(diff) && newList.lastIndexOf(diff) != i){
				addUpToK = true;
				System.out.println(diff);
				System.out.println(i);
				break;
			}
		}
		System.out.println(addUpToK);
	}

}
