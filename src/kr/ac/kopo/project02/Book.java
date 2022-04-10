package kr.ac.kopo.project02;

import java.io.Serializable;

public class Book implements Serializable{
	private String bookName;	// 책이름
	private String bookWriter;	// 저자
	private String publisher;	// 출판사
	private int bookNumber;		// 책번호
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName, String bookWriter, String publisher, int bookNumber) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public String getPublisher() {
		return publisher;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookWriter=" + bookWriter + ", publisher=" + publisher
				+ ", bookNumber=" + bookNumber + "]";
	}
} 
