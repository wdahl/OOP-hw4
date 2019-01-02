package albany.edu.hw4;

import java.util.ArrayList;

public class Testing {
	public static void main(String[] args) {
		BinaryWord binaryWord = new BinaryWord("001011");
		
		PositiveInteger positiveInteger = new PositiveInteger(2);
		PositiveInteger int2 = new PositiveInteger(2);
		
		RGBColor color = new RGBColor(32, 96, 128);
		RGBColor color2 = new RGBColor(0, 99, 255);
		
		ArrayList<PositiveInteger> integers = new ArrayList<>();
		integers.add(positiveInteger);
		integers.add(int2);
		
		ArrayList<RGBColor> colors = new ArrayList<>();
		colors.add(color);
		colors.add(color2);
		
		System.out.println("Complement of binaryWord: " + binaryWord.complement());
		
		System.out.println("Operation on PositiveIntegers: " + positiveInteger.operator(int2));
		
		System.out.println("Blended Color: " + color.operator(color2));
		System.out.println("Complement of color: " + color.complement());
		
		System.out.println("Combining Positive Integers in a Collection: " + Semigroup.combine(integers));
		
		System.out.println("Combining Colors in a collection: " + Semigroup.combine(colors));
	}
}
