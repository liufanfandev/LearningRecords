package com.my.thinking.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {

	private static String file = "F:\\777.txt";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("F:\\666.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while((s = in.readLine())!= null){
			out.println(lineCount++ +":"+s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}


