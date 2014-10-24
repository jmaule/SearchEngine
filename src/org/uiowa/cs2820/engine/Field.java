package org.uiowa.cs2820.engine;

/**
 * Joe Maule
 * CS2820, Fall 14
 * Group 4
 * 
 * Creates a Field object with a fieldName and value (key,value) pair.
 * Used by an Indexer to store into a Database.
 */

class Field {
	
	private String fieldName;
	private String value;
	
	// Constructor
	Field( String fieldName, String value ){
		this.fieldName = fieldName;
		this.value = value;
	}
	
	// Get() methods
	public String getField(){
		return fieldName;
	}
	
	public String getWord(){
		return value;
	}
	
	// Printable version of Field and its values
	public String toString(){
		return "Field: " + fieldName + ", Value: " + value;
	}
}
