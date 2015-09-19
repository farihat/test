public class Customer {

   private String name;
   private String email;
   private char gender;

    public Customer(){}
    public Customer(String name,String email,char gender){
        this.name= name;
        this.email= email;
        this.gender= gender;
    }
    public Customer(String name){this.name= name;}
    public String getName(){return name;}
    public void setEmail(String email){this.email=email;}
    public String getEmail(){return email;}
    public void setGender(char gender){this.gender= gender;}
    public char getGender(){return gender;}
    public void print(){System.out.println(getName() + " (" + getGender() + ") at " + getEmail() + "\n");}
}
