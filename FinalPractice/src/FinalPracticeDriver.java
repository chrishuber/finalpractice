import java.util.List;
import java.util.ArrayList;

public class FinalPracticeDriver {

	public static void main(String[] args) {
		// paper books
		Book GoT = new Book("Game of Thrones", "George R.R. Martin", 1996, 9.99, true, Book.BookType.FICTION);
		Book Harry_Potter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1998, 6.98, true, Book.BookType.FICTION);
		Book Working = new Book("Working", "Studs Terkel", 1974, 14.37, true, Book.BookType.NON_FICTION);

		// e-books
		ElectronicBook Snow_Crash_E = new ElectronicBook("Snow Crash", "Neil Stephenson", 1992, 9.99, true, Book.BookType.FICTION);
		ElectronicBook Washington_A_Life_E = new ElectronicBook("Washington: A Life", "Ron Chernow", 2010, 16.99, true, Book.BookType.NON_FICTION);
		
		// audio books
		AudioBook Washington_A_Life_A = new AudioBook("Washington: A Life", "Ron Chernow", 2010, 55.95, true, Book.BookType.NON_FICTION);

		List<Book> books = new ArrayList <Book>();
		books.add(GoT);
		books.add(Harry_Potter);
		books.add(Working);
		books.add(Snow_Crash_E);
		
		List<ElectronicBook> eBooks = new ArrayList <ElectronicBook>();
		eBooks.add(Snow_Crash_E);
		eBooks.add(Washington_A_Life_E);

		List<Book> audioAndPaper = new ArrayList<Book>();
		audioAndPaper.add(Harry_Potter);
		audioAndPaper.add(Working);
		audioAndPaper.add(Washington_A_Life_A);

		// System.out.println(books);
		System.out.println(ebookCount(books));
		System.out.println(ebookCount(eBooks));
		System.out.println(audioBookCount(audioAndPaper));
		
		System.out.println("Winter is coming.");
	}

	public static int ebookCount(List <? extends Book> allBooks) {
		int i = 0;
		
		for (Book book: allBooks) {
			if (book instanceof ElectronicBook) {
				i += 1;
			}
		}
		
		return i;
	}

	public static int audioBookCount(List <? super AudioBook> allBooks) {
		int i = 0;
		
		for (Object book: allBooks) {
			if (book instanceof AudioBook) {
				i += 1;
			}
		}
		
		return i;
	}
	
}
