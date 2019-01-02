package albany.edu.hw4;

import java.util.Collection;

public abstract class Semigroup<T> {	
	public abstract T operator(T arg);
	
	public static <T extends Semigroup<T>> T combine(Collection<T> collection) {
		T acumulator = null;
		for(T e : collection) {
			if(acumulator == null) {
				acumulator = e;
			}
			else {
				acumulator = acumulator.operator(e);
			}
		}
		return acumulator;
	}
}
