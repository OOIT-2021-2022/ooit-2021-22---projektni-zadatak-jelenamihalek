package ZADATAK2;

public class TestDog extends Dog {
	
	public static void main (String [] args)
	{
		Dog dogOne=new Dog("Bethoven","St.Bernard",false);
		Dog dogTwo=new Dog("Boby", "Badger dog", true);
		
		dogOne.feed();
		System.out.println(dogOne);
		System.out.println(dogTwo);
		
		System.out.println(calculateHumanYears(3));
	}

}
