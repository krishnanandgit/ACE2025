public class Breed {

    int breedId;
    String description;

    public int getBreedId() {
        return breedId;
    }
    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void displayBreedDetails() {
        System.out.println("Breed ID : " + breedId);
        System.out.println("Description : " + description);
    }

}
