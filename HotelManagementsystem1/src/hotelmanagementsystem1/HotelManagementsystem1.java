
package hotelmanagementsystem1;


public class HotelManagementsystem1 {

  
    public static void main(String[] args) {


        Customer s = new Customer(33,"444","eee");
        Role r = new Role(44,"$4","rr");
                System.out.println();
                s.addRole();
                System.out.println();
                r.addRole();}}
    


 class Role {
    int roleid;
    String roleTitle;
    String roleDescrption;
    public Role(int roleid,String roleTitle , String roleDescrption){
        System.out.println();
        this.roleid=roleid;
        this.roleTitle=roleTitle;
        this.roleDescrption=roleDescrption;
        
    }
    public void addRole(){
        System.out.println();
    }
    public String editRole(){
        return roleid+" "+ roleTitle+" "+roleDescrption;
    }
    public int getroleid(){
        return roleid;
    }
     public String getroleTitle(){
        return roleTitle;
    }
     public String getroleDescrption(){
       return  roleDescrption;
     }
     public void setroleid(int newroleid){
          roleid=newroleid;
     } }
 class Customer extends Role{
    private int customer_id;
    private String name;
    private String address;
    private String phone_no;
    private String type;

    public Customer(int roleid, String roleTitle, String roleDescrption) {
        super(roleid, roleTitle, roleDescrption);
    }

   
    
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    }
    

