//Author: Natasha Amiera Azman
public class Shark extends Fish {
	private int sharpTeeth = 50;

	public void Eat(){
		System.out.println("Eat with " + sharpTeeth + " number of teeth");
	}

	public void SetSharpTeeth(int teeth) {
		sharpTeeth = teeth;
	}

	public void Swim ()	{
		System.out.println("fish swim with mouth open with " + sharpTeeth);
	}
}