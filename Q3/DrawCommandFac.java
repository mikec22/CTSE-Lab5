import java.util.*;
public class DrawCommandFac implements CommandFactory {
	Vector shapes;
	

	public void setShapes(Vector shapes){
		this.shapes = shapes;
	}

	public Command create() throws Exception{
		return new DrawCommand(shapes);
	}
}