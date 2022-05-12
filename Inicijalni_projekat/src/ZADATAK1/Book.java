package ZADATAK1;

public class Book {
	
	private String name;
	private String author;
	private int numberOfPages;
	private double price;
	
	public Book() {};
	public Book (String name, String author, int numberOfPages)
	{
		this.name=name;
		this.author=author;
		this.numberOfPages=numberOfPages;
	}
	public Book(String name, String author, int numberOfPages, double price)
	{
		this(name,author,numberOfPages);
		this.price=price;
	}
	
	private double calculateDiscount (int discount)
	{
		return this.price*discount;
	}
	public double calculateDiscountPrice(int discount)
	{
		return this.price-this.calculateDiscount(discount);
	}
	
	
	
	public String getName()
	
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		if (numberOfPages>0)
		{
		this.numberOfPages = numberOfPages;
		}
		else System.out.println("Unesi drugi broj");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
		{
		this.price = price;
		}
		else System.out.println("Unesi drugi broj");
	}
	

}
