package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;  

@Entity  
@Table(name = "books")
public class Books  
{  

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int bookId; 

	@Column
	private String bookName;


	@Column
	private String author;  

	@Column
	private double bookCostPrice;

	public Books() {
	}

    public Books(String bookName, String author, double bookCostPrice) {
        this.bookName = bookName;
        this.author = author;
        this.bookCostPrice = bookCostPrice;
    }

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getBookCostPrice() {
		return bookCostPrice;
	}

	public void setBookCostPrice(double bookCostPrice) {
		this.bookCostPrice = bookCostPrice;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookCostPrice="
				+ bookCostPrice + "]";
	}  

	
}  