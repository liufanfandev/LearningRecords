package com.my.thinking.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OSExecute {

	public static void commond(String commond){
		boolean err =false;
		
		try {
			Process process = new ProcessBuilder(commond.split(" ")).start();
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			while((s = in.readLine()) != null){
				System.out.println(s);
			}
			BufferedReader errs = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while((s = errs.readLine()) != null){
				System.err.println(s);
				err = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
			if(!(commond.startsWith("CMD/C"))){
				commond("CMD/C"+commond);
			}else{
				throw new RuntimeException();
			}
		}
		if(err){
			throw new OSExecuteException("Error executing "+commond);
		}
	}
}
