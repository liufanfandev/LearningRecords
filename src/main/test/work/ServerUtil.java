package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUtil {

	public void startAction(){
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(6666);
			System.out.println("服务端服务启动开始监听了。。。。");
			while(true){
				Socket socket = serverSocket.accept();
				new Thread(new MyRuns(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(serverSocket != null){
					serverSocket.close();
					System.out.println("服务端 Socket 关闭！");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ServerUtil server = new ServerUtil();
		server.startAction();
	}
}
class MyRuns implements Runnable{
	
	Socket socket;
	BufferedReader reader;
	BufferedWriter writer;
	
	public MyRuns(Socket socket){
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			//读取客户端数据
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			//向客户端发送数据
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
			String lineString = "";
			while(!(lineString = reader.readLine()).equals("bye")){
				System.out.println("收到客户端的消息是："+lineString);
				writer.write("服务器返回："+lineString+"\n");
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(reader != null){
					reader.close();
				}
				if(writer != null){
					writer.close();
				}
				if(socket != null){
					socket.close();
				}
				System.out.println("服务端连接断开了！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
