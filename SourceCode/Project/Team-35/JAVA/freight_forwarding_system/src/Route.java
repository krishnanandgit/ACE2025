public class Route {
    private int route_ID;
    private String origin;
    private String destination;
    private double distance;
    private String estimated_Duration;
    
    public Route(int route_ID, String origin, String destination, double distance, String estimated_Duration) {
        this.route_ID = route_ID;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.estimated_Duration = estimated_Duration;
    }

    public int getRoute_ID() {
        return route_ID;
    }

    public void setRoute_ID(int route_ID) {
        this.route_ID = route_ID;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getEstimated_Duration() {
        return estimated_Duration;
    }

    public void setEstimated_Duration(String estimated_Duration) {
        this.estimated_Duration = estimated_Duration;
    }

    public void displayRoute() {
        System.out.println("Route details:");
        System.out.println("Route_ID : " + this.getRoute_ID());
        System.out.println("Origin : " + this.getOrigin());
        System.out.println("Destination : " + this.getDestination());
        System.out.println("Distance : " + this.getDistance());
        System.out.println("Estimated_Duration : " + this.getEstimated_Duration());
    }
}
