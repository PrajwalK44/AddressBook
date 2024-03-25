package View;
import java.awt.*;
public class ConfirmationFrameAdd extends Frame {

    public ConfirmationFrameAdd() {
        setTitle("Contact Added Successfully");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        Label label = new Label("Contact added successfully!");
        add(label);
        setVisible(true); // Make the frame visible
    }


}