package datastructure.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentComparatorSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		in.close();
		Collections.sort(studentList, new StudentComparator());

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}

	}

}

class StudentComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getCgpa() == s2.getCgpa()) {
			if (s1.getFname().compareTo(s2.getFname()) == 0) {
				return new IdComparator().compare(s1.getId(), s2.getId());
			} else {
				return s1.getFname().compareTo(s2.getFname());
			}
		} else if (s1.getCgpa() < s2.getCgpa()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class IdComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		if (a.compareTo(b) > 0)
			return -1;
		else if (a.compareTo(b) < 0)
			return 1;
		else
			return 0;
	}

}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
