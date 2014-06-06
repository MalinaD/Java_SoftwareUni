package homework3LoopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileReader;

public class SumNumbersFromTextFile {

	public static void main(String[] args) {
		BufferedReader reader;
        int sum = 0;
        try {
                reader = new BufferedReader(new FileReader("src/input.txt"));
                String line = null;
                while ((line = reader.readLine()) != null) {
                   int number = Integer.parseInt(line);
                   sum+=number;
                }
                System.out.println("The sum from the numbers within the file is " +sum);
        }
        catch (Exception e) {
                System.out.println("Error");
        }

	}

}
