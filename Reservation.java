class Reservation{

    private int id;
    private int packet_id;
    private int total_cost;
    private int paid_cost;
    private Arraylist<Customer>customers=new Arraylist();
    private Date date;
    private Time time;
    private String username_submitted;
    public Reservation(int id, int packetId, int totalCost, int paidCost, ArrayList<Customer> customers,
                       java.util.Date date, java.util.Time time, String usernameSubmitted) {
        this.id = id;
        this.packetId = packetId;
        this.totalCost = totalCost;
        this.paidCost = paidCost;
        this.customers = customers;
        this.date = date;
        this.time = time;
        this.usernameSubmitted = usernameSubmitted;
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

    public void setPaidCost(int paidCost) {
        this.paidCost = paidCost;
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

    public int getPaidCost() {
        return paidCost;
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
	


}