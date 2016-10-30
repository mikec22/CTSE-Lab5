import java.util.*;
public class DrawCommand implements Command{
	Vector shapes;

	public DrawCommand(Vector shapes){
		this.shapes = shapes;
	}

	public void execute(){
		for (int i = 0; i < shapes.size(); i++)
			( (Shape) shapes.elementAt(i)).draw();
	}

	public void undo(){

	}
}