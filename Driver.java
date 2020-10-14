//Author: Natasha Amiera Binti Azman
public class Driver {
	public static void main(String [] arg) {
		//Fish = data type
		Fish nemo = new Fish();
		//nemo -> object, Fish -> class

		nemo.Swim();
		//nemo.color = "red";
		nemo.SetColor("orange");
		nemo.Swim();

		Shark bruce = new Shark();
		bruce.Eat();
		bruce.Swim();
		bruce.SetSharpTeeth(130);
		bruce.Eat();
		//Fish dory = new Fish();

		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("indigo");
		//dory.Swim();

		//Aquarium fancyAquarium = new Aquarium();
		//fancyAquarium.fillFish();

	}
}