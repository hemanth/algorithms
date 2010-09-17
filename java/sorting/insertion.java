static void insertionSort(int[] set) {

      int i, j, toInsert;

      for (i = 1; i < set.length; i++) {
            toInsert = set[i];
            j = i;
            while (j > 0 && set[j - 1] > toInsert) {
                  set[j] = set[j - 1];
                  j--;
            }
            set[j] = toInsert;
      }
}
