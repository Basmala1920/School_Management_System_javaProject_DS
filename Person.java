public class Person {
    String name;
    String email;
    String address;
  private String city;

    public Person() {}
    public Person(String name,  String email,  String address, String city) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void viewProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
    }

    public void editProfile(String email, String name, String address, String city) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
    }



}
