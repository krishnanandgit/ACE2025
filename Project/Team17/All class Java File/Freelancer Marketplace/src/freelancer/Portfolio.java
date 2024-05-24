package freelancer;

public class Portfolio {
    private int portfolioid;
    private String portfoliotitle;
    private String description;
    private String portfolioUrl; // Paths to sample files or URLs
    // Constructors, getters, setters
	public int getPortfolioid() {
		return portfolioid;
	}
	public void setPortfolioid(int portfolioid) {
		this.portfolioid = portfolioid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPortfoliotitle() {
		return portfoliotitle;
	}
	public void setPortfoliotitle(String portfoliotitle) {
		this.portfoliotitle = portfoliotitle;
	}
	public String getPortfolioUrl() {
		return portfolioUrl;
	}
	public void setPortfolioUrl(String portfolioUrl) {
		this.portfolioUrl = portfolioUrl;
	}
}

