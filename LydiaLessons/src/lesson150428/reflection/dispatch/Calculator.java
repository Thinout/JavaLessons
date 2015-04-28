package lesson150428.reflection.dispatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lesson150428.reflection.dispatch.Command.Plus;

public class Calculator {
	
	public void process(final Command command) {
		switch(command.getID()) {
		case Command.NONE:
			break;
		case Command.PLUS:
			doPlus();
			break;
		case Command.MINUS:
			doMinus();
			break;
		case Command.CLEAR:
			doClear();
			break;
		case Command.GET:
			doGet();
			break;
		}
		
	}
	
	public void execute(final Command command) {
//		if (command.getClass() == Command.Plus.class) {
//			doPlus();
//		}
		
		Class clazz = command.getClass();
		String commandProcessorMethodName = "do" + clazz.getSimpleName();
		for (Method method : this.getClass().getDeclaredMethods()) {
			System.out.println(method.getName());
			if (method.getName().equals(commandProcessorMethodName)) {
				try {
					method.invoke(this);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private void doGet() {
		// TODO Auto-generated method stub
		
	}

	private void doClear() {
		// TODO Auto-generated method stub
		
	}


	private void doMinus() {
		// TODO Auto-generated method stub
		
	}

	private void doPlus() {
		System.out.println("--------PLUS-------");
	}
	
	public static void main(final String[] args) {
		Calculator calculator = new Calculator();
		Plus plus = new Plus();
		calculator.execute(plus);
	}
	
}
