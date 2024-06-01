import java.util.*;


public class Main


{

 public static void main (String[] args)


  {

    public static ArrayList<Additional_supply> supplies = new ArrayList<Additional_supply>();
	
	public static ArrayList<Admin> admins = new ArrayList<Admin>();
	
	public static ArrayList<Certification_Document> cdocs = new ArrayList<Certification_Document>();
	
	public static ArrayList<Message> messages = new ArrayList<Message>();
	
	public static ArrayList<Packet> packets = new ArrayList<Packet>();
	
	public static ArrayList<Payment> payments = new ArrayList<Payment>();
	
	public static ArrayList<Registration_Request> reg_requests = new ArrayList<Registration_Request>();
	
	public static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	public static ArrayList<Review> reviews = new ArrayList<Review>();
	
	public static ArrayList<Travel_Agent> travel_agents = new ArrayList<Travel_Agent>();

	public static ArrayList<Customer> customers = new ArrayList<Customer>();


  }


 public void display_create_packet_step1()

   {
      CreatePackage p1 = new CreatePackage();

      p1.setVisible(true);

   }


public void diplay_create_packet_step2()


  {
      CreatePackagePhotos p1 = new CreatePackagePhotos();

      p1.setVisible(true);

  }

public void display_success_page()

   {
      SuccessfulPackageCreation p1 = new SuccessfulPackageCreation();


      p1.setVisible(true);

    }


public display_wrong_format_page()


     {
        PackageFormatError p1 = new PackageFormatError();


        p1.setVisible(true);

     }


public void display_missing_data_page()

    {

       PackageDataError p1 = new PackageDataError();

       p1.setVisible(true);    

    }

public void display_no_photos_page()


  {

     PackagePhotosError p1 = new PackagePhotosError();

     p1.setVisible(true);

  }

 public void display_list_confirmed_reservartions()

  {
     
    ConfirmedReservations p1 = new ConfirmedReservations()

    
    p1.setVisible(true);

   }

  public void display_manage_reservation()


   {
     ManageReservation p1 = new ManageReservation();


     p1.setVisible(true);
    
    }


  public void display_success_cancellation()

   {
     CancelReservation p1 = new CancelReservation();

     p1.setVisible(true);    

    }

  public void diplay_create_reservation_step1()

    {
       CreateReservation p1 = new CreateReservation();

       p1.setVisible(true);

    }

  public void diplay_create_reservation_step2()

   {
     CreateReservationFiles p1 = new CreateReservationFiles();

    p1.setVisible(true);

   }

   public void diplay_create_reservation_step3()

   {
      CreateReservationPay p1 = new CreateReservationPay();


      p1.setVisible(true);
  
   }

   public void display_sucessfull_complete()

     {
        CreateReservationSuccess p1 = new CreateReservationSuccess();

        p1.setVisible(true);
       
      }

   public void display_error_message()

    {
       CreateReservationError p1 = new CreateReservationError();

      p1.setVisible(true);

     }

   public void display_error_50()

    {
      CreateReservationPayMinError p1 = new CreateReservationPayMinError();

     p1.setVisible(true);

    }

    public void display_balance_error()

   {
     CreateReservationPaymentError p1 = new CreateReservationPaymentError();

     p1.setVisible(true);
   
   }

   public void display_search_packages()

    {
       SearchPackage p1 = new SearchPackage();

       p1.setVisible(true);
    }

    public void display_updated_page()

    {
       SearchPackage p1 = new SearchPackage();

       p1.setVisible(true);
    
    }

    public void display_with_no_filters()

    {
       SearchPackage p1 = new SearchPackage();

       p1.setVisible(true);

    }

   public void display_packet_allready_exists()

     {
       PackageInWishlist p1 = new PackageInWishlist();

       p1.setVisible(true);
     
     }    

  public display_resgistration_requests()

   {
     ResgistrationRequests p1 = new ResgistrationRequests();

     p1.setVisible(true);
    
    }

   public display_filtered_requests ()

    {

        ResgistrationRequests p1 = new ResgistrationRequests();

        p1.setVisible(true);

    }

   public void display_registration_request()

