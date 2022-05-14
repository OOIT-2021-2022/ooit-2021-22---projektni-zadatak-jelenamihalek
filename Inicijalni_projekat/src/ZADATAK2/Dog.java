package ZADATAK2;

public class Dog extends Animal {
	
	private boolean hungry;
	
	public Dog() {};
	public Dog( String name, String breed ,boolean hungry)
	{
		super(name, breed);
		this.hungry=hungry;
	} 
	public static int calculateHumanYears (int dogYears)
	{
		return dogYears*15;
	}
	
	
	public void respond()
	{
		System.out.println("Woof woof");
	}
	
	public void namePet(String name)
	{
		setName(name);
	}
	
	public void feed()
	{
		if (this.hungry==true)
		{
			this.hungry=false;
			System.out.println(super.getName()+" is full and happy");
		}
		else System.out.println(super.getName()+ "buries food for rainy days");
	}
	
	public String toString()
	
	{
		return "Name"+super.getName()+"race"+super.getBreed()+ "hungry:"+this.isHungry();
	}
	
	
	

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

}
