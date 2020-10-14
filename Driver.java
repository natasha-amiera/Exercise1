//Author: Natasha Amiera Binti Azman
public class Driver {
	public static void main(String [] arg) {
		//Fish = data type
		Fish nemo = new Fish();
		//nemo -> object, Fish -> class

		nemo.Swim();
		nemo.color = "red";
		nemo.Swim();

		Fish dory = new Fish();

		dory.Swim();
		dory.color = "yellow";
		dory.Swim();
	}
}