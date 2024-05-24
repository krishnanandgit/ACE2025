import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        
        Scanner sc = new Scanner(System.in);

        // ------ PET DETAILS ------
        
        System.out.println("Enter Pet ID : ");
        int petId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Pet Name : ");
        String petName = sc.nextLine();
        System.out.println("Enter Pet Age : ");
        int petAge = sc.nextInt();
        System.out.println("Enter Pet Breed : ");
        String petBreed = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Pet Health Status : ");
        String petHealthStatus = sc.nextLine();
        System.out.println();

        Pet p = new Pet();
        p.setPetId(petId);
        p.setPetName(petName);
        p.setPetAge(petAge);
        p.setPetBreed(petBreed);
        p.setPetHealthStatus(petHealthStatus);
        p.getPetDetails();
        System.out.println();

        // ------ PET SHELTER DETAILS ------
        System.out.println("*** PET SHELTER DETAILS *** ");
        System.out.println("Enter Pet Shelter ID : ");
        int shelterId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Shelter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Shelter location : ");
        String location = sc.nextLine();
        System.out.println("Enter Contact Information : ");
        String contactInfo = sc.nextLine();
        System.out.println();
        System.out.println();
        

        Shelter shl = new Shelter();
        shl.setShelterId(shelterId);
        shl.setName(name);
        shl.setLocation(location);
        shl.setContactInfo(contactInfo);
        shl.displayShelterDetails();
        System.out.println();

        // ------ ADOPTER DETAILS ------
        System.out.println(" *** ADOPTER DETAILS *** ");
        System.out.println("Enter Adopter ID :");
        int adopterId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Adopter Name : ");
        String adopterName = sc.nextLine();
        
        System.out.println("Enter Adopter Address : ");
        String address = sc.nextLine();
        
        System.out.println("Enter Contact Details : ");
        String contactDetails = sc.nextLine();
        System.out.println();

        Adopter adp = new Adopter();
        adp.setAdopterId(adopterId);
        adp.setName(adopterName);
        adp.setAddress(address);
        adp.setContactInfo(contactDetails);
        adp.displayAdopterDetails();
        
        

        // ------ APPLICATION DETAILS ------
        System.out.println("*** APPLICATION DETAILS **** ");
        System.out.println("Enter Application ID : ");
        int applicationId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Adoption Date : ");
        String adaptionDate = sc.nextLine();
        System.out.println("Enter Status : ");
        String status = sc.nextLine();
        System.out.println();

        Application app = new Application();
        app.setApplicationId(applicationId);
        app.setAdoptionDate(adaptionDate);
        app.setStatus(status);
        app.displayApplicationDetails();
        System.out.println();
       
        // ------ DONATION DETAILS ------
        System.out.println("*** DONATION DETAILS *** ");
        System.out.println("Enter Donation ID : ");
        int donationId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Amount : ");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Date of Donation : ");
        String date = sc.nextLine();
        System.out.println();

        Donation dt = new Donation();
        dt.setDonationId(donationId);
        dt.setAmount(amount);
        dt.setDate(date);
        dt.displayDonationDetails();
        System.out.println();

        // VOLUNTEER DETAILS
        System.out.println("*** VOLUNTEER DETAILS *** ");
        System.out.println("Enter Volunteer ID : ");
        int volunteerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Volunteer Name : ");
        String volunteerName = sc.nextLine();
        System.out.println("Enter Volunteer Availability : ");
        String availability = sc.nextLine();
        System.out.println();

        Volunteer vol = new Volunteer();
        vol.setVolunteerId(volunteerId);
        vol.setName(volunteerName);
        vol.setAvailability(availability);
        vol.displayVolunteerDetails();
        System.out.println();

        // ------ BREED DETAILS ------
        System.out.println("*** BREED DETAILS  *** ");
        System.out.println("Enter Breed ID : ");
        int breedId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Description : ");
        String description = sc.nextLine();
        System.out.println();
        Breed bd = new Breed();
        bd.setBreedId(breedId);
        bd.setDescription(description);
        bd.displayBreedDetails();
        System.out.println();

        // ------ MEDICAL RECORDS ------
        System.out.println("*** MEDICAL RECORDS *** ");
        System.out.println("Enter Record ID : ");
        int recordId = sc.nextInt();
        sc.nextLine();
        System.out.println("Is it Vaccinated : ");
        Boolean vaccination = sc.nextBoolean();
        sc.nextLine();
        System.out.println("What is the Medical Condition : ");
        String medicalCondition = sc.nextLine();
        System.out.println();
        MedicalRecord mr = new MedicalRecord();
        mr.setRecordId(recordId);
        mr.setVaccination(vaccination);
        mr.setMedicalConditions(medicalCondition);
        mr.displayMedicalRecord();
        System.out.println();

        // ------ EVENT DETAILS ------
        System.out.println("*** EVENT DETAILS *** ");
        System.out.println("Enter the Event ID : ");
        int eventId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Event Date : ");
        String eventDate = sc.nextLine();
        System.out.println("Enter the Event Location ");
        String eventLocation = sc.nextLine();
        System.out.println("Enter Event Description : ");
        String eventDescription = sc.nextLine();
        System.out.println();
        Event ev = new Event();
        ev.setEventId(eventId);
        ev.setDate(eventDate);
        ev.setLocation(eventLocation);
        ev.setDescription(eventDescription);
        ev.displayEventDetails();
        System.out.println();

        // ------ REVIEW ------
        System.out.println(" *** REVIEW *** ");
        System.out.println("Enter Review ID : ");
        int reviewId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Rating : ");
        int rating = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Comments : ");
        String comments = sc.nextLine();
        System.out.println();
        Review rvw = new Review();
        rvw.setReviewId(reviewId);
        rvw.setRating(rating);
        rvw.setComments(comments);
        rvw.displayReviewDetails();
        System.out.println();

        sc.close();
        
        
        





    }


    
}
