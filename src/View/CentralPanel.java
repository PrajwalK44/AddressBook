package View;

import java.awt.*;
import java.util.ArrayList;
public class CentralPanel extends Panel {
    ArrayList<Label> labels = new ArrayList<>();
    public void createLabels(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            Label j = new Label("",Label.CENTER);
            labels.add(j);
            this.add(j);
            validate();
            repaint();
        }
    }
    public ArrayList<Label> getLabels() {
        return labels;
    }
}
