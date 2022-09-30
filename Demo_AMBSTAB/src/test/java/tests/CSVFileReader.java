package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
	
	public static final String delimiter = ",";

	  public static String[][] getCSVdata(String csvFile, int rows, int columns) {
	    try {
	      File file = new File(csvFile);
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	      String line = "";
	      String[] tempArr;
	      int iteration = 0;
	      String[][] data = new String[rows][columns];

	      while ((line = br.readLine()) != null) {
	        tempArr = line.split(delimiter);
	        for(int i=0; i<columns; i++) {
	          data[iteration][i] = tempArr[i];
	        }
	        iteration++;
	      }

	      br.close();
	      return data;
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	    return null;
	  }

}
