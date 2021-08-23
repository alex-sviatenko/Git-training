package it.discovery.model;

import lombok.Data;

/**
 * Book in a library
 *
 */
@Data
public class Book {
	private int id;
	
	private String name;
	
	/**
	 * Publishing year
	 */
	private int year;
	
	/**
	 * Total number of pages
	 */
	private int pages;
	
}
