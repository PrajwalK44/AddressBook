package Model;
public class addressBook {
    private static int count = 0;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String Address;
    public addressBook(){
    }
    public addressBook(String name, String phoneNumber, String emailAddress, String Address){
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setAddress(Address);
        setCount(getCount()+1);
    }
    public static void setCount(int count) {
        addressBook.count = count;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static int getCount() {
        return count;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.Address;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
}
