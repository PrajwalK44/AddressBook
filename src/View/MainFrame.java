package View;
import java.awt.*;
public class MainFrame extends Frame {
    InitialPanel ip;
    public MainFrame(){
        super("Address Book");
        ip  = new InitialPanel();
        add(ip);
        setSize(700,300);
        setVisible(true);
    }
    public InitialPanel getIp() {
        return ip;
    }
}
