package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris {
	
	protected static final Color[] COLORS = {Color.black, Color.yellow, Color.blue, 
		Color.red, Color.green };

	public static void main(final String[] args) {
		
		Model model = new Model();
		
		//controller является слушателем сообщений
		final Controller controller = new Controller();
		model.addListener(controller);
		
		//controller будет осуществлять отсылку сообщений
		//во view
		View view = new View();
		controller.setView(view);
		controller.setModel(model);
		
		//Создаем фрейм и говорим, что при его закрытии 
		//процесс должен завершиться
		JFrame frame = new JFrame("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 700));
		
		//Адаптер кнопок для передачи сообщений только
		//о нажатии
		frame.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(final KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					controller.moveLeft();
					break;
				case KeyEvent.VK_RIGHT:
					controller.moveRight();
					break;
				case KeyEvent.VK_DOWN:
					controller.dropDown();
					break;

				default:
					break;
				}
			}
		});
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					controller.moveDown();
				}
			}
		
		});
		thread.setDaemon(true);
		thread.start();
		
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
		
		final Graphics2D graphics = (Graphics2D)panel.getGraphics();
		
		view.setGraphics(new Graphics() {
			
			@Override
			public void fillRect(final int x, 
					final int y, 
					final int width, 
					final int height, 
					final int colorIndex) {
				graphics.setColor(COLORS[colorIndex]);
				graphics.fillRect(x, y, width, height);
			}
		});		
	}	
}
