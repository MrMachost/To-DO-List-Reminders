import javax.swing.JOptionPane;

public class ToDoReminder {
	
public static void main(String[] args) {
		String[] toDoList = new String[100];
		String[] reminder = new String[100];
		String choice;
		String answer;
		char fxn = 't';
		choice = JOptionPane.showInputDialog("A task or reminder?");
		if (choice.equals("task") || choice.equals("Task")) {
			// JOptionPane.showMessageDialog(null, "Task");
			fxn = 't';
			// JOptionPane.showMessageDialog(null, fxn);
		} else if (choice.equals("reminder") || choice.equals("Reminder")) {
			// JOptionPane.showMessageDialog(null, "Reminder");
			fxn = 'r';
			// JOptionPane.showMessageDialog(null, fxn);
		} else {
			JOptionPane.showMessageDialog(null, "The options are task or reminder");
		}

		// JOptionPane.showMessageDialog(null, fxn);

		int i = 0;
		int j = 0;
		while (fxn == 't') {

			toDoList[i] = JOptionPane.showInputDialog("What task do you need to work on?");
			answer = JOptionPane.showInputDialog("Are there more tasks? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				i++;
				toDoList[i] = JOptionPane.showInputDialog("What task do you need to work on?");
				answer = JOptionPane.showInputDialog("Are ther more tasks? Yes or No");
				i++;
				if (answer.equals("No") || answer.equals("no")) {
					break;
				}
			} else
				break;

		}
		while (fxn == 'r') {

			reminder[j] = JOptionPane.showInputDialog("What do you need to be reminded of?");
			answer = JOptionPane.showInputDialog("Are there anything else to be reminded of? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				j++;
				toDoList[j] = JOptionPane.showInputDialog("What do you need to be reminded of?");
				answer = JOptionPane.showInputDialog("Are there anything else to be reminded of? Yes or No");
				j++;
				if (answer.equals("No") || answer.equals("no")) {
					break;
				}
			} else
				break;
		}

		if (choice.equals("task") || choice.equals("Task")) {
			answer = JOptionPane.showInputDialog("Are there any reminders that you need to be reminded of? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				fxn = 'r';
			} else {
				JOptionPane.showMessageDialog(null, "These are the tasks for today: ");
				for (int z = 0; z <= i; z++) {
					JOptionPane.showMessageDialog(null, toDoList[z]);
				}
			}
		} else if (choice.equals("reminder") || choice.equals("Reminder")) {
			answer = JOptionPane.showInputDialog("Are there any tesks that you need to be doing? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				fxn = 't';

			} else {
				JOptionPane.showMessageDialog(null, "These are the reminders for today: ");
				for (int z = 0; z <= j; z++) {
					JOptionPane.showMessageDialog(null, reminder[z]);

				}
			}
		}

		while (fxn == 't') {

			toDoList[i] = JOptionPane.showInputDialog("What task do you need to work on?");
			answer = JOptionPane.showInputDialog("Are there more tasks? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				i++;
				toDoList[i] = JOptionPane.showInputDialog("What task do you need to work on?");
				answer = JOptionPane.showInputDialog("Are ther more tasks? Yes or No");
				i++;
				if (answer.equals("No") || answer.equals("no")) {
					break;
				}
			} else
				break;

		}
		while (fxn == 'r') {

			reminder[j] = JOptionPane.showInputDialog("What do you need to be reminded of?");
			answer = JOptionPane.showInputDialog("Are there anything else to be reminded of? Yes or No");
			if (answer.equals("Yes") || answer.equals("yes")) {
				j++;
				toDoList[j] = JOptionPane.showInputDialog("What do you need to be reminded of?");
				answer = JOptionPane.showInputDialog("Are there anything else to be reminded of? Yes or No");
				j++;
				if (answer.equals("No") || answer.equals("no")) {
					break;
				}
			} else
				break;
		}

		JOptionPane.showMessageDialog(null, "These are the tasks for today: ");
		for (int z = 0; z <= i; z++) {
			JOptionPane.showMessageDialog(null, toDoList[z]);
		}

		JOptionPane.showMessageDialog(null, "These are the reminders for today: ");
		for (int z = 0; z <= j; z++) {
			JOptionPane.showMessageDialog(null, reminder[z]);

		}

	}
}
