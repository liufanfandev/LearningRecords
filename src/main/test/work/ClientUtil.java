package work;

import java.io.*;
import java.net.Socket;
import java.text.MessageFormat;

/**
 * Created by liuyf on 2018/11/5.
 */
public class ClientUtil {

    //private static String ip = "172.18.15.45";
    private static String ip ;
    //private static int loginPort = 2004;
    //private static int pagePort = 8899;
    private static int pagePort;
    private static Socket socket = null;
    private static BufferedReader reader=null;
    private static BufferedWriter writer=null;
    
    private static DataOutputStream out = null;
    private static DataInputStream in = null; 

   /* private static String configPath = Thread.currentThread()
            .getContextClassLoader().getResource("").getPath()
            + "socket.properties";*/

    public static void main(String[] args) {
    	final String msg = "show item";
    	//final String msg2 = "del item all";
    	final String msg3 = MessageFormat.format("show item name ''{0}''" ,"11");
    	
    	String str = getPageMessage(msg);
        System.out.println("str:"+str);
       String str2 = getPageMessage(msg);
        System.out.println("str2:"+str2);
        String str3 = getPageMessage(msg3);
        System.out.println("str3:"+str3);
        String str4 = getPageMessage(msg3);
        System.out.println("str4:"+str4);
       
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){

                    try {
                        
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });*/
    }

    /**
     * 向服务端发送请求，并获取服务端返回的内容
     * @param msg 像服务端发送的消息
     * @return 服务端返回的消息
     */
    public static String getPageMessage(String msg){
        StringBuilder sb = new StringBuilder();
        try {
            if(socket == null){
                ip = "172.18.15.45";
                pagePort = 2005;
                socket = new Socket(ip, pagePort);
               out = new DataOutputStream(socket.getOutputStream());
                in = new DataInputStream(socket.getInputStream());
               /* reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
               writer.write(msg+"\n");
                writer.flush();
                String str= reader.readLine();
                System.out.println("number one"+str);*/
            }
           /*writer.write(msg+"\n");
            writer.flush();
            String lineResult = reader.readLine();
            sb.append(lineResult);*/
            out.write(msg.getBytes());
            byte[] buff = new byte[1024];
    		int len = 0;
    		while (len == 0) {  
    			len = in.available();  
    	    } 
    		byte[] b = new byte[len];  
    	    int result = in.read(b); 
    	    String echoData = new String(b, 0, result);
    	    sb.append(echoData);
        } catch (IOException e) {
            e.printStackTrace();
            closeSocket();
        }
        return sb.toString();
    }

    public static void closeSocket(){
        try {
            writer.close();
            reader.close();
            socket.close();
            writer = null;
            reader = null;
            socket = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
