package JogoDaForca;

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String Args[]) throws IOException{ 
	File txt = new File("C:\\Users\\diogo\\git\\jogoDaForca\\JogoDaForca\\src\\JogoDaForca/dictionary.txt");
	int lifes = 6;
	Scanner scf  = new Scanner(txt);
	
	ArrayList<String> words = new ArrayList<>();
		while(scf.hasNextLine()){
			words.add(scf.nextLine());	
		}
	String hidden = words.get((int)Math.random() * words.size());
	
	char[] hidden_arr = hidden.toCharArray(); 
	char [] ans = new char[hidden_arr.length];
	for (int i = 0; i < hidden_arr.length; i++) {
		ans[i] = '?';
		
	}
	Scanner sc = new Scanner(System.in);
	boolean finished = false;
	while(finished == false) {
		
		String input = sc.nextLine();
		while (input.length() !=1 || Character.isDigit(input.charAt(0))) {
			System.out.println("Enter a valid argument");
			input = sc.nextLine();
		}
	boolean found  = false;
	for (int i = 0; i < hidden_arr.length; i++) {
		if(input.charAt(0) == hidden_arr[i]) {
			ans[i] = hidden_arr[i];
			found = true;		
		}
	}
	if(!found) {
		lifes--;
		
	}
		boolean done = false;
		for (int j = 0; j < ans.length; j++) {
			if(ans[j] == '?') {
			System.out.println(" _");
			done = true;
			
			}else {
				System.out.println(""+ ans[j]);
			}
		
		}
		System.out.println("\n" + "Lives left" + " " +  lifes);
		
		if(done) {
			System.out.println("Congrats you found the word.");
			
		}
	
		if(lifes <= 0) {
		finished = true;
		System.out.println("Oh oh you lost");
			
			}
		}

	}
}
