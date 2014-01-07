
public static int getPeakIndex(int[] arr) {
	int mid = (arr.length()/2) +1;
	for (int i=1; i<mid.length; i++) {
		if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
			return i;
		}
		return -1;
	}
}
