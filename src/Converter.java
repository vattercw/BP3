import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class Converter {

	public ArrayList<Task> convertToTask(JSONArray tasks) {
		
		ArrayList<Task> taskList = new ArrayList<Task>();
		
		for(Object jsonObject : tasks){
			
			JSONObject taskObject = (JSONObject) jsonObject;
			
			Date dueDate = convertTime(taskObject, "dueDate");
			Date closeDate = convertTime(taskObject, "closeDate");
			Date createDate = convertTime(taskObject, "createDate");
			
			Task task = new Task(
					(String) taskObject.get("instanceName"),
					(Date) dueDate,
					(String) taskObject.get("priority"),
					(Date) closeDate,
					(String) taskObject.get("instanceStatus"),
					(String) taskObject.get("assigneeType"),
					(Date) createDate,
					(String) taskObject.get("name"),
					(String) taskObject.get("url"),
					(String) taskObject.get("assignee"),
					(long) taskObject.get("instanceId"),
					(String) taskObject.get("status"),
					(String) taskObject.get("variables").toString(),
					(String) taskObject.get("processName"),
					(String) taskObject.get("id")
					);
			
			taskList.add(task);
			
		}
		
		return taskList;
	}

	private Date convertTime(JSONObject taskObject, String dateString) {
		if((String)taskObject.get(dateString) != null){
		Calendar cal = javax.xml.bind.DatatypeConverter.parseDateTime((String)taskObject.get(dateString));
		return cal.getTime();
		}else{
			return null;
		}
		
	}

}
