package View;
import java.awt.*;
public class ViewAllContactsFrame extends Frame {
    CentralPanel cp;
    public ViewAllContactsFrame(){
        cp = new CentralPanel();
        add(cp);
        setSize(800,500);
        setBackground(new Color(204,255,255));
    }
    public CentralPanel getCp() {
        return cp;
    }
}
