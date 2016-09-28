import javax.swing.JOptionPane;

public class ToDoReminder {
	
	
	
	public static void main (String[] args){
		String[] toDoList = new String[100];
		String[] reminder = new String[100];
		String choice;
		char fxn = 't';
		choice = JOptionPane.showInputDialog("A task or reminder?");
		if(choice.equals("task") || choice.equals("Task")){
			//JOptionPane.showMessageDialog(null, "Task");
			fxn = 't';
			//JOptionPane.showMessageDialog(null, fxn);
		}else if(choice.equals("reminder") || choice.equals("Reminder")){
			//JOptionPane.showMessageDialog(null, "Reminder");
			fxn = 'r';
			//JOptionPane.showMessageDialog(null, fxn);
		}else{
			JOptionPane.showMessageDialog(null, "The options are task or reminder");
		}
		
		JOptionPane.showMessageDialog(null, fxn);
		
		int i = 0;
		while(fxn =='t'){
			
			toDoList[i] = JOptionPane.showInputDialog("What task do you need to work on?");
			
		}
		while(fxn =='r'){
			
			reminder[i] = JOptionPane.showInputDialog("What is it do you need to be reminded about?");
			
		}
		
		JOptionPane.showMessageDialog(null, "These are the tasks for today: " );
		for(int z = 0; z < i ; z ++){
			JOptionPane.showMessageDialog(null, toDoList[z] );
		}
		
		JOptionPane.showMessageDialog(null, "These are the reminders for today: " );
		for(int z = 0; z < i ; z ++){
			JOptionPane.showMessageDialog(null, toDoList[z] );
			
		}
		
		
	
	}
}
