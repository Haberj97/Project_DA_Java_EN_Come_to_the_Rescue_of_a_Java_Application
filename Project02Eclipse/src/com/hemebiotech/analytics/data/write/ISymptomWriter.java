package com.hemebiotech.analytics.data.write;

/*
 * 
 * @author jhabert
 * Read the symptoms and their occurrences from a TreeMap then write them line by line to an external file
 *
 */
public interface ISymptomWriter {
/*
* no @return 
*/	
	void WriteSymptoms(String path);

}
