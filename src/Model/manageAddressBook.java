package Model;
import View.ConfirmationFrameAdd;
import View.ConfirmationFrameDelete;
import View.ConfirmationFrameUpdate;
import View.View;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
public class manageAddressBook extends FileHandlingAddressBook implements Displayable{


    ArrayList<addressBook> address_data = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    final private String filePath = "D://Java_Assignment_Address_Book//Java_Assignment_Address_Book//src//Model//Contacts.json";
    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    public manageAddressBook(){
        readJsonFile(filePath);
    }
    @Override
    public ArrayList<addressBook> readJsonFile(String filePath){
        address_data.removeAll(address_data);
        try{
            JsonNode node = objectMapper.readTree(new File(filePath));

            if(node.isArray()){
                for (JsonNode node1 : node){
                    String name = node1.get("name").asText();
                    String phoneNumber = node1.get("phoneNumber").asText();
                    String emailAddress = node1.get("emailAddress").asText();
                    String Address = node1.get("address").asText();

                    addressBook address_data_temp = new addressBook(name,phoneNumber,emailAddress,Address);
                    address_data.add(address_data_temp);
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return address_data;
    }
    public void writeJsonFile(String filePath, ArrayList<addressBook> address_data) throws IOException {
        objectMapper.writeValue(Paths.get(filePath).toFile(), address_data);
    }
    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Name");
        headers.add("Phone Number");
        headers.add("Email ID");
        headers.add("Address");

        return headers;
    }
    public ArrayList<String> getLine(int line) {
        ArrayList<String> AddressBookDetails = new ArrayList<String>();

        AddressBookDetails.add(address_data.get(line).getName());
        AddressBookDetails.add(String.valueOf(address_data.get(line).getPhoneNumber()));
        AddressBookDetails.add(address_data.get(line).getEmailAddress());
        AddressBookDetails.add(address_data.get(line).getAddress());

        return AddressBookDetails;
    }
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> AddressBook_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            AddressBook_subset.add(getLine(i));
        }
        return AddressBook_subset;
    }
    @Override
    public int getFirstLineToDisplay() {
        return this.firstLineIndex;
    }
    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(this.firstLineIndex + this.linesBeingDisplayed - 1);
        return this.lastLineIndex;
    }
    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }
    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }
    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<addressBook> getTable(){
        readJsonFile(filePath);
        return address_data;
    }
    public void addNewContact(String name, String phoneNumber, String emailAddress, String Address){
        readJsonFile(filePath);
        address_data.add(new addressBook(name, phoneNumber, emailAddress,Address));
        try{
            writeJsonFile(filePath, address_data);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ConfirmationFrameAdd confirmationFrame = new ConfirmationFrameAdd();

    }
    public void delContact(String name){
        readJsonFile(filePath);
        for (int i = 0; i < address_data.size(); i++) {
            if (name.equals( address_data.get(i).getName())){
                address_data.remove(i);
            }
        }
        try {
            writeJsonFile(filePath, address_data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ConfirmationFrameDelete del=new ConfirmationFrameDelete();
    }
    public void searchContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address)
    {
        readJsonFile(filePath);
        for (int i=0; i<address_data.size(); i++){
            if(namesearch.equals(address_data.get(i).getName())){
                address_data.get(i).setName(name);
                address_data.get(i).setPhoneNumber(phoneNumber);
                address_data.get(i).setEmailAddress(emailAddress);
                address_data.get(i).setAddress(Address);
                break;
            }
        }
    }
    public void editContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address){
        readJsonFile(filePath);
        for (int i = 0; i < address_data.size(); i++) {
            if (namesearch.equals( address_data.get(i).getName())){
                address_data.get(i).setName(name);
                address_data.get(i).setPhoneNumber(phoneNumber);
                address_data.get(i).setEmailAddress(emailAddress);
                address_data.get(i).setAddress(Address);
                break;
            }
        }
        try {
            writeJsonFile(filePath, address_data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ConfirmationFrameUpdate cf=new ConfirmationFrameUpdate();
    }
}
