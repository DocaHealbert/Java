public class Homecare{
   private String serviceId;
   private String customerName;
   private String serviceType;
   private double serviceHour;
   private Staff staff;
   
   
   public Homecare(){
      serviceId = "";
      customerName = "";
      serviceType = "";
      serviceHour = 0;
      staff = new Staff();
      }
      
      public Homecare(String sid, String cusname, String stype, double hour, Staff stf){
         serviceId = sid;
         customerName = cusname;
         serviceType = stype;
         serviceHour = hour;
         staff = stf;
         }
         
      public Homecare(Homecare h){
         serviceId = h.serviceId;
         customerName = h.customerName;
         serviceType = h.serviceType;
         serviceHour = h.serviceHour;
         staff = new Staff(h.staff);
         }
      //Setter
      public void setServiceId(String sid){
         serviceId = sid;
         }
      public void setCustomerName(String cusname){
         customerName = cusname;
         }
      public void setServiceType(String stype){
         serviceType = stype;
         }
      public void setServiceHour(double hour){
         serviceHour = hour;
         }
      public void setStaff(Staff stf){
         staff = stf;
         }
      //Getter
      public String getServiceId(){
         return serviceId;
         }
      public String getCustomerName(){
         return customerName;
         }
      public String getServiceType(){
         return serviceType;
         }
      public double getServiceHour(){
         return serviceHour;
         }
      public Staff getStaff(){
         return staff;
         }
         
      public double calcServiceCharge(){
          double rate = 0;
          
      if(serviceType.equalsIgnoreCase("Basic"))
         rate = 60.0;
      else if(serviceType.equalsIgnoreCase("Physiotherapy"))
         rate = 120.0;
      else if(serviceType.equalsIgnoreCase("Baby Care"))
         rate = 80.0;
      
      double total = rate * serviceHour;
      
      if(serviceHour > 5)
         total = total * 0.95;
      
      return total;
      }
      
    }