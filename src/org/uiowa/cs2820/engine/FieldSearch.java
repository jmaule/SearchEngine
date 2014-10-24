package org.uiowa.cs2820.engine;

import java.util.*;

import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Database;
//import org.uiowa.cs2820.engine.Indexer;

public class FieldSearch {
	public ArrayList<String> findEquals(Field searchF){
		//HashMap<String, Content> database = new HashMap<String, Content>();
		// initialize ArrayList results to return
		ArrayList<String> results = new ArrayList<String>();
		
		
		// ++++++++++++++++++++++++++++++++++++++++++++++++
		Iterator<String> it = Database.getFieldIterator();
		
		// iterate through Database
		while( it.hasNext() ){
			String thisField = it.next();
			if( searchF.getField() == thisField ){
				results = Database.getValues( searchF.getField() );
			}
		}
		// +++++++++++++++++++++++++++++++++++++++++++++++++
		
		/*
		for (Field f: it ) // (int i=0;i<database.size();i++) {
			// check if Fields match
			if (searchF.getField() == database.getFieldIterator())){ // if Fields match
				results.add(database.getValues(searchF)); // add value to results ArrayList
			}
		}
		*/
	
	return results;
	}
}
	

	
	/* findEquals requires a Field input
	 * search for Fields in Database that match Field input
	 * return matching item(s): identifier, key, value? 
	 */
	// public void findEquals(Field searchField)
	// set up result holder
	// iterate thru Database
	// if item's Field == searchField
		// match found
		// add to result
		// go to next item
	// else item's Field != searchField
		// not a match
		// go to next item
	// return result

