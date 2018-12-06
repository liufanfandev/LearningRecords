package work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;


public class DataToFile {
	static FileWriter fw;
	static PrintWriter pw;
	public static void main(String[] args) {
		 String name = "";
	     String nameStr = "xingming";
	     int value = 0;
	     String desc = "";
	     String descStr = "miaoshu";
	     File f=new File("F:\\777.txt");
	     
	     try {
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	     for (int i = 0; i < 10000 * 100; i++) {
	         name = nameStr +  String.valueOf(i);
	         //value = i;
	         desc = descStr +  String.valueOf(i);
	         Object[] params = {name,value,desc};
	         String msg5 = MessageFormat.format(Command.ITEMADD,params);
	         input(msg5,pw);
	      }
	}
	
	private static void input(String msg,PrintWriter pw ){
		pw.println(msg);
		pw.flush();
	}

}
