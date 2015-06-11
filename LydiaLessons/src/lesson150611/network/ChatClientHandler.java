package lesson150611.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatClientHandler implements Runnable {
	
	private static Random random = new Random();
	private static ExecutorService _sender = Executors.newCachedThreadPool();
	
	private Socket _socket;
	private PrintStream _ps;
	private String _name;
	private Chat _chat;
	private int _delay;

	public ChatClientHandler(final ExecutorService executor, final Chat chat, final Socket socket) {
		_chat = chat;
		_socket = socket;
		_sender = executor;
		_delay = random.nextInt(10000);
	}
	
	@Override
	public void run() {
		
		_chat.addClient(this);
		
		try {
			_ps = new PrintStream(_socket.getOutputStream());
			_ps.print("Enter your name: ");
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}
		
		try (Scanner scanner = new Scanner(_socket.getInputStream());) {
			
			_name = scanner.nextLine();
			_ps.println("Welcome, " + _name + "!");
			while(scanner.hasNextLine()) {
				process(scanner.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void process(final String nextLine) {
		if(nextLine.equals("!bye")) {
			_chat.broadcast(_name + " > " + "bye-bye");
			try {
				_socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		_chat.broadcast(_name + " > " + nextLine);
	}

	public void send(final String message) {
		_sender.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(_delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				_ps.println(message);	
			}
		});	
	}
}
