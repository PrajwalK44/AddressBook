package View;
import java.awt.*;

public class ConfirmationFrameDelete extends Frame {
    public ConfirmationFrameDelete(){
        setTitle("Contact Deleted Successfully");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen

        Label label = new Label("Contact Deleted successfully!");
        add(label);
        setVisible(true); // Make the frame visible
    }
}
