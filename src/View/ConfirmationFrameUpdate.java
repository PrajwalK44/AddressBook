package View;

import javax.swing.*;
import java.awt.*;

public class ConfirmationFrameUpdate extends Frame {
    public ConfirmationFrameUpdate(){
        setTitle("Contact Updated Successfully");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        Label label = new Label("Contact updated successfully!");
        add(label);
        setVisible(true); // Make the frame visible
    }
}
