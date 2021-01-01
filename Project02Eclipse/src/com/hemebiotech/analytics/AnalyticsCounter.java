package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.hemebiotech.analytics.data.processing.CountSymptomDataFromFile;
import com.hemebiotech.analytics.data.read.ReadSymptomDataFromFile;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		
		//Jha => Adding ReadSymptomDataFromFile + test in same time
		
		System.out.println("Test de ReadSymptomDataFromFile () : ");
		ReadSymptomDataFromFile reader1 = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		
		//Jha => Adding use of CountSymptomDataFromFile
		CountSymptomDataFromFile counter1 = new CountSymptomDataFromFile(reader1.GetSymptoms());
		System.out.println(counter1.sortSymptoms());
		
		System.out.println("Nous revenons au programme initial :");
		//Jha => Return to initial program 
		
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}

	private static List<String> List(List<String> getSymptoms) {
		// TODO Auto-generated method stub
		return null;
	}
}
