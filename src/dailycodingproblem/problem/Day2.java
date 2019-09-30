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

	public ArrayList<Integer> withDivision(ArrayList<Integer>list) {
		int total = 1;
		for(int i: list) {
			total*=i;
		}
		for(int i = 0; i<list.size(); i++) {
			int newElement = total/list.get(i);
			list.set(i, newElement);
		}
		return list;
	}
	
	public ArrayList<Integer> withoutDivision(ArrayList<Integer>list2) {
		ArrayList<Integer> cloneList = (ArrayList<Integer>) list2.clone();
		for(int i = 0; i<list2.size(); i++) {
			for(int j = 0; j<list2.size(); j++) {
				int newElement=1;
				newElement *= list2.get(j);
				list2.set(i, newElement);
			}
		}
		return list2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Type a list of numbers");
		String [] list = s.nextLine().trim().split(" ");
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(String st : list) {
			newList.add(Integer.parseInt(st));
		}
		Day2 da = new Day2();
		ArrayList<Integer> output1 = da.withDivision((ArrayList<Integer>) newList.clone());
		System.out.println(newList);
		ArrayList<Integer> output2 = da.withoutDivision((ArrayList<Integer>) newList.clone());
		System.out.println(output1);
		System.out.println(output2);
		
	}
}
