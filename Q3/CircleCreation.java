import java.util.*;
import java.io.*;
public class CircleCreation implements Command {
	Vector shapes;
	Circle circle;
	public CircleCreation(Vector shapes,int radius){
		this.shapes = shapes;
		circle = new Circle(radius);
	}

	public void execute(){
		shapes.add(circle);
	}

	public void undo(){
		shapes.remove(circle);
	}
}