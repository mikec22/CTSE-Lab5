import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Command[] com = new Command[4];
		Stack commandStack = new Stack();
		com[0] = new Command1(0);
		com[1] = new Command1(1);
		com[2] = new Command2(2);
		com[3] = new Command2(3);

		System.out.println("Execute Commands Begin");
		for (Command c : com ) {
			c.execute();
			commandStack.push(c); // add the command in the stack
		}

		System.out.println("\nUndo Commands Begin");
		// undo the commands
		while (!commandStack.empty()) {
			// get the latest command in the stack
			Command c = (Command) commandStack.pop();
			// undo the latest command
			c.undo();
		}
	}
}