package ZADATAK1;

public class BookTest {
	public static void main (String[] args)
	{
		Book bookOne=new Book();
		Book bookTwo=new Book("Dan Brown", "Digital Forttress",900, 450);
		bookOne.setName("Inferno");
		bookOne.setAuthor("Dan Brown");
		bookOne.setNumberOfPages(950);
		bookOne.setPrice(450);
		System.out.println(bookOne.calculateDiscountPrice(15));
		if(bookOne.calculateDiscountPrice(15)>bookTwo.calculateDiscountPrice(20))
				{
			System.out.println(bookOne.getName()+" "+bookOne.getAuthor());
				}
		else
			System.out.println(bookTwo.getName()+" "+bookTwo.getAuthor());
	
	
}
}
