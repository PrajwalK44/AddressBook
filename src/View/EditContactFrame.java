package View;
import java.awt.*;
public class EditContactFrame extends Frame {
    TextField name;
    TextField phoneNumber;
    TextField emailId;
    TextField address;
    TextField getname;
    Panel upp;
    Panel label;
    Label l;
    Button add1;
    TextField index;
    Button get;
    public EditContactFrame(){
        setSize(900, 400);
        label = new Panel();
        l = new Label("Please edit the details of address book");
        l.setFont(new Font("Please edit the details of address book", Font.BOLD, 20));
        setLayout(new GridLayout(4, 0, 20,20));
        label.add(l);
        add(label);
        Panel getDetails = new Panel();
        getname = new TextField("Enter the name of the person");
        get = new Button("Get the person");
        getDetails.add(getname);
        getDetails.add(get);
        add(getDetails);
        upp = new Panel();
        name = new TextField("",10);
        phoneNumber = new TextField("",10);
        emailId = new TextField("",10);
        address = new TextField("",10);
        add1 = new Button("Edit");
        upp.add(name);
        upp.add(phoneNumber);
        upp.add(emailId);
        upp.add(address);
        upp.add(add1);
        upp.setVisible(false);
        add(upp);
        setBackground(new Color(102,102,255));
    }
    public TextField getGetname() {
        return getname;
    }
    public TextField getEmailId() {
        return emailId;
    }
    public TextField getAddress() {
        return address;
    }
    public TextField getPhoneNumber() {
        return phoneNumber;
    }
    public Panel getUpp() {
        return upp;
    }
    public Button getGet() {
        return get;
    }
    public TextField getname() {
        return name;
    }
    public Button getAdd1() {
        return add1;
    }
}
