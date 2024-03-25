package View;
import java.awt.*;
public class SearchContFrame extends Frame {
    TextField txt_con_name;
    Button searchBtn;
    TextField txt_name;
    TextField txt_phone;
    TextField txt_email;
    TextField txt_addr;
    Panel label;
    Label l;
    Panel top;
    public SearchContFrame(){
        setSize(900, 400);
        label = new Panel();
        l = new Label("Search in the Contacts");
        l.setFont(new Font("Search in the Contacts", Font.BOLD, 20));
        setLayout(new GridLayout(4, 0, 20,20));
        label.add(l);
        add(label);
        Panel getDetails = new Panel();
        txt_con_name = new TextField("Enter the name of the person");
        searchBtn = new Button("Search");
        getDetails.add(txt_con_name);
        getDetails.add(searchBtn);
        add(getDetails);
        top = new Panel();
        txt_name = new TextField("txt_name",10);
        txt_phone = new TextField("txt_phone",10);
        txt_email = new TextField("txt_email",10);
        txt_addr = new TextField("txt_addr",10);
        top.add(txt_name);
        top.add(txt_phone);
        top.add(txt_email);
        top.add(txt_addr);
        add(top);
        setBackground(new Color(102,102,255));
    }
    public TextField getTxt_name() {
        return txt_name;
    }
    public Panel getTop() {
        return top;
    }
    public Button getSearchBtn() {
        return searchBtn;
    }
    public TextField getTxt_addr() {
        return txt_addr;
    }
    public TextField getTxt_con_name() {
        return txt_con_name;
    }
    public TextField getTxt_email() {
        return txt_email;
    }
    public TextField getTxt_phone() {
        return txt_phone;
    }
}
