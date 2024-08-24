package taskManagementSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
public class TaskManager {
	private ArrayList<Task> taskList = new ArrayList<>();
	private LinkedList<Task> prioritizedTaskList = new LinkedList<>();
	
	public void addTask(Task task) {
		taskList.add(task);
		prioritizedTaskList.add(task);
		sortPrioritizedTask();
		
	}

	private void sortPrioritizedTask() {
	Collections.sort(prioritizedTaskList, Comparator.comparingInt(Task::getPriority));
		
	}
	
   public void removeTask(String title) {
	   taskList.removeIf(task->task.getTitle().equals(title));
	   taskList.removeIf(task->task.getTitle().equals(title));
   }
   
   public void updateTask(String title, String newDescription, Date newdate, int priorty ) {
	  for(Task task :taskList) {
		  if (task.getTitle()==title) {
			  task.setDescription(newDescription);
			  task.setDuedate(newdate);
			  task.setPriority(priorty);
			  sortPrioritizedTask();
			  
	  }
		   
	   }
   }
   
	   public void displayAllTasks() {
	        for (Task task : taskList) {
	            System.out.println(task);
	        }
	    }
	    public void displayPrioritizedTasks() {
	        for (Task task : prioritizedTaskList) {
	            System.out.println(task);
	        }
   }
}

