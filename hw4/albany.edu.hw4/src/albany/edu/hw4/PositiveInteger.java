package albany.edu.hw4;

public class PositiveInteger extends Semigroup<PositiveInteger>{
	private Integer positiveInteger;
	
	PositiveInteger(){
		positiveInteger = null;
	}
	
	PositiveInteger(Integer i){
		this.setPositveInteger(i);
	}

	public Integer getPositveInteger() {
		return positiveInteger;
	}

	public void setPositveInteger(Integer positiveInteger) {
		if(positiveInteger >= 0)
			this.positiveInteger = positiveInteger;
	}
	
	@Override
	public PositiveInteger operator(PositiveInteger arg) {
		PositiveInteger newInt = new PositiveInteger(positiveInteger + arg.getPositveInteger());
		return newInt;
	}
	
	public boolean equals(PositiveInteger arg) {
		if(this.getPositveInteger().equals(arg.getPositveInteger())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return positiveInteger.toString();
	}
}
