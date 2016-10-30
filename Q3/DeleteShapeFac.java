import java.util.*;
import java.io.*;
public class DeleteShapeFac implements CommandFactory{
	Vector shapes;
	public void setShapes(Vector shapes){
		this.shapes = shapes;
	}

	public Command create() throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.print("Enter index of the shape: ");
		String line = br.readLine();
		int index = Integer.parseInt(line);
		return new DeleteShape(index, shapes);
	}
}