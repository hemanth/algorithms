public static void heapSort(int[] set, int n) {

for (int k = n/2; k >= 1; k--) {

    // Heapify 

    int v = set[k-1];

    int parent = k, child;

    for (; parent <= n / 2; parent=child) {

	child = parent<<1;


	if (child < n && set[child-1] < set[child]) {

    		child++;

    	}

	if (v >= set[child-1]) break;

	set[parent-1] = set[child-1];

     }

    set[parent-1] = v;

}

// Sort

	for (; n > 1;) {

    		int v = set[n-1];

    		set[--n] = set[0];

    		int parent = 1, child;

    		for (; parent <= n / 2; parent=child) {

			child = parent<<1;

			if (child < n && set[child-1] < set[child]) {

    				child++;

			}

			if (v >= set[child-1]) break;

				set[parent-1] = set[child-1];

    		}

    		set[parent-1] = v;
	
	}

}
