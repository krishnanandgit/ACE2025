package smartcity;

public class iotdevice {

	public class Iotdevice{
	    private int Id;
	    private String Name;
	    private Text description;

	    public Iotdevice() {}
	    public Iotdevice(int Id,String Name,String description) {
	        this.Id= Id;
	        this.Name = Name;
	        this.description = description;
	    }

	    public int getId(){
	        return Id;
	    }

	    public String getName(){
	        return Name;
	    }

	    public String getdescription(){
	        return description;
	    }

	    public void setId(int Id) {
	        this.Id= Id;
	    }

	    public void setName(String Name) {
	        this.Name= Name;
	    }

	    public void setdescription(String description) {
	        this.description = description;
	    }

	    public void display(){
	        System.out.println("service Details:");
	        System.out.println("ID: " + Id);
	        System.out.println("Name: " + Name);
	        System.out.println("Description: " + description);
	    }
	}
	}