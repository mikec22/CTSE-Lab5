import java.util.*;
import java.io.*;
public class RectangleCreationFac implements CommandFactory{
	Vector shapes;

	public void setShapes(Vector shapes){
		this.shapes = shapes;
	}

	public Command create() throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter width");
		String line = br.readLine();
		int width = Integer.parseInt(line);
		System.out.println("Enter height");
		line = br.readLine();
		int height = Integer.parseInt(line);
		return new RectangleCreation(shapes, width, height);
	}
}