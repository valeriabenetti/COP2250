// Valeria Benetti 2183227


package benetti6;


public class TestBook {
	public static void main(String[] args){
        Book bookArray[] = new Book[6]; // array to hold the 6 object that will be used
        bookArray[0] = new Book("Java Programming", "Liang", 1320, 145.00);
        bookArray[1] = new Book("Horton Hears a Who!","Dr.Seuss", 72, 19.99);
        bookArray[2] = new Book("The Hobbit", "Tolkien", 320, 9.25);
        bookArray[3] = new Book("Born a Crime", "Noah", 304, 17.33);
        bookArray[4] = new Book();
        bookArray[5] = new Book();
        for(Book b:bookArray)
        	// Printing out the current list
            System.out.println(b.toString());
        
        	// Adding a new line
        	System.out.println("\n");
        	
        	// Adding the note for completing books plus the discount
        	System.out.println("Books after completing library and 40% discount");
        finishArray(bookArray);
        Book expensive = reduceBooks(bookArray);
        for(Book b:bookArray)
            System.out.println(b.toString());
        System.out.println("\n");
        System.out.println("Here is the most expensive book after the discounts");
        System.out.println("Most expensive book: " + expensive.toString());
        System.out.println("Size of library: " + bookArray.length + " books");
    }

	// Adding the two new books to the array
    static void finishArray(Book[] array){
        array[4].setTitle("Dark Territory");
        array[4].setAuthor("Kaplan");
        array[4].setPages(352);
        array[4].setPrice(11.24);
      
        array[5].setTitle("Born to Run");
        array[5].setAuthor("Springsteen");
        array[5].setPages(508);
        array[5].setPrice(12.17);
    }
  
    // discounting all of the books
    static Book reduceBooks(Book[] array){
        Book mostExpensiveBook = null;
        for (int i=0; i<6; i++){
            array[i].setPrice(array[i].getPrice()* 0.60);
            if (mostExpensiveBook == null)
                mostExpensiveBook = array[i];
            else if (mostExpensiveBook.getPrice() < array[i].getPrice())
                mostExpensiveBook = array[i];
        }
        return mostExpensiveBook;
    }
}
