import java.util.Date;

public class Task{
	
	
	private String instanceName;
	private Date dueDate;
	private String priority;
	private Date closeDate;
	private String instanceStatus;
	private String assigneeType;
	private Date createDate;
	private String name;
	private String url;
	private String assignee;
	private long instanceId;
	private String status;
	private String variables;
	private String processName;
	private String id;
	
	
	public Task(){
		
		
	}


	public Task(String instanceName, Date dueDate, String priority, Date closeDate,
			String instanceStatus, String assigneeType, Date createDate, String name,
			String url, String assignee, long instanceId, String status,
			String variables, String processName, String id) {

		this.setInstanceName(instanceName);
		this.setDueDate(dueDate);
		this.setPriority(priority);
		this.setCloseDate(closeDate);
		this.setInstanceStatus(instanceStatus);
		this.setAssigneeType(assigneeType);
		this.setCreateDate(createDate);
		this.setName(name);
		this.setUrl(url);
		this.setAssignee(assignee);
		this.setInstanceId(instanceId);
		this.setStatus(status);
		this.setVariables(variables);
		this.setProcessName(processName);
		this.setId(id);
		
	}
	


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getAssignee() {
		return assignee;
	}


	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}


	public long getInstanceId() {
		return instanceId;
	}


	public void setInstanceId(long instanceId) {
		this.instanceId = instanceId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAssigneeType() {
		return assigneeType;
	}


	public void setAssigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
	}


	public String getInstanceName() {
		return instanceName;
	}


	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public String getPriority() {
		return priority;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public Date getCloseDate() {
		return closeDate;
	}


	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}


	public String getInstanceStatus() {
		return instanceStatus;
	}


	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}


	public String getVariables() {
		return variables;
	}


	public void setVariables(String variables) {
		this.variables = variables;
	}


	public String getProcessName() {
		return processName;
	}


	public void setProcessName(String processName) {
		this.processName = processName;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
	
}