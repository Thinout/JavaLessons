package lesson150331.linkedList.anonymous;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIExample {
	
	static class ButtonCLickProcessor implements ActionListener {

		@Override
		public void actionPerformed(final ActionEvent e) { // реакция на нажатие кнопки
			System.out.println("Hello!");
		}
		
	}
	
	public static void main(final String[] args) {
		JFrame frame = new JFrame("Example"); // заголовок нашего окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // если закрываю окно, то программа завершает работу
		frame.setSize(400, 400);
		// frame.show(); // устаревший
		
		JButton button = new JButton("Click me!") {
			@Override
			public Dimension getPreferredSize() {
				return new Dimension(50, 20);
			}
		};
		
		
		button.addActionListener(new ButtonCLickProcessor()); // добавить экземпляр нашего класса в список слушателей
		// он получит сообщение, если на кнопку кликнут
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				System.out.println("Anonymous!");
			}
		});
		
		//frame.add(button);
		
		frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(final MouseEvent e) {
				System.out.println("released");
			}
			
			@Override
			public void mousePressed(final MouseEvent e) {
				System.out.println("pressed");
				
			}
			
			@Override
			public void mouseExited(final MouseEvent e) {
				System.out.println("exited");
				
			}
			
			@Override
			public void mouseEntered(final MouseEvent e) {
				System.out.println("entered");
				
			}
			
			@Override
			public void mouseClicked(final MouseEvent e) {
				System.out.println("clicked");
				
			}
		});
		
		
		
		frame.setVisible(true);
		
		
	}
	
	
}
