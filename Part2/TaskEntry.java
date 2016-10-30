public class TaskEntry {

	private long repeatInterval, timeLastDone;
	private Task task;

	public TaskEntry(Task task, long repeatInterval) {
		this.task = task;
		this.repeatInterval = repeatInterval;
		timeLastDone = System.currentTimeMillis();
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task){
		this.task = task;
	}

	public void setTimeLastDone(long timeLastDone){
		this.timeLastDone = timeLastDone;
	}

	public long getTimeLastDone(){
		return timeLastDone;
	}

	public long getRepeatInterval(){
		return repeatInterval;
	}

	public void setRepeatInterval(long repeatInterval){
		this.repeatInterval = repeatInterval;
	}


}