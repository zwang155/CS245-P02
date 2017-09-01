package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Recursive";
	}

	@Override
	public int search(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		return searchH(arr, target, 0, arr.length-1);
	}
	
	public int searchH(int[] arr, int target, int min, int max) {
		if (min > max) {
			return -1;
		}
		int mid = (min + max) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (arr[mid] > target) {
			return searchH(arr, target, min, mid-1);
		}
		return searchH(arr, target, mid+1, max);
	}

}
