class Registration_Request{

    private int id;
    private Arraylist<String>RequestDetails()=new Arraylist();
    private String status;
	
	private String path;
	
	
    public Registration_Request(int id, ArrayList<String> requestDetails, String status) {
        this.id = id;
        this.requestDetails = requestDetails;
        this.status = status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setRequestDetails(ArrayList<String> requestDetails) {
        this.requestDetails = requestDetails;
    }
    public ArrayList<String> getRequestDetails() {
        return requestDetails;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
	
	public String get_path()
	
	{
		
		return path;
		
	}
}