package jobportal;

public class JobRecord {
    private int job_id;
    private String title;
    private String description;
    private int company_id;

    
    public JobRecord(int job_id, String title, String description, int company_id) {
        this.job_id = job_id;
        this.title = title;
        this.description = description;
        this.company_id = company_id;
    }


    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

   
    public static void main(String[] args) {
        
        JobRecord job1 = new JobRecord(501, "Software Engineer", "Developing web applications", 401);
        JobRecord job2 = new JobRecord(502, "Data Analyst", "Analyzing data trends", 402);
        JobRecord job3 = new JobRecord(503, "Product Manager", "Leading product development", 403);
        JobRecord job4 = new JobRecord(504, "UI/UX Designer", "Creating user-friendly interfaces", 404);
        JobRecord job5 = new JobRecord(505, "DevOps Engineer", "Managing deployment pipelines", 405);

        // Access attributes
        System.out.println("Job 1 ID: " + job1.getJob_id());
        System.out.println("Job 1 Title: " + job1.getTitle());
        System.out.println("Job 1 Description: " + job1.getDescription());
        System.out.println("Job 1 Company ID: " + job1.getCompany_id());
        
        System.out.println("Job 2 ID: " + job2.getJob_id());
        System.out.println("Job 2 Title: " + job2.getTitle());
        System.out.println("Job 2 Description: " + job2.getDescription());
        System.out.println("Job 2 Company ID: " + job2.getCompany_id());
        
        System.out.println("Job 3 ID: " + job3.getJob_id());
        System.out.println("Job 3 Title: " + job3.getTitle());
        System.out.println("Job 3 Description: " + job3.getDescription());
        System.out.println("Job 3 Company ID: " + job3.getCompany_id());
        
        System.out.println("Job 4 ID: " + job4.getJob_id());
        System.out.println("Job 4 Title: " + job4.getTitle());
        System.out.println("Job 4 Description: " + job4.getDescription());
        System.out.println("Job 4 Company ID: " + job4.getCompany_id());
        
        System.out.println("Job 5 ID: " + job5.getJob_id());
        System.out.println("Job 5 Title: " + job5.getTitle());
        System.out.println("Job 5 Description: " + job5.getDescription());
        System.out.println("Job 5 Company ID: " + job5.getCompany_id());
        
    }
}
