import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	private static Scanner scanner;

	public static void main(String args[]) {

		boolean exit = false;
		int option;
		scanner = new Scanner(System.in);

		LinkedList ls = new LinkedList();
		ls.insert(1, "Joe");
		ls.insert(2, "Mary");
		ls.print();
		

		while (!exit) {
			System.out.println("/---------------------/");
			System.out.println("1. Option 1 Delete First Patient ");
			System.out.println("2. Option 2 Last Patient of the list");
			System.out.println("3. Option 3 index 2");
			System.out.println("4. Option 4 Delete Patient");
			System.out.println("5. Option 5 List Patient ");
			System.out.println("6. Option 6 Cut List ");
			System.out.println("7. Option 7 Add Emergency ");
			System.out.println("8. Option 8 Add Patient ");
			System.out.println("9. Exit ");
			System.out.println("/---------------------/");

			try {

				System.out.println("Select an option ");
				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Delete First Patient ");

					break;
				case 2:
					System.out.println("Last Patient of the list ");

					break;
				case 3:
					System.out.println("Index 2");
					break;
				// Delete patient
				case 4:
					System.out.println("Delete Patient ");
					System.out.println("Insert the PID number of the patient to delete ");

					break;
				case 5:
					System.out.println("List Patient ");
					ls.print();
					break;
				case 6:
					System.out.println("Cut List ");
					System.out.println("Insert the number of patients you want to leave on the list: ");

					break;
				case 7:

					break;
				case 8:
					
					ls.insert(3, "Nuevo");
					ls.print();

					break;
				case 9:
					System.out.println("Bye !");
					exit = true;
					break;
				default:
					System.out.println("Wrong option. Only numbers between 1 and 7");
				}
			} catch (InputMismatchException e) {
				System.out.println("Only numbers");
				scanner.next();
			}

		}

	}
}
