package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));

		List<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl);
		System.out.println("Asc" + studentsAl);

		//		Collections.sort(studentsAl, new DescendingStudentComparator()); //첫번째 방법
		studentsAl.sort(new DescendingStudentComparator()); // 두번째 방법
		System.out.println("DescendingStudentComparator" + studentsAl);
	}

}
