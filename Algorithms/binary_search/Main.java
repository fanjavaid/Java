import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] items = { -5, 0, 1, 5, 8, 10, 64 };
		int search = Integer.parseInt(args[0]);
		int foundIndex = binarySearch(items, search);			
		
		System.out.print("Searching ("+ search  +") in " + Arrays.toString(items) + " = ");
		if (foundIndex != -1) {
			System.out.println(foundIndex);
			return;
		}
		System.out.println("not found");
	}

	public static int binarySearch(int[] items, int search) {
		int length = items.length;
		int start = 0;
		int end = length - 1;

		while(start <= end) {
			int middle = (start + end) / 2;
			
			if (search == items[middle]) {
				return middle;
			} else if (search < items[middle]) {
				end = middle - 1;
			} else if (search > items[middle]) {
				// search > middle
				start = middle + 1;
			}
		}		

		return -1;
	}
}
