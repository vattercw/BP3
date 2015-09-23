import java.util.ArrayList;
import java.util.Date;


public class TaskEvaluator {
	
	public ArrayList<Task> tasks;

	public TaskEvaluator(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public int[] findTotalClosedAndOpenByDate(Date endDate) {
		
		int opened = 0;
		int closed = 0;
		int[] set = new int[2];
		
		for(Task task : tasks){
			
			if(task.getCreateDate().before(endDate)){
				if(task.getCloseDate() == null || task.getCloseDate().after(endDate)){
					opened++;
				}else{
					closed++;
				}
				
				
			}
			
		}
		
		set[0] = opened;
		set[1] = closed;
		return set;
	}
	
	
	// ASSUMPTION: if a task was created AND closed between the dates, it will counted as both opened AND
	// closed during that time.
	public int[] findNumberOfClosedAndOpenedBetweenDates(Date beginDate,
			Date endDate) {
		int opened = 0;
		int closed = 0;
		int[] set = new int[2];
		
		for(Task task : tasks){
			if(task.getCreateDate() != null){
				if((task.getCreateDate().equals(beginDate) || task.getCreateDate().after(beginDate)) 
						&& task.getCreateDate().before(endDate)){
					opened++;
				}
			}
			if(task.getCloseDate() != null){
				if((task.getCloseDate().equals(beginDate) || task.getCloseDate().after(beginDate)) 
						&& (task.getCloseDate().before(endDate))){
					closed++;
				}
			}
			
			
			
		}
		
		set[0] = opened;
		set[1] = closed;
		return set;
	}

	// ASSUMPTION: Most recent task is the one with the latest creation date
	public String mostRecentTaskByInstanceId(long instanceIdTest) {
		Task returnedTask = null;
		for(Task task : tasks){
			if(task.getInstanceId() == instanceIdTest){
				if(returnedTask == null || task.getCreateDate().after(returnedTask.getCreateDate())){
					returnedTask = task;
				}
			}
		}
		
		if(returnedTask == null){
			return null;
		}
			
		return returnedTask.getName();
	}

	// ASSUMPTION: Count regardless of opened or closed, just total
	public int numberOfTasksForInstanceId(long instanceIdTest) {
		int numTasks = 0;
		for(Task task : tasks){
			if(task.getInstanceId() == instanceIdTest){
				numTasks++;
			}
		}
		return numTasks;
	}

	public int[] totalNumberOfClosedAndOpenForAssignee(String assigneeTest) {
		int opened = 0;
		int closed = 0;
		int[] set = new int[2];
		
		for(Task task : tasks){
			if(task.getAssignee().equals(assigneeTest)){
				if(task.getCloseDate() == null || task.getCloseDate().after(new Date())){
					opened++;
				}else{
					closed++;
				}
			}
		}

		set[0] = opened;
		set[1] = closed;
		return set;
	}

}
