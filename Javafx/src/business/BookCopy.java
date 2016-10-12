package business;

import java.io.Serializable;

/**
 * Immutable class
 * The only question about immutability is whether it ever
 * returns a mutable value -- in particular, whether <code>book</code>
 * is mutable. The only mutable variable in Book is the
 * BookCopy array, but there is no getter for this array. Book
 * is therefore immutable (see Book class comments), and os
 * BookCopy is also immutable.
 *
 */
final public class BookCopy implements Serializable {
	
	private static final long serialVersionUID = -63976228084869815L;
	//每本书的副本都属于一本书
	private Book book;
	//每本书的副本都有好几本，我感觉这个可能就是版本的意思
	private int copyNum;
	//是不是可借的
	private boolean isAvailable;
	//构造函数
	BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	
	BookCopy(Book book, int copyNum) {
		this.book = book;
		this.copyNum = copyNum;
	}
	
	
	public boolean isAvailable() {
		return isAvailable;
	}

	
	public int getCopyNum() {
		return copyNum;
	}
	
	public Book getBook() {
		return book;
	}
	//改变可借性，非此即彼
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof BookCopy)) return false;
		BookCopy copy = (BookCopy)ob;
		return copy.book.getIsbn().equals(book.getIsbn()) && copy.copyNum == copyNum;
	}
	
}
