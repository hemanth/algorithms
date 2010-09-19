/**
 * @author hemanth.hm
 * Site : www.h3manth.com
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static <E extends Comparable<? super E>> void bubbleSort(E[] comparable) {
	    boolean changed = false;
	    do {
	        changed = false;
	        for (int a = 0; a < comparable.length - 1; a++) {
	            if (comparable[a].compareTo(comparable[a + 1]) > 0) {
	                E tmp = comparable[a];
	                comparable[a] = comparable[a + 1];
	                comparable[a + 1] = tmp;
	                changed = true;
	            }
	        }
	    } while (changed);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	   Comparable tosort [] = {0,1,-2,-4,6,8,9,99};
		
		BubbleSort.bubbleSort(tosort);
		
		 for (Comparable sorted : tosort) {
	         System.out.println(sorted);
	       }
	}
}
