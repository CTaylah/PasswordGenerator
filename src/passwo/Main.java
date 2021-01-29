package passwo;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many characters for this passord?");
		char[] pass = new char[input.nextInt()];
		String password = genPassword(pass);
		
	    try {
	        File myObj = new File(password);
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		
	}
	
	public static String genPassword(char[] pass) {
		for (int i = 0; i < pass.length; i++) {
			pass[i] = getRandomChar();
		}
		
		return toString(pass);
	}
	
	public static char getRandomChar() {
		int ascii = (int)(Math.random() * 93) + 33;
		char randomChar = (char) ascii;
		return randomChar;
	}
	
	public static String toString(char[] chars) {
		String str = "";
		for (int i = 0; i < chars.length; i++) {
			str = str + chars[i];
		}
		return str;
	}
	
	public static void createFile() {
	    try {
	        File myObj = new File("filename.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
