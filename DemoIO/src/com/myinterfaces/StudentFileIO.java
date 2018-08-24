package com.myinterfaces;

import com.pojo.Student;

public interface StudentFileIO {
	
	Student [] readStudents();
	int writeStudents(Student [] student);

}
