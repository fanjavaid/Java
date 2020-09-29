import java.util.Arrays;

public class MainRecursive {
	public static void main(String[] args) {
		int[] items = { 3, 7, 9, 50, 100, 769 };
		int search = Integer.parseInt(args[0]);
		int foundIndex = binarySearch(items, search, 0, items.length - 1);
		
		System.out.println("Search ("+ search +") in " + Arrays.toString(items));
		if (foundIndex != -1) {
			System.out.println("Found at index " + foundIndex);
			return;
		}

		System.out.println("Not found!");
	}

	private static int binarySearch(int[] items, int search, int start, int end) {
		int middle = (start + end) / 2;
		
		// base case
		if (search == items[middle]) {
			return middle;
		}

		// second base case https://docs.google.com/document/d/1VlzsmY5-n2qhpHTXy5LzwFtcpmK67b42QcGq-MFP33s/edit?usp=sharing
		if (end < start) {
			return -1;
		}

		if (search < items[middle]) {
			return binarySearch(items, search, 0, middle - 1);
		}

		if (search > items[middle]) {
			return binarySearch(items, search, middle + 1, end);
		}

		return -1;
	}
}
