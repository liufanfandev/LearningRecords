package com.my.thinking.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile extends ArrayList<String>{

	public static String read(String fileName){
		StringBuilder sb = new StringBuilder();
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			try {
				
				String s;
				while((s = in.readLine())!= null){
					sb.append(s);
					sb.append("\n");
				}
			}finally{
					in.close();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void write(String fileName,String text){
		try {
			PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
			out.print(text);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e); 
		}
	}
	
	public TextFile(String fileName,String splitter){
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals(""))
			remove(0);
	}
	
	public TextFile(String fileName){
		this(fileName,"\n");
	}
	public void Write(String fileName){
		try {
			PrintWriter out = new PrintWriter(new FileWriter(new File(fileName).getAbsoluteFile()));
			for(String item : this){
				out.println(item);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		String file = read("F:\\666.txt");
		write("F:\\777.txt", file);
		TextFile textFile = new TextFile("F:\\777.txt");
		textFile.Write("F:\\7772.txt");
		
	}
	
}
