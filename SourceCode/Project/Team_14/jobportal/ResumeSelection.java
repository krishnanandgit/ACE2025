package jobportal;

public class ResumeSelection {
    private int id;
    private String name;
    private String jobTitle;
    private JobCategoryResumeId jobCategoryResumeId;

    
    public ResumeSelection(int id, String name, String jobTitle, JobCategoryResumeId jobCategoryResumeId) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.jobCategoryResumeId = jobCategoryResumeId;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public JobCategoryResumeId getJobCategoryResumeId() {
        return jobCategoryResumeId;
    }

    public void setJobCategoryResumeId(JobCategoryResumeId jobCategoryResumeId) {
        this.jobCategoryResumeId = jobCategoryResumeId;
    }

  
    public static void main(String[] args) {
       
        JobCategoryResumeId jobCategoryResumeId1 = new JobCategoryResumeId(/* initialize fields */);
        JobCategoryResumeId jobCategoryResumeId2 = new JobCategoryResumeId(/* initialize fields */);
        JobCategoryResumeId jobCategoryResumeId3 = new JobCategoryResumeId(/* initialize fields */);
        JobCategoryResumeId jobCategoryResumeId4 = new JobCategoryResumeId(/* initialize fields */);
        JobCategoryResumeId jobCategoryResumeId5 = new JobCategoryResumeId(/* initialize fields */);

        
        ResumeSelection resume1 = new ResumeSelection(801, "adarsh", "Software Engineer", jobCategoryResumeId1);
        ResumeSelection resume2 = new ResumeSelection(802, "anish", "Data Scientist", jobCategoryResumeId2);
        ResumeSelection resume3 = new ResumeSelection(803, "akhila", "Product Manager", jobCategoryResumeId3);
        ResumeSelection resume4 = new ResumeSelection(804, "pavan", "UX Designer", jobCategoryResumeId4);
        ResumeSelection resume5 = new ResumeSelection(805, "shekar", "Software Developer", jobCategoryResumeId5);

       
        System.out.println("Resume ID (resume1): " + resume1.getId());
        System.out.println("Job Title (resume1): " + resume1.getJobTitle());
        System.out.println("Resume ID (resume2): " + resume2.getId());
        System.out.println("Job Title (resume2): " + resume2.getJobTitle());
        System.out.println("Resume ID (resume3): " + resume3.getId());
        System.out.println("Job Title (resume3): " + resume3.getJobTitle());
        System.out.println("Resume ID (resume4): " + resume4.getId());
        System.out.println("Job Title (resume4): " + resume4.getJobTitle());
        System.out.println("Resume ID (resume5): " + resume5.getId());
        System.out.println("Job Title (resume5): " + resume5.getJobTitle());
    }
}


class JobCategoryResumeId {
    
}
