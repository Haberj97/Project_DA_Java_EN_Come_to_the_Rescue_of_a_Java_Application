package com.hemebiotech.analytics.data.processing;

import java.util.TreeMap;

/**
 * 
 * Anything that will read symptom data from a List
 * The important part is, the return value from the operation, which is a ordered Treemap Of String as key and integer as occurrence,
 * that not contain any duplication
 * 
 * The implementation order the list
 *
 *@author jhabert
 */
public interface ISymptomCounter 
{
	/**
	 * If no date is available return an empty treemap  
	 * @return a ordered raw list of symptoms with their occurrences , duplicate are not possible. 
	 *
	 *
	 */
	
	TreeMap<String , Integer> SortSymptoms();
}
