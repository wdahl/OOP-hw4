package albany.edu.hw4;
import java.util.BitSet;

public class BinaryWord implements Complementable<BinaryWord> {
	private BitSet binaryWord;
	private int size;
	
	BinaryWord(String binaryString){
		this.setBinaryWord(binaryString);
		this.setSize(binaryString.length());
	}
	
	BinaryWord(){
		binaryWord = null;
		size = 0;
	}
	
	public BitSet getBinaryWord() {
		return binaryWord;
	}
	
	public void setBinaryWord(String binaryString) {
		binaryWord = new BitSet(this.size());
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') {
				binaryWord.set(i);
			}
		}
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int size() {
		return size;
	}
	
	public BinaryWord complement() {
		for(int i=0; i < this.size(); i++) {
			getBinaryWord().flip(i);
		}
		
		return this;
	}
	
	public boolean equals(BinaryWord set2) {
		if(this.binaryWord.equals(set2.getBinaryWord())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String binaryString = "";
		for(int i=0; i<this.size(); i++) {
			if(binaryWord.get(i)) {
				binaryString += "1";
			}
			else {
				binaryString += "0";
			}
		}
		
		return binaryString;
	}
}
