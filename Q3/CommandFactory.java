import java.util.*;
public interface CommandFactory{
	abstract public void setShapes(Vector shapes);
	abstract public Command create() throws Exception;
}