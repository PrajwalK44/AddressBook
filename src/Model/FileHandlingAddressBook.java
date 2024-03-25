package Model;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileHandlingAddressBook {
    protected abstract ArrayList<addressBook> readJsonFile(String file_path);
    protected abstract void writeJsonFile(String file_path, ArrayList<addressBook> addressBooks) throws IOException;
    public void searchContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address){}
    public void editContact(String namesearch, String name, String phoneNumber, String emailAddress, String Address){}
    public void delContact(String name){}
    public void addNewContact(String name, String phoneNumber, String emailAddress, String Address){}
}
