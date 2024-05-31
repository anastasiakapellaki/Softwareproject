class Payment{

    private int id;
    private int amount;
    private String bank_account;
    private Date date;
    private Time time;
    private String customer_username;
	
	private int reservation_id;
	
    public Payment(int id, int amount, String bank_account, Date date, Time time, String customer_username, int reservation_id) {
        this.id = id;
        this.amount = amount;
        this.bank_account = bank_account;
        this.date = date;
        this.time = time;
        this.customer_username = customer_username;
		
		this.reservation_id = reservation_id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBankAccount(String bank_account) {
        this.bank_account = bank_account;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setCustomerUsername(String customer_username) {
        this.customer_username = customer_username;
    }
    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getBankAccount() {
        return bank_account;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getCustomerUsername() {
        return customer_username;
    }
	
	public int getReservationId()
	
	{
		return reservation_id;
		
	}
	
}