// Valeria Benetti 2183227
package benetti6;

class Book {
	//variables
	private String title;
	private String author;
	private int pages;
	private double price;
	public static int numBooks=0;
	//parameterized constructor
	public Book(String title, String author, int pages, double price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		numBooks++;
	}
	//default constructor
	public Book()
	{
		numBooks++;
	}
	//setters and getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static int getNumBooks() {
		return numBooks;
	}
	public static void setNumBooks(int numBooks) {
		Book.numBooks = numBooks;
	}
	@Override
	public String toString() {
	return "Book title=" + title + ", author=" + author + ", pages="
	+ pages + ", price= $" + price;
	}
}
