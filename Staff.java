public class Staff {
   private String staffId;
   private String name;
   private String phone;
   
   public Staff(){
      staffId = "";
      name = "";
      phone = "";
     
     }
     public Staff(String id, String nm, String ph){
      staffId = id;
      name = nm;
      phone = ph;
      }
      
     public Staff(Staff st){
      staffId = st.staffId;
      name = st.name;
      phone = st.phone;
      }
      
     public void setStaffId(String id){ 
      staffId = id;
      }
     public void setName(String nm){ 
      name = nm;
      }
     public void setPhone(String ph){ 
      phone = ph;
      }
      
     public  String getStaffId(){
      return staffId;
      }
     public  String getName(){
      return name;
      }
     public  String getPhone(){
      return phone;
      }
      
     }
         