package interfaces;
import java.lang.*;
import classes.Student;

public interface StudentOperations
{
	boolean insertStudent(Student s);
	void showAllStudents();
}