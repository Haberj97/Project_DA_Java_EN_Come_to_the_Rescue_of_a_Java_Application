package com.hemebiotech.analytics.data.processing;

import java.util.List;
import java.util.TreeMap;



/**
 * @author jhabert
 *
 * Take a list and transform to TreeMap 
 *
 */

public class CountSymptomDataFromFile implements ISymptomCounter
{
	
	
	private List <String> symptomsRead ;
	
	/**
	 * @author jhabert
	 *
	 *@param take list of all Symptoms obtained from a list of data
	 */
	
	public CountSymptomDataFromFile(List <String> symptomsRead) 
		{
			
			this.symptomsRead=symptomsRead;
		}
	

	@Override
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
