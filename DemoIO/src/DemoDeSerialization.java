import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi = new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student s[] = (Student []) oi.readObject();
			
			for(int i=0;i<s.length;i++)
			     System.out.println(s[i]);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
