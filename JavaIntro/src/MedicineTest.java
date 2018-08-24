
public class MedicineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medicine m1,m2;
		m1=new Medicine("Crocin",20);
		m2=new Medicine("Cyclopam",30);
		m1.display();
		m2.display();
		m1.setMedicineName("Azithral");
		m1.setMedicinePrice(35);
		m1.display();
	}

}

