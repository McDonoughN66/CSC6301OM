//import java.util.LinkedList;
//import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * This Class reads in a list of Integers in any order and returns a sorted
 * Stack
 * 
 * @author Nicholas McDonough
 * @Version 2.0.0
 * @since Week 5 of CSC6301OM
 */
public class McDonoughN05 {

	/**
	 * This method inserts an integer into the linked list
	 * 
	 * @param stack the stack.
	 * @param num  the number that is going to be inserted into the linked list
	 */
	public static void insertAndSort(Stack<Integer> stack, int num) {
	    Stack<Integer> tempStack = new Stack<>();

	    while (!stack.isEmpty() && stack.peek() < num) {
	        tempStack.push(stack.pop());
	    }

	    stack.push(num);

	    while (!tempStack.isEmpty()) {
	        stack.push(tempStack.pop());
	    }
	}

	/**
	 * The main method of the class
	 * 
	 * @param args default parameter for a a main - not used
	 */
	public static void main(String[] args) {
	    // create stack object
	    Stack<Integer> nums = new Stack<>();

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a list of integers (enter any non integer to stop): ");

	    while (scan.hasNextInt()) {
	        int num = scan.nextInt();
	        insertAndSort(nums, num);
	    }

	    System.out.println("Sorted Stack: ");
	    while (!nums.isEmpty()) {
	        System.out.print(nums.pop() + " ");
	    }
	    System.out.println();
	}

}