
public class Fish extends Pet {
	int currentDepth =0;
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		System.out.println("Dive in deep "
				+ howDeep+ " meter");
		System.out.println("I'm in depth of "
				+ currentDepth + " meters below sea level");
		return currentDepth;
	}

}
