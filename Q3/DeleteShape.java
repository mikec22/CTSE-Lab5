import java.util.*;
public class DeleteShape implements Command{
	Vector shapes;
	Shape shape;
	int index;

	public DeleteShape(int index, Vector shapes){
		this.index = index;
		this.shapes = shapes;
	}

	public void execute(){
		if (index >= 0 && index < shapes.size()){
			shape = (Shape) shapes.remove(index);
		} else {
			System.out.print("out range");
		}
	}

	public void undo(){
		if(shape != null){
			shapes.add(index, shape);
		}
	}
}