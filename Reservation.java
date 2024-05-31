class Reservation{

    private int id;
	
    private int packet_id;
	
    private int total_cost;
	
    private int remain_cost;
	
    private Arraylist<Customer>customers=new Arraylist();
	
    private Date date;
	
    private Time time;
	
    private String username_submitted;
	
	private String status;
	
	private ArrayList<Additional_supply> supplies;
	
    public Reservation(int id, int packetId, int totalCost, int remain_cost, ArrayList<Customer> customers,
                       java.util.Date date, java.util.Time time, String usernameSubmitted) {
        this.id = id;
        this.packetId = packetId;
        this.totalCost = totalCost;
        this.remain_cost = remain_cost;
        this.customers = customers;
        this.date = date;
        this.time = time;
        this.usernameSubmitted = usernameSubmitted;
    }


    public String get_info()
	
	{
		
		return id + " " + packetId + " " + totalCost + " " + customers + " " + date + " " time + " " + usernameSubmitted;
		
	}


    public void setId(int id) {
        this.id = id;
    }

    public void setPacketId(int packetId) {
        this.packetId = packetId;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public void set_remain_cost(int remain_cost) {
        this.remain_cost = remain_cost;
    }

    public void setCustomers(ArrayList<Customer> customers) {

        this.customers = customers;
    }

    public void setDate( date) {
        this.date = date;
    }

    public void setTime( time) {
        this.time = time;
    }

    public void setUsernameSubmitted(String usernameSubmitted) {
        this.usernameSubmitted = usernameSubmitted;
    }


    public int getId() {
        return id;
    }

    public int getPacketId() {
        return packetId;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public int get_remain_cost(() {
        return remain_cost;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public java.util.Date getDate() {
        return date;
    }

    public java.util.Time getTime() {
        return time;
    }

    public String getUsernameSubmitted() {
        return usernameSubmitted;
    }
	
	public String getStatus()
	
	{
		
		return status;
		
	}
	
	public void setStatus(String status)
	
	{
		
		this.status = status;
		
		
	}
	
	public void add_supply(Additional_supply a)
	
	{
		supplies.add(a);
		
	}
	


}