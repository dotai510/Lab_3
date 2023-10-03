package Lab_3;

public class Task1_2 {
	private int[] array;

	public Task1_2(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
	    int left = 0;
	    int right = array.length - 1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (array[mid] == target) {
	            return mid;  // Trả về chỉ mục nếu tìm thấy mục tiêu
	        }

	        if (array[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }

	    return -1;  // Trả về -1 nếu không tìm thấy mục tiêu
	}

	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
		// TODO
		return 0;
	}
}
