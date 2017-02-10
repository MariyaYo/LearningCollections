package TreeSet;

import java.util.Comparator;

public class ByTypeComparator implements Comparator<Tea>{

	@Override
	public int compare(Tea t1, Tea t2) {
		return t1.getType().compareTo(t2.getType());
	}
}
