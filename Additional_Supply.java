class Additional_supply{
    private intt reservation_id;
    private String type;
    private int amount;
    Additional_Supply(String type,int amount){
        this.type=type;
        this.amount=amount;
    }
    public void settype(String type){
        this.type=type;
    }
    public void setamount(String amount){
        this.amount=amount;
    }
    public String getamount(){
        return amount;
    }
    public String gettype(){
        return type;
    }
}