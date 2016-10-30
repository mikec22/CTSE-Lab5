import java.util.*;
import java.io.*;
public class RectangleCreation implements Command {
	Vector shapes;
	Rectangle rectangle;
	public RectangleCreation(Vector shapes,int width, int height){
		this.shapes = shapes;
		rectangle = new Rectangle(width, height);
	}

	public void execute(){
		shapes.add(rectangle);
	}

	public void undo(){
		shapes.remove(rectangle);
	}
}