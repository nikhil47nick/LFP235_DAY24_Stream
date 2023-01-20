package Com.BridgeLabz.Stream;


import java.util.function.Predicate;

public class Address {
    private String firstname;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    Address(String firstname,String lastName,String address,String city,String state,String zip,String phoneNumber,String email){
        this.firstname= firstname;
        this.lastName= lastName;
        this.address= address;
        this.city= city;
        this.state= state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email= email;
    }
    Address(){
        firstname= "";
        lastName= "";
        address= "";
        city= "";
        state= "";
        zip="";
        phoneNumber="";
        email= "";
    }

    public void show(){
        System.out.println(" First Name: " +firstname);
        System.out.println(" Last Name: "+lastName);
        System.out.println(" Address: "+address);
        System.out.println(" state: "+state);
        System.out.println(" city: "+city);
        System.out.println(" zip: "+zip);
        System.out.println(" Phone number: "+phoneNumber);
        System.out.println(" email :"+email);
    }

    public String getName(){return firstname;}
    public String getLastName(){return lastName;}
    public String getAddress(){return address;}
    public String getCity(){return city;}
    public String getState(){return state;}
    public String getZip(){return zip;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getEmail(){return email;}

    public void setValue(int n,String data){
        switch (n){
            case 0: this.firstname= data;
                break;
            case 1: this.lastName= data;
                break;
            case 2 : this.address= data;
                break;
            case 3: this.city= data;
                break;
            case 4 : this.state= data;
                break;
            case 5 :this.zip=data;
                break;
            case 6 : this.phoneNumber=data;
                break;
            case 7 : this.email= data;
                break;
            default:break;
        }
    }




}