    {
         ReviewRequest p1 = new ReviewRequest();

         p1.setVisible(true);
    }


   public void display_send_message()

    {
       SendMessage p1 = new SendMessage();

       p1.setVisible(true);

    }

   public void display_succes_message_page()

     {
       MessageSendSuccess p1 = new MessageSendSuccess();

       p1.setVisible(true);

     }


    public void display_create_account_step_1()

     {
        CreateManagerAccount p1 = new CreateManagerAccount();

        p1.setVisible(true);

     }

    public void display_create_account_step_2()


      {
         CreateManagerAccountFiles p1 = new CreateManagerAccountFiles();

         p1.setVisible(true);

      }

    public void display_sucess_r_request()


     {
        CreateManagerAccountSuccess p1 = new CreateManagerAccountSuccess();

       p1.setVisible(true);

     }

     public void display_login_page()

      {
        ManagerSignIn p1 = new ManagerSignIn();

        p1.setVisible(true);

      }

    public void display_username_exists()

      {
         ManagerErrorUsername p1 = new ManagerErrorUsername();

         p1.setVisible(true);
      }

     public void display_insert_again()

     {
        ManagerErrorData p1 = new ManagerErrorData();

        p1.setVisible(true);
     }

     public void dispay_error_file_type()

      {
        ManagerErrorFile p1 = new ManagerErrorFile();

        p1.setVisible(true);
      

      }

     public void display_resevations()

      {
         ReservationManagement p1 = new ReservationManagement();

         p1.setVisible(true);
      }

      public void display_payment_page()

       {
          CustomerWallet p1 = new CustomerWallet();

          p1.setVisible(true);
       }

     public void display_additional_supplies()

     {
       BenefitsRequest p1 = new BenefitsRequest();

       p1.setVisible(true);

      
     }

     public void display_success()

     {
        BenefitsRequestValid p1 = new BenefitsRequestValid();

        p1.setVisible(true);
     }
	 
	 
	 public boolean check_packet_step1(ArrayList<String> details)
	 
	 {
		 double flag = true;
		 
		 String decimalPattern = "([0-9]*)\\.([0-9]*)";  

         DateFormat df = new SimpleDateFormat("mm/dd/yyyy");

		 String price = details.get(0);
		 
		 String start_date = details.get(1);
		 
		 String end_date detais.get(2);
		 
		 String hotel_name = details.get(3);
		 
		 String activites = details.get(4);
		 
		 
		 if(price =="" || start_date =="" || end_date=="" || hotel_name=="" || activities=="")
			 
			 {
				 flag = false;
				 
			 }
			 
		if(Pattern.matches(decimalPattern, price) ==false)
			
			{
				
				flag = false;
				
			}
			
			try
			{
				df.parse(start_date);
			}
				catch(Exception e)
			{
               flag = false;
			}
			
			try
			{
				df.parse(end_date);
			}
				catch(Exception e)
			{
               flag = false;
			}
		 
		 return flag;
		 
	 }
	 
	 
	 public void  inserts_details_step1(ArrayList<String> details)
	 
	 {
		 if(check_packet_step1(details)==true)
			 
		 
		 {
			 
			 Packet p1 = new Packet();
			 
			 p1.setDepartureDate(details.get(1));
			 
			 p1.setArrivalDate(details.get(2));
			 
			 p1.setCost(details.get(0));
			 
			 p1.setDestination(details.get(3));
			 
			 p1.setDescription(details.get(4));
			 
			 
			 Main.packets.add(p1);
			 
		 }
		  
		 
	 }
	 
	 
	 
	 public boolean check_packet_step2( ArrayList<String> details)
	 
	 
	 {
		 boolean flag = true;
		 
		 
		 for (String s: details)
			 
			 {
				 
				 File f = new File(s);
				 
				 long size = f.length();
				 
				 int dotIndex = s.lastIndexOf('.'); 
  
				String extension = (dotIndex > 0) ? s.substring(dotIndex + 1) : ""; 
				
				
				if(size > 1024)
					
					{
						
						flag = false;
						
					}
					
					
				if(extention!='jpg')
					
					{
						flag = false;
						
					}
				


				 
			 }
		 
		 return flag;
	 }
	 
	 
	 public void inserts_details_step2(ArrayList<String> details, Packet p)
	 
	 
	 {
		 
		 if(check_packet_step2(details)==true)
			 
			 {
				 
				 p.setPhotos(details);
				 
				 
			 }
		 
		 
		 
	 }
	 
	 
	 public Payment find_pending_payment(Reservation selected)
	
		{
		
		
			Payment result = null;
			
			
			for( Payment p: payments)
				
				{
					if(p.getReservationId() == select.getId() && p.get_status().equals("pending"))
						
						{
							
							result = p;
							
							break;
							
							
						}
					
					
				}
		
		  return result;
		
		}
		
		
	public void update_remaining_amount(Reservation selected)
	
	
	{
		
		Payment result = find_pending_payment(selected);
		
		
		for(Reservation r: Main.reservations)
			
			{
				if(r.getId()==selected.getId())
					
					{
						
						r.set_remain_cost(r.get_remain_cost() - p.getAmount());
						
					}
				
				
			}
		
		
	}

    
	public void update_payment(Payment p)
	
	{
		p.set_status("completed");
		
	}

    public boolean check_remaining_amount(Resevation selected)
	
	{
		boolean flag = false;
		
		
		for(Reservation r: Main.reservations)
			
			{
				if(r.getId() == selected.getId())
					
					{
						if(r.get_remain_amount()==0)
							
							{
								
								flag = true;
								
							}
						
						
						
					}
				
				
			}
		
		return flag;
	}

    public void update_reservation_status(Reservation selected)
	
	{
		
		for (Reservation r: Main.reservations)
			
			{
				
				if(r.getId() == selected.getId())
					
				
				{
					r.setStatus("totally paid");
					
					
					
				}
				
				
				
			}
		
		
		
	}
	
	public Reservation find_reservation (Reservation selected)
		
		
		{
			
			Reservation result = null;
			
			
			for(Reservation r: Main.reservations)
				
				{
					if(r.getId() == selected.getId())
						
						{
							
							
							result = r;
							
							break;
							
						}
					
					
					
				}
			
			return result;
		}
		
		
	public void delete_reservation (Reservation selected)
	
	{
		
		Reservation result = find_reservation(selected);
		
		Main.reservations.remove(result);
		
		
	}
	
	public void update_additional_supplyy(Reservation selected, Additional_supply a)
	
	{
		
		for(Reservation r: Main.reservations)
			
			{
				
				if (r.getId() == selected.get_id())
					
					{
						
						r.add_supply(a);
						
						
					}
				
			}
		
	}

    public void update_remaining_amount(Reservation selected, Additional_supply a)
	
	
	{
		for(Reservation r: Main.reservations)
			
			{
				
				if (r.getId() == selected.get_id())
					
					{
						
						r.set_remain_cost(r.get_remain_cost() + a.get_amount());
						
						
					}
				
			}
		
		
	}
	
	public boolean check_reservation_step1(ArrayList<String> details>)
	
	{
		boolean flag = true;
		
		
		String onomateponimo = details.get(0);
		
		String email = details.get(1);
		
		String phone = details.get(2);
		
		String at = details.get(3);
		
		if(EmailValidator.getInstance().isValid(email)==false)
			
			{
				
				flag = false;
				
				
			}
		if(phone.length()!=10)
			
			{
				
				flag = false;
				
			}
		
		return flag;
		
	}
	
	public void insert_reservation_step1 (ArrayList<String> details)
	
	{
		if(check_reservation_step1(details)==true)
			
			{
				
				Reservation r1 = new Reservation(details);
				
				
				Main.reservations.add(r1);
				
				
				
			}
		
		
		
	}
	
	public boolean check_file_size(String s)
	
	{
		
		boolean flag = true;
		
		
		
		File f = new File(s);
				 
		long size = f.length();
		
		if (size > 1000000)
			
		
		{
			
			flag = false;
			
			
		}
		
		return flag;
		
	}
	
	public void update_reservation_step2 (Reservation r, ArrayList<String> details)
	
	{
		
		
		if (check_file_size(details.get(0)==true))
			
			{
				
				for (Reservation res : Main.reservations)
					
					{
						
						if(r.getId()==res.getId())
							
							{
								
								res.set_path_files(details.get(0);
								
								
							}
						
						
						
					}
				
				
				
				
			}
		
		
		
	}
	
	public int calculate_amount(ArrayList<String> details ,Reservation r)
	
	{
		
		int num_persons = parseInt(details.get(0));
		
		int price_per_person = parseInt(details.get(1));
		
		int total_price = num_persons * price_per_person;
		
		for (Reservation res: Main.reservations)
			
			{
				if(res.getId()==r.getId())
					
					{
						
						res.setTotalCost(total_price);
						
						
					}
				
				
				
			}
		
		
	}
	
	 public boolean check_amount(Reservatiom r, int amount)
	 
	 {
		 
		 if(amount>=50)
			 
			 {
				 
				 return true;
				 
			 }
		 
		 else 
			 
			 {
				 return false;
				 
			 }
		 
	 }
	 
	 
	 public boolean check_if_balance_ok(Customer cust, int amount)
	 
	 {
		 
		 boolean flag;
		 
		 
		 for (Customer c: customers)
			 
			 {
				 if(c.get_username().equals(cust.get_username()))
					 
					 {
						 
						 if(c.get_balance_of_customer() >= amount)
							 
							 {
								 
								 flag = true;
								 
							 }
							 
							
							else
								
								{
									flag = false;
									
								}
						 
						 
					 }
				 
				 
			 }
		 	 
		 return flag;
			 
		 
	 }

     public void update_balance_of_user(Customer cust, int amount)
	 
	 {
		 for (Customer c: customers)
			 
			 {
				 if(c.get_username().equals(cust.get_username()))
					 
					 {
						 
						 if(check_if_balance_ok(c,amount)==true)
							 
							 {
								 
								 c.set_balance(c.get_balance_of_customer()  - amount);
								 
							 }
							 
						 
						 
					 }
				 
				 
			 }
		 
		 
	 }
	 
	 public void create_new_payment(Reservation r, int amount)
	 
	 {
		 Payment p = new Payment();
		 
		 p.set_amount(amount);
		 
		 p.set_reservation_id(r.getId());
		 
		 
		 
	 }
	 
	 public ArrayList<Registration_Request> get_registration_requests()
	 
	 {
		 
		 return Main.reg_requests;
		 
	 }
	 
	public ArrayList<Registration_Request> search_requests (ArrayList<String> filters>)
	
	{
		ArrayList<Registration_Request> result = new ArrayList<Registration_Request>();
		
		for (Registration_Request r: Main.reg_requests)
			
			{
				
				if (r.getId().getRequestDetails() == filters.get(0)  || r.getId().getStatus() == filters.get(1))
					
					{
						result.add(r);
						
						
					}
				
				
			}
		
		return result;
		
	}
	 
    public void update_status(Registration_Request res, String status)
	
	
	{
		for (Registration_Request r: Main.for (Registration_Request r: Main.reg_requests)
			
			{
				
				if (r.getId().getRequestDetails() == filters.get(0)  || r.getId().getStatus() == filters.get(1))
					
					{
						r.setStatus(status);
						
						
					}
				
				
			}
		
		
		
	}
	
	public void check_type_of_user(ArrayList<String> details, String type)
	
	{
		if (type.equals("Customer")
			
			{
				
				create_customer(details);
				
				
			}
			
			
		else
			
			{
				
				create_agent(details);
				
			}
		
		
		
	}
	
	
	public void create_customer(ArraylList<String> details)
	
	{
		
		Customer c1 = new Customer(details);
		
		Main.customers.add(c1);
		
		
	}
	
	public void create_agent(ArrayList<String> details)
	
	{
	   TravelAgent t1 = new TravelAgent(details);
	   
	   Main.travel_agents.add(t1);
		
		
		
	}
	
	public void save_file_of_registration_request(Registrarion_Request r)
	
	
	{
		File f1 = new File(r1.get_path);
		
		f1.write("Last Update");
		
		f1.close();
		
	}
	


}