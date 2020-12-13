
public class Book extends Item implements Comparable<Item> {
	enum BookType {
		FICTION, NON_FICTION;
	}

	private String title, author;
	private int publishYear, expectedSales, actualSales;
	double cost;
	boolean availableDigital;
	BookType type;
	
	public Book(String title, String author, int publishYear, double cost, boolean availableDigital, BookType bookType) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		this.cost = cost;
		this.availableDigital = availableDigital;
		this.type = bookType;
	}
	
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
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public int getExpectedSales() {
		return expectedSales;
	}
	public void setExpectedSales(int expectedSales) {
		this.expectedSales = expectedSales;
	}
	public int getActualSales() {
		return actualSales;
	}
	public void setActualSales(int actualSales) {
		this.actualSales = actualSales;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean isAvailableDigital() {
		return availableDigital;
	}
	public void setAvailableDigital(boolean availableDigital) {
		this.availableDigital = availableDigital;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	
	@Override
	public int compareTo(Item item) {
		if (item instanceof Book) {
			Book otherBook = (Book) item;
			return this.compareTo(otherBook);
		}
		else {
			throw new IllegalArgumentException("Must compare Book items to Book items");
		}
	}

}
