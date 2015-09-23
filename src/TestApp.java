import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONArray;


public class TestApp {

	public static void main(String[] args) throws ParseException {
		Parser parser = new Parser();
		JSONArray jsonTasks = parser.parseJSON("task-2.json");
		
		Converter converter = new Converter();
		ArrayList<Task> tasks = converter.convertToTask(jsonTasks);
		
		TaskEvaluator evaluator = new TaskEvaluator(tasks);
		
		long instanceIdTest = 680;
		String assigneeTest = "Impact 2014";
		String beginStr = "12-3-2012 24:00:00";
		String endStr = "12-10-2015 24:00:00";
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		Date beginDate = dateFormat.parse(beginStr);
		Date endDate = dateFormat.parse(endStr);
		System.out.println(beginDate);
		System.out.println(endDate);
		
		int[] openClosed = evaluator.findTotalClosedAndOpenByDate(endDate);
		System.out.println("Open tasks: " + openClosed[0] + " Closed tasks: " + openClosed[1]);
		
		int[] openClosedBetween = evaluator.findNumberOfClosedAndOpenedBetweenDates(beginDate, endDate);
		System.out.println("Opened tasks: " + openClosedBetween[0] + " Closed tasks: " + openClosedBetween[1] + " between " + beginDate + " and " + endDate + " (non-exclusive)");
		
		System.out.println(evaluator.mostRecentTaskByInstanceId(instanceIdTest) + " is the most recently created task for " + instanceIdTest);
		
		System.out.println(evaluator.numberOfTasksForInstanceId(instanceIdTest) + " tasks for " + instanceIdTest);
		
		int[] openClosedAssignee = evaluator.totalNumberOfClosedAndOpenForAssignee(assigneeTest);
		System.out.println("Opened tasks: " + openClosedAssignee[0] + " Closed tasks: " + openClosedAssignee[1] + " for assignee " + assigneeTest);
		

	}

}
