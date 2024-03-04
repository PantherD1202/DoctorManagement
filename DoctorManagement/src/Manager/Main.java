package Manager;

import java.util.ArrayList;

import Entity.Doctor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Doctor> ld = new ArrayList<>();
		// loop until user want to exit
		while (true) {
			int choice = Manager.menu();
			switch (choice) {
			case 1:
				Manager.addDoctor(ld);
				break;
			case 2:
				Manager.updateDoctor(ld);
				break;
			case 3:
				Manager.deleteDoctor(ld);
				break;
			case 4:
				Manager.searchDoctor(ld);
				break;
			case 5:
				return;
			}

		}

	}

}
