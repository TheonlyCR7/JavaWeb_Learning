import java.util.Scanner;
import java.io.*;
import java.

public class p1{
	public static void main(String[] args)throws Exception{
		
		// String OldString = "I Fuck you";
		// String NewString = OldString.replace("Fuck", "love");
		// System.out.println(NewString);

		// String OldString = "I Love you";
		// String NewString1 = OldString.substring(2);
		// String NewString2 = OldString.substring(2, 6);
		// System.out.println(NewString1);
		// System.out.println(NewString2);

		// String OldString = "I Love you";
		// String NewString1 = OldString.toLowerCase();
		// String NewString2 = OldString.toUpperCase();
		// System.out.println(NewString1);
		// System.out.println(NewString2);

		// String OldString1 = "I love you";
		// String OldString2 = "I Fuck you";
		// String NewString = String.join(" and ", OldString1, OldString2);
		// System.out.println(NewString);

		// String OldString = "love";
		// String NewString = OldString.repeat(3);
		// System.out.println(NewString);

		// StringBuilder builder = new StringBuilder();
		// String OldString = "love you"; 
		// builder.append("I");
		// builder.append(" ");
		// builder.append(OldString);
		// String NewString = builder.toString();
		// System.out.println(NewString);

		// Console console = System.console();
		// String username = console.readLine("Username: ");
		// char[] passwd = console.readPassword("PassWord: ");

		// System.out.println("Username: " + username);
		// System.out.println("PassWord: " + String.valueOf(passwd));

		// double x = 1000.0 / 3.0;
		// System.out.println(x);
		// System.out.printf("%8.2f", x);

		Scanner FileIn = new Scanner(Path.of("D:\\Github_NOTES\\JavaWeb_Learning\\Java_core\\TestCode\\myfile.txt"));
		String name = FileIn.nextLine();
		System.out.println("name: " + name);
		// int age = FileIn.nextInt();
		// double length = FileIn.nextDouble();
		// System.out.println("name: " + name);
		// System.out.println("age: " + age);
		// System.out.println("length: " + length);
		Scanner scanner = new Scanner(System.in);
		// PrintWriter FileOut = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);

	} 
}