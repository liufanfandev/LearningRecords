package thinking.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPCompress {

	public static void main(String[] args) throws IOException {
		BufferedReader in  = new BufferedReader(new FileReader("F:\\666.txt"));
		BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("F:\\test.gz")));
		System.out.println("Writing file:");
		int c ;
		while((c = in.read()) != -1){
			out.write(c);
		}
		in.close();
		out.close();
		System.out.println("Reading file:");
	}
}
