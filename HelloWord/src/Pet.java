
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep(){
		System.out.println("Good nigh! See you tomorow!");
	}
	
	public void eat(){
		System.out.println("I'm very angre, let's snack!");
	}
	
	public String say(String aWord){
		String petResponse = "Well, okay!! " +aWord;
		return petResponse;
	}
	

}