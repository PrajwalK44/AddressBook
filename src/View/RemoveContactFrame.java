package View;
import java.awt.*;
public class RemoveContactFrame extends Frame {
    TextField delname;
    Button del;
    Panel add;
    Label head;
    Panel details;
    public RemoveContactFrame(){
        super("Delete Contact");
        setLayout(new FlowLayout());
        add= new Panel();
        head =new Label("Enter the name to delete");
        head.setFont(new Font("Enter the name to delete", Font.BOLD, 20));
        add.add(head);
        add(add);
        details = new Panel();
        delname = new TextField("Name");
        del = new Button("Delete Details");
        details.add(delname);
        details.add(del);
        setSize(400,300);
        add(details);
        setBackground(new Color(102,102,255));
    }
    public Button getDel() {
        return del;
    }
    public TextField getDelname() {
        return delname;
    }
}
