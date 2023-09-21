package finallyblockjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockExample {

	public static void main(String[] args) {
		 BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader("example.txt"));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An IOException occurred: " + e.getMessage());
	        } finally {
	            try {
	                if (reader != null) {
	                    reader.close();
	                }
	            } catch (IOException e) {
	                System.out.println("An IOException occurred while closing the reader: " + e.getMessage());
	            }
	        
		

	}
	}
}

