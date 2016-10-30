
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Vector shapes = new Vector();
		String[] factory = {"DrawCommandFac","DeleteShapeFac","CircleCreationFac","RectangleCreationFac"};
		CommandFactory[] facs = new CommandFactory[factory.length];
		boolean cont = true;
		Vector history = new Vector();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try{
			for (int i = 0; i < facs.length; i++){
				facs[i] = (CommandFactory) Class.forName(factory[i]).newInstance();
				facs[i].setShapes(shapes);
			}
			while (cont) {
				System.out.println("Enter command: 0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				String line = br.readLine();
				int command = Integer.parseInt(line);
				if(command == 0)
					cont = false;
				else if (command == 1){
					if(history.size() > 0){
						Command com = (Command) history.remove(history.size() - 1);
						com.undo();
					}
				} else {
					Command com = facs[command - 2].create();
					if (!(com instanceof DrawCommand))
						history.add(com);
					com.execute();
				}
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
