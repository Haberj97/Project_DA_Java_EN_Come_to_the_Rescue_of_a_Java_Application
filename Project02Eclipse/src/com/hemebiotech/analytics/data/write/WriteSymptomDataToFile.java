package com.hemebiotech.analytics.data.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Take a treemap and transform data to an external file 
 *@author jhabert
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	private TreeMap<String,Integer> orderedSymptoms = new TreeMap<String, Integer>();
	
	
	public WriteSymptomDataToFile(TreeMap<String,Integer>orderedSymptoms) 
		{
			this.orderedSymptoms=orderedSymptoms;
		}

	@Override
	public void WriteSymptoms(String path) {
		try {
			FileWriter writer = new FileWriter (path);
			for (Map.Entry<String,Integer> entry : orderedSymptoms.entrySet()) 
				{
					String symptomName = entry.getKey();
					Integer symptomOccurency = entry.getValue();
					System.out.println(symptomName + " = " +symptomOccurency);
					writer.write(symptomName + " = " +symptomOccurency +"\n");
				}
			
			writer.close();
			
			}
		catch(IOException e) {e.printStackTrace();}
		
	}
	


}
