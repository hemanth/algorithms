// Arrays.binarySearch or Collections.binarySearch can be used
int binarySearch(int[] tosearch, int key, int lb, int ub) {

      if (lb > ub)

            return -1;

      int middle = (lb + ub) / 2;

      if (array[middle] == key)

            return middle;

      else if (array[middle] > key)

            return binarySearch(array, key, lb, middle - 1);

      else

            return binarySearch(array, key, middle + 1, ub);           

}
