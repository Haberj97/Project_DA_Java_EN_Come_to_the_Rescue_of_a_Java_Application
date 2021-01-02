package com.hemebiotech.analytics.data.write;

/**
 *Read the symptoms and their occurrences from a TreeMap then write them line by line to an external file
 *@author jhabert
 */
public interface ISymptomWriter {
/**
 *no return 
* @param path 
* "Take as param the name and path for create new file" 
* 
*/	
	void WriteSymptoms(String path);

}
