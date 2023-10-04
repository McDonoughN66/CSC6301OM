import java.util.*;

/**
 * This Class reads in a list of Integers in any order and returns a sorted
 * Linked list
 * 
 * @author Nicholas McDonough
 * @Version 1.0.0
 * @since Week 4 of CSC6301OM
 */
public class McDonoughN04 {

	/**
	 * This method inserts an integer into the linked list
	 * 
	 * @param list the Linked list.
	 * @param num  the number that is going to be inserted into the linked list
	 */
	public static void insertAndSort(LinkedList<Integer> list, int num) {
		// iterator object
		ListIterator<Integer> iterator = list.listIterator();

		// while loop
		while (iterator.hasNext()) {
			if (iterator.next() >= num) {
				iterator.previous();
				iterator.add(num);
				return;
			}
		}

		list.addLast(num);
	}

	/**
	 * The main method of the class
	 * 
	 * @param args default parameter for a a main - not used
	 */
	public static void main(String[] args) {
		// create linked list object
		LinkedList<Integer> nums = new LinkedList<>();

		// scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a list of integers (enter any non integer to stop): ");

		// get input
		while (scan.hasNextInt()) {
			int num = scan.nextInt();
			insertAndSort(nums, num);
		}

		// output
		System.out.println("Sorted Linked List: ");
		System.out.println(nums);

	}

}