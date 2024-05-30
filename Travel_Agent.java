class Travel_Agent{
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private String travel_agency;
    private String address;
    private String url;
    private String phone;
    public Travel_Agent(String username, String password, String email, String name, String surname,
                        String travel_agency, String address, String url, String phone) 
						
						{
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.travel_agency = travel_agency;
        this.address = address;
        this.url = url;
        this.phone = phone;
		
						}


        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public String getPassword() {
            return password;
        }


        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return email;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getSurname() {
            return surname;
        }

        public void setTravelAgency(String travel_agency) {
            this.travel_agency = travel_agency;
        }

        public String getTravelAgency() {
            return travel_agency;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public String getAddress() {
            return address;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getPhone() {
            return phone;
        }
		
		
		public ArrayList<Reservation> get_confirmed_reservations()
		
		
		{
			
			ArrayList<Reservation> result = new ArrayList<Reservation>();
			
			
			for(Reservation r: Main.reservations)
				
				{
					if(r.getUsernameSubmitted().equals(this.username) && r.getStatus().equals("confirmed"))
						
						{
							
						   result.add(r);	
							
						}
						
					
				}
			
			
			return result;
			
		}
		
		
		public String get_reservationdetails(Reservation selected)
		
		{
			
			String data = "";
			
			
			ArrayList<Reservation> result = get_confirmed_reservations();
			
			
			for (Reservation r: result)
				
				{
					if (r.getId()== selected.get_id())
						
						{
							data = r.get_info();
							
						}
					
					
				}
			
			
			return data;
			
		}
		
		
		public void accept_pending_payment(Reservation selected)
		
		
		{
			
			Main.find_pending_payment(selected);
			
			
		}
		
		public void cancel_resevation (Resevation selected)
		
		{
			Main.find_reservation(selected);
			
		}
		
		public void accepts_additional_supply(Reservation selected)
		
		
		{
			Main.find_reservation(selected);
			
			
		}
		
		
		
    }
