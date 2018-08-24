
public class Medicine {

	private String medicineName;
	private float medicinePrice;
	
	public Medicine()
	{
		medicineName=null;
		medicinePrice=0;
	}
	
	public void display()
	{
		System.out.println(medicineName+", "+medicinePrice);
	}
	
	public Medicine(String medicineName,float medicinePrice)
	{
		this.medicineName=medicineName;
		this.medicinePrice=medicinePrice;
	}
	
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public float getMedicinePrice() {
		return medicinePrice;
	}
	public void setMedicinePrice(float medicinePrice) {
		this.medicinePrice = medicinePrice;
	}
	
	
}
