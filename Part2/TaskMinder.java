import java.util.Vector;

public class TaskMinder extends Thread {
	private long sleepInterval, now, repeatInterval, timeLastDone;
	private Vector<TaskEntry> taskEntries = new Vector<TaskEntry>();

	public TaskMinder(long sleepInterval) {
		this.sleepInterval = sleepInterval;
	}

	public void addTaskEntry(TaskEntry taskEntry){
		taskEntries.add(taskEntry);
	}

	public void run(){
		while(true) {
			try {
				//System.out.println(now);
				sleep(sleepInterval);
				now = System.currentTimeMillis();

				for (TaskEntry task : taskEntries){
					repeatInterval = task.getRepeatInterval();
					timeLastDone = task.getTimeLastDone();
					// System.out.println(task.getTimeLastDone());
					//System.out.println("..."+task.getRepeatInterval()+task.getTimeLastDone());
					if (task.getRepeatInterval() + task.getTimeLastDone() <= now) {
						task.getTask().performTask();
						task.setTimeLastDone(now);
					}
				}
			}
			catch (Exception e) {
				System.out.println("Interrupted sleep : " + e);
			}

		}
	}
}