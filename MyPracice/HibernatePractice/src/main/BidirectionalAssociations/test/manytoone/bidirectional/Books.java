package test.manytoone.bidirectional;

public class Books {

	Integer bookId;
	String bookName;
	Double bookPrice;
	Author author;

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * @param bookId
	 *            the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName
	 *            the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the bookPrice
	 */
	public Double getBookPrice() {
		return bookPrice;
	}

	/**
	 * @param bookPrice
	 *            the bookPrice to set
	 */
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
