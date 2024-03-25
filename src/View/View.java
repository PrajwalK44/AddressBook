package View;

import java.awt.*;
import java.util.ArrayList;

public class View {
    MainFrame mf;
    AddContactFrame ac;
    ViewAllContactsFrame vc;
    RemoveContactFrame dc;
    SearchContFrame sc;
    EditContactFrame ec;


    public View(){
        mf = new MainFrame();
        ac =new AddContactFrame();
        vc = new ViewAllContactsFrame();
        dc = new RemoveContactFrame();
        sc = new SearchContFrame();
        ec = new EditContactFrame();

    }

    public EditContactFrame getEc() {
        return ec;
    }
    public MainFrame getMf() {
        return mf;
    }
    public void centerInitialSetup(int linesBeingDisplayed, int size) {
        vc.getCp().setLayout(new GridLayout(linesBeingDisplayed+1, size,10 ,10));
        vc.getCp().createLabels((linesBeingDisplayed+1)*size);
    }

    public void centerUpdateBook(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            vc.getCp().getLabels().get(i).setText(headers.get(i));
        }

        for (int book_row_no = 0; book_row_no < lines.size(); book_row_no++)
        {
            for (int book_col_no = 0; book_col_no < headers.size(); book_col_no++)
            {
                int label_no = book_row_no * headers.size() + headers.size() + book_col_no;
                String label_txt = lines.get(book_row_no).get(book_col_no);
                if(vc.getCp().getLabels().size() == label_no){
                    break;
                }

                vc.getCp().getLabels().get(label_no).setText(label_txt);
            }
        }
    }



    public AddContactFrame getAc() {
        return ac;
    }

    public ViewAllContactsFrame getVc() {
        return vc;
    }

    public RemoveContactFrame getDc() {
        return dc;
    }

    public SearchContFrame getSc() {
        return sc;
    }
}
