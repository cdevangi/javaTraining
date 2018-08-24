import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			int roll,marks;
			String name;
			Student [] s = new Student[2];
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int cnt=0;
		    while(cnt!=s.length) {
		    	System.out.println("Enter rollno: ");
				roll = Integer.parseInt(br.readLine());
				System.out.println("Enter marks: ");
				marks = Integer.parseInt(br.readLine());
				System.out.println("Enter name: ");
				name = br.readLine();
				
				s[cnt]  = new Student(roll,marks,name);
				cnt++;
		    	
		    }
			
			
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo = new  ObjectOutputStream(fo);
			oo.writeObject(s);
			
			oo.close();
			fo.close();
			
			System.out.println("operation completed");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
