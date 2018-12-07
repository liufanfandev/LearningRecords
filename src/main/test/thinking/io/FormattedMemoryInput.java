package thinking.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {

	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("F:\\666.txt").getBytes()));
			while(true){
				System.out.println((char)in.readByte());
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("End of stream");
		}
	}
	
}
