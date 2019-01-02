package albany.edu.hw4;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	private Integer red;
	private Integer blue;
	private Integer green;
	
	RGBColor(){
		red = null;
		blue = null;
		green = null;
	}
	
	RGBColor(Integer r, Integer g, Integer b){
		setRed(r);
		setBlue(b);
		setGreen(g);
	}
	
	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		if(red <= 255 && red >= 0) 
			this.red = red;
		else
			System.out.println("Invalid Values: Values must be between 0-255");
	}

	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		if(blue <= 255 && blue >= 0) 
			this.blue = blue;
		else
			System.out.println("Invalid Values: Values must be between 0-255");
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		if(green <= 255 && green >= 0) 
			this.green = green;
		else
			System.out.println("Invalid Values: Values must be between 0-255");
	}
	
	@Override
	public RGBColor complement() {
		setRed(255 - getRed());
		setBlue(255 - getBlue());
		setGreen(255 - getGreen());
		return this;
	}

	@Override
	public RGBColor operator(RGBColor arg) {
		RGBColor newColor = new RGBColor();
		newColor.setRed((this.getRed()+arg.getRed())/2);
		newColor.setBlue((this.getBlue()+arg.getBlue())/2);
		newColor.setGreen((this.getGreen()+arg.getGreen())/2);
		return newColor;
	}
	
	public String toString() {
		return "red: " + this.getRed() + ", green: " + this.getGreen() + ", blue: " + this.getBlue();
	}
}
