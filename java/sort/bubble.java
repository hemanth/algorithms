/*java.util.Arrays.sort(...) and java.util.Collections.sort(...) are best
This is just to understand the algorithm */

public static void bubbleSort(int[] set) {
    int n = set.length;
    for (int pass=1; pass < n; pass++) { 
        for (int i=0; i < n-pass; i++) {
	    // Decide the order
            if (set[i] > set[i+1]) {
                // Swap elements 
                int tmp = set[i];  x[i] = x[i+1];  x[i+1] = tmp;
            }
        }
    }
}

