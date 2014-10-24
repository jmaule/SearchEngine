package org.uiowa.cs2820.engine;

import java.util.*;

import org.uiowa.cs2820.engine.Field;

public class Database {
	// Tests Indexer, Database, FieldSearch, and Field classes
	
	private static ArrayList<String> fieldDB = new ArrayList<String>();
	private static ArrayList<ArrayList<String>> valueDB = new ArrayList<ArrayList<String>>();
	
	public static void newContent( String field, String value ){
		for(String s : fieldDB){
			if(s == field){
				int index = fieldDB.indexOf( s );
				valueDB.get(index).add(value);
				return;
			}
		}
		fieldDB.add(field);
		ArrayList<String> newAdd = new ArrayList<String>();
		newAdd.add(value);
		valueDB.add(newAdd);
	}
	
	public static ArrayList<String> getValues(String field){
		int index = fieldDB.indexOf(field);
		return valueDB.get(index);
	}
	
	public static Iterator<String> getFieldIterator(){
		return fieldDB.iterator();
	}
	
}
