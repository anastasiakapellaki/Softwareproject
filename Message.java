class Message{

    private int id;
    private String username_sender;
    private String username_receiver;
    private String theme;
    private int content;
    private Date date;
    private Time time;
    public Message(int id, String username_sender, String username_receiver, String theme, int content, Date date, Time time) {
        this.id = id;
        this.username_sender = username_sender;
        this.username_receiver = username_receiver;
        this.theme = theme;
        this.content = content;
        this.date = date;
        this.time = time;
    }
    public void setId(int id) {
        this.id = id;
    }
