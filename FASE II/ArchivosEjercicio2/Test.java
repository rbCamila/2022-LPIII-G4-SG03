/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Archivos;

/**
 *
 * @author ACER
 */
import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException
	{
               
		File file = new File("C:\\test\\lear.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int wordCount = 0;
		int characterCount = 0;
		int paraCount = 0;
		
		int sentenceCount = 0;
                
		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				paraCount += 0;
			}
			else {
				characterCount += line.length();
				String words[] = line.split("\\s+");
				wordCount += words.length;
				String sentence[] = line.split("[!?.:]-1");
				sentenceCount  += sentence.length;
			}
		}
		if (sentenceCount >= 1) {
			paraCount++;
		}
                System.out.println("File = "+ file.getName());
                System.out.println("Lines = "+ sentenceCount);
		System.out.println("Words = "+ wordCount);
		System.out.println("Chars = "+ characterCount);
	}
}

