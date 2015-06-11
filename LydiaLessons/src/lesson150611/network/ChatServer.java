package lesson150611.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	public static void main(final String[] args) {
		System.out.println("Started listening on port 10001");
		ExecutorService service = Executors.newCachedThreadPool();
		Chat chat = new Chat();
		service.execute(chat);
		
		try (ServerSocket serverSocket = new ServerSocket(10001)) {
			
			while (true) {
				Socket socket = serverSocket.accept();
				ChatClientHandler handler = new ChatClientHandler(service, chat, socket);
//				chat.addClient(handler);
				service.execute(handler);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
