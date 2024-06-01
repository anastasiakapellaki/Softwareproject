class Admin{

    private String username;
    private String password;
    Admin(String username,String password){
        this.username=this.username;
        this.password=password;
    }
    public void setpassword(String password){
        this.password=password;

    }
    public void setusername(String username){
        this.username=username;
    }
    public String getpassword(){
        return password;
    }
    public String getusername(){
        return username;
    }
	
	public void accept_request(Registration_Request r)
	
	{
		Main.update_status(r);
		
	}

}