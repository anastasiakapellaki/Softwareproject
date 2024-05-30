class Packet{
    private int id;
    private String destination;
    private int duration;
    private date departure_date;
    private date arrival_date;
    private double cost;
    private String description;
    private String program;
    private String username_agent;
	private ArrayList<String> photos;
	
    public Packet(int id, String destination, int duration, java.util.Date departureDate, java.util.Date arrivalDate,
                  double cost, String description, String program, String usernameAgent) {
        this.id = id;
        this.destination = destination;
        this.duration = duration;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.cost = cost;
        this.description = description;
        this.program = program;
        this.usernameAgent = usernameAgent;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDepartureDate(java.util.Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setUsernameAgent(String usernameAgent) {
        this.usernameAgent = usernameAgent;
    }


    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getProgram() {
        return program;
    }

    public String getUsernameAgent() {
        return usernameAgent;
    }
	
	
	public void setPhotos(ArrayList<String> paths)
	
	{
		photos = paths;
		
		
	}
	
	
}