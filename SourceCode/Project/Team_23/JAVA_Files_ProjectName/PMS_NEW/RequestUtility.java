import java.util.ArrayList;
import java.util.List;

public class RequestUtility {
    private List<Request> requests;

    public RequestUtility() {
        this.requests = new ArrayList<>();
    }

    public void makeRequest(Request request) throws InvalidRequestStatusException {
        if (!request.getRequestStatus().equals("Open") && !request.getRequestStatus().equals("Close")) {
            throw new InvalidRequestStatusException("Invalid status! Must be 'Open' or 'Close'.");
        }
        requests.add(request);
        System.out.println("Request added: " + request.getDescription());
    }

    public void updateRequestStatus(int requestID, String resolution, String status) throws InvalidRequestStatusException, RequestNotFoundException {
        Request request = findRequestByID(requestID);
        if (request == null) {
            throw new RequestNotFoundException("Request not found with ID: " + requestID);
        }
        if (!status.equals("Open") && !status.equals("Close")) {
            throw new InvalidRequestStatusException("Invalid status! Must be 'Open' or 'Close'.");
        }
        request.setResolution(resolution);
        request.setRequestStatus(status);
        System.out.println("Request status updated: " + request.getDescription() + " Status: " + status);
    }

    public List<Request> getOpenRequests() {
        List<Request> openRequests = new ArrayList<>();
        for (Request req : requests) {
            if (req.getRequestStatus().equals("Open")) {
                openRequests.add(req);
            }
        }
        return openRequests;
    }

    private Request findRequestByID(int requestID) {
        for (Request req : requests) {
            if (req.getRequestID() == requestID) {
                return req;
            }
        }
        return null;
    }
}
