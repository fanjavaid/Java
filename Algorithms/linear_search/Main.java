public class Main {
	public static void main(String[] args) {
		int[] items = { 4, 9, 0, 100, -1, 7, 8, 3 };
		int foundIndex = linearSearch(items, 7);

		if (foundIndex != -1) {
			System.out.println("Found at index : " + foundIndex);
			return;
		}
		System.out.println("Item not found!");
	}

	public static int linearSearch(int[] items, int search) {
		int length = items.length;
		for(int i = 0; i < length - 1; i++) {
			if (items[i] == search) {
				return i;
			}
		}
		return -1;
	}
}
