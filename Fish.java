//Author: Natasha Amiera Binti Azman
public class Fish {
	//attribute or data member or fields
	private String color = "blue";
	//public = others can use
	//Method
	public void Swim (){
		System.out.println(color + " fish swim");
	}
	//Setter / Mutator method
	public void SetColor(String warna){
		//color is parameter
		color = warna;
	}
	//Getter / Acessor method
	public String GetColor() {
		return color;
	}

	//overloading
	public void Swim(int fin) {
		System.out.println("fish swim with " + fin + " fins");
	}
	//polymorphism
	public void Swim(double speed) {
		System.out.println("fish swim at " + speed + " m/s");
	}
	public void Swim(int eat, int hour) {
		System.out.println("fish eat " + eat + "fish every " + hour + " hours");
	}
}