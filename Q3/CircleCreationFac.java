import java.util.*;
import java.io.*;
public class CircleCreationFac implements CommandFactory{
	Vector shapes;

	public void setShapes(Vector shapes){
		this.shapes = shapes;
	}

	public Command create() throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter radius");
		String line = br.readLine();
		int r = Integer.parseInt(line);
		return new CircleCreation(shapes, r);
	}
}