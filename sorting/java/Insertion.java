import java.util.LinkedList;
public class Merge<E extends Comparable<? super E>> {
	public LinkedList<E> mergeSort(LinkedList<E> m){
		if(m.size() <= 1) return m;
 
		int middle= m.size() / 2;
		LinkedList<E> left= new LinkedList<E>();
		for(int i= 0;i < middle;i++) left.add(m.get(i));
		LinkedList<E> right= new LinkedList<E>();
		for(int i= middle;i < m.size();i++) right.add(m.get(i));
 
		right= mergeSort(right);
		left= mergeSort(left);
		LinkedList<E> result= merge(left, right);
 
		return result;
	}
 
	public LinkedList<E> merge(LinkedList<E> left, LinkedList<E> right){
		LinkedList<E> result= new LinkedList<E>();
 
		while(!left.isEmpty() && !right.isEmpty()){
			//change the direction of this comparison to change the direction of the sort
			if(left.peek().compareTo(right.peek()) <= 0) result.add(left.remove());
			else result.add(right.remove());
		}
 
		result.addAll(left);
		result.addAll(right);
		return result;
	}
}
