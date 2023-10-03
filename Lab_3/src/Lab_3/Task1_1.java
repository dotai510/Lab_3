package Lab_3;

public class Task1_1 {
	private int[] array;

	public Task1_1(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		int[] arr1 = this.array;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == target) {
				return i;
			}
		}

		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		    return recursiveLinearSearch(target, 0);
		}

		private int recursiveLinearSearch(int target, int startIndex) {
		    if (startIndex >= array.length) {
		        return -1;  // Trả về -1 nếu không tìm thấy mục tiêu trong mảng
		    }

		    if (array[startIndex] == target) {
		        return startIndex;  // Trả về chỉ mục nếu tìm thấy mục tiêu tại chỉ mục hiện tại
		    }

		    // Gọi đệ quy để tìm kiếm phần còn lại của mảng
		    return recursiveLinearSearch(target, startIndex + 1);
		}


	public static void main(String[] args) {
		int[] arr1 = { 12, 10, 9, 45, 2, 10, 10, 45, 45 };
		int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		Task1_1 arr2 = new Task1_1(arr1);
		Task1_1 arr3 = new Task1_1(array);
		System.out.println(arr2.iterativeLinearSearch(45));
		System.out.println(arr3.recursiveLinearSearch(15));
	}
}
