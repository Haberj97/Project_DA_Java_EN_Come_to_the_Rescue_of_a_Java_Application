package com.hemebiotech.analytics.data.processing;

import java.util.List;
import java.util.TreeMap;
/**
 *take list of all Symptoms obtained from a list of data
 *@author jhabert
 */
public class CountSymptomDataFromFile implements ISymptomCounter
{
	
	
	private List <String> symptomsRead ;
	
	/**
	 *@param symptomsRead
	 *take list of all Symptoms obtained from a list of data
	 * 
	 *@author jhabert
	 */
	
	public CountSymptomDataFromFile(List <String> symptomsRead) 
		{
			
			this.symptomsRead=symptomsRead;
		}
	

	
	
	/**
	 *@return symptomsSorter "return an ordered list of symptoms "
	 *@author jhabert
	 *
	 */
	
	public TreeMap<String, Integer> SortSymptoms() 
		{
			TreeMap<String , Integer>symptomsSorter=new TreeMap<String, Integer>();
			
			for (String string : symptomsRead) 
				{
					
					if (symptomsRead.size()>0)
						
						{
							try {
									if (!symptomsSorter.containsKey(string)) 
										{
											symptomsSorter.put(string ,1 );
										} 
									else 
										{
											symptomsSorter.put(string,symptomsSorter.get(string)+1);
										}
								} 
							catch (Exception e) 
								{ 
									e.printStackTrace();
								}
						
						 }
				}
			return symptomsSorter;
		}
	

}
