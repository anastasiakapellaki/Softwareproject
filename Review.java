class Review{

    String username_submitted;
    private int value;
    private String comment;
    private int packet_id;
    private Date date;
    private Time time;

    public Review(String username_submitted,int value,String comment,int packet_id,Date date,Time time){
        this.username_submitted=username_submitted;
        this.value=value;
        this.comment=comment;
        this.packet_id=packet_id;
        this.date=date;
        this.time=time;
    }
    public void set_username_submitted(String username_submitted){
        this.username_submitted=username_submitted;
    }
    public String get_username_submitted(){

        return username_submitted;
    }
    public void set_comment(String comment){
        this.comment=comment;
    }
    public String get_comment()
    {
        return this.comment;
    }
    public void set_packet_id(){
        this.packet_id=packet_id;}
    public int get_packet_id(){
        return this.packet_id;
    }

    public void set_date(Date date){
        this.date=date;
    }
    public Date get_date(){
        return this.date;
    }

    public void set_time(Time time){
        this.time=time;
    }
    public Time get_time(){
        return this.time;
    }

}