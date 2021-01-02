package com.hemebiotech.analytics;

import java.awt.Desktop;
import java.io.File;
import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.data.processing.CountSymptomDataFromFile;
import com.hemebiotech.analytics.data.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.data.write.WriteSymptomDataToFile;


public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception 
		{	
			//initialize I/O
			String filePathIn = "Project02Eclipse/symptoms.txt";
			String filePathResultOut = "result.out";
			//Get data
			ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filePathIn);
			List <String>symptomsRead =  reader.GetSymptoms();
			//Process data
			CountSymptomDataFromFile counter = new CountSymptomDataFromFile(symptomsRead);
			TreeMap <String , Integer >OrderedSymptoms = counter.SortSymptoms();
			//Return Data
			WriteSymptomDataToFile writer = new WriteSymptomDataToFile(OrderedSymptoms);
			writer.WriteSymptoms(filePathResultOut);
			//create a pop up with the result file  
			Desktop desk = Desktop.getDesktop();
			desk.open(new File(filePathResultOut));
		}

}
