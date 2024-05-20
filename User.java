class User

{


    private String username;

    private String password;

    private String email;

    private String name;

    private String photo;

    private int total_balance;

    private int reserved_balance;

    public Customer (String u, String p, String e, String n, String ph, int t, int r)


    {
        username = u;

        password = p;

        email = e;

        name = n;

        photo = ph;

        total_balance = t;

        reserved_balance = r;

    }
    void set_username(String username){
        this.username=username;
    }
    String get_username(){
        return this.username;
    }
    void set_password(String password){
        this.password=password;
    }
    String get_password(){
        return this.password;
    }
    void set_email(String email){
        this.email=email;
    }
    String get_email(){
        return email;
    }
    void set_name(String name){
        this.name=name;
    }
    String get_name(){
        return name;

    }

    void set_surname(String surname){
        this.surname=surname;
    }
    String get_surname(){
        return surname;

    }


    void set_phone(String phone){
        this.phone=phone;
    }
    String get_phone(){
        return phone;

    }


}