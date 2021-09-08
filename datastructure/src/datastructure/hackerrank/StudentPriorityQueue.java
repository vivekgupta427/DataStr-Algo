package datastructure.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*Input: 
	12
	ENTER John 3.75 50
	ENTER Mark 3.8 24
	ENTER Shafaet 3.7 35
	SERVED
	SERVED
	ENTER Samiha 3.85 36
	SERVED
	ENTER Ashley 3.9 42
	ENTER Maria 3.6 46
	ENTER Anik 3.95 49
	ENTER Dan 3.95 50
	SERVED*/

public class StudentPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();
		
		

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}
		List<Student1> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}

class Priorities {

	List<Student1> getStudents(List<String> events) {
		List<Student1> studentList = new ArrayList<>();
		for (String event : events) {
			String[] split = event.split(" ");
			String operation = split[0];
			if (operation.equalsIgnoreCase("ENTER")) {
				String studName = split[1];
				double studCGPA = Double.parseDouble(split[2]);
				int studId = Integer.parseInt(split[3]);
				Student1 s = new Student1(studId,studName,studCGPA);
				studentList.add(s);
			} else {
				Collections.sort(studentList, new Student1Comparator());
				if(!studentList.isEmpty())
					studentList.remove(0);
			}
		}

		return studentList;
	}

}

class Student1Comparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		if (s1.getCgpa() == s2.getCgpa()) {
			if (s1.getName().equals(s2.getName())) {
				return new Student1IdComparator().compare(s1.getId(), s2.getId());
			} else {
				return new Student1NameComparator().compare(s1, s2);
			}
		} else if (s1.getCgpa() < s2.getCgpa()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Student1NameComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

class Student1IdComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1 == i2) {
			return 0;
		} else if (i1 < i2) {
			return -1;
		} else {
			return 1;
		}
	}
}

class Student1 {
	private int id;
	private String name;
	private double cgpa;

	public Student1(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}
