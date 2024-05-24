public class Pet {
	int petId;
	String petName;
	int petAge;
	String petBreed;
	String petHealthStatus;
	
	public int getPetId() {
		return petId;
	}
	
	public void setPetId(int petId) {
		this.petId = petId;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public String getPetBreed() {
		return petBreed;
	}
	
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	
	public String getPetHealthStatus() {
		return petHealthStatus;
	}
	
	public void setPetHealthStatus(String petHealthStatus) {
		this.petHealthStatus = petHealthStatus;
	}
	
	public void getPetDetails() {
		System.out.println("Pet ID : " + petId);
		System.out.println("Pet Name : " + petName);
		System.out.println("Pet Age : " + petAge);
		System.out.println("Pet Breed : " + petBreed);
		System.out.println("Pet Health Status : " + petHealthStatus);
	}
}
