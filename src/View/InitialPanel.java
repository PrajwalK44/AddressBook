package View;
import java.awt.*;
public class InitialPanel extends Panel {
    CentralPanel cp;
    BookButtons butt;
    public InitialPanel(){
        Panel head = new Panel();
        setLayout(new GridLayout(2,1));
        Label heading = new Label("The AddressBook");
        heading.setFont(new Font("Forte",Font.ITALIC,30));
        heading.setForeground(new Color(00,00,00, 255));
        head.add(heading);
        setBackground(new Color(184, 204, 0));
        butt = new BookButtons();
        add(head);
        add(butt);
    }
    public BookButtons getButt() {
        return butt;
    }
}
