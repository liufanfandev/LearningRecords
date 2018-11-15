package thinking.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {

	public static void main(String[] args) throws IOException{
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("F:\\aaa.txt")));
		out.writeDouble(6.666);
		out.writeUTF("刘一凡");
		out.writeUTF("刘一");
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\aaa.txt")));
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readUTF());
	}
}
