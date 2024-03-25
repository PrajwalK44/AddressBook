package View;
import java.awt.*;
public class AddContactFrame extends Frame {
    Panel add;
    Label head;
    Panel details;
    TextField name;
    TextField phoneNumber;
    TextField emailId;
    TextField address;
    Button addDetails;
    public AddContactFrame(){
        super("NEW CONTACT");
        setLayout(new FlowLayout());
        add= new Panel();
        head =new Label("Add your details");
        head.setFont(new Font("Add your details", Font.BOLD, 20));
        add.add(head);
        add(add);
        details = new Panel();
        name = new TextField("Name");
        phoneNumber = new TextField("PhoneNumber");
        emailId = new TextField("Email_Id");
        address = new TextField("Address");
        addDetails = new Button("Add the Contact");
        details.add(name);
        details.add(phoneNumber);
        details.add(emailId);
        details.add(address);
        details.add(addDetails);
        add(details);
        setSize(500,300);
        setBackground(new Color(102,102,255));
        setLayout(new GridLayout(5,1));
    }
    public TextField getname() {
        return name;
    }
    public Button getAddDetails() {
        return addDetails;
    }
    public TextField getAddress() {
        return address;
    }
    public TextField getEmailId() {
        return emailId;
    }
    public TextField getPhoneNumber() {
        return phoneNumber;
    }
}
