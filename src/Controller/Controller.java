package Controller;
import Model.Model;
import View.View;
import java.awt.event.*;
public class Controller {
    View view;
    Model model;

    public Controller(Model m, View v){
        view = v;
        model = m;

        model.getManage().setLinesBeingDisplayed(15);
        view.centerInitialSetup(model.getManage().getLinesBeingDisplayed(), model.getManage().getHeaders().size());
        model.getManage().setFirstLineToDisplay(0);
        view.centerUpdateBook(model.getManage().getLines(model.getManage().getFirstLineToDisplay(), model.getManage().getLinesBeingDisplayed()), model.getManage().getHeaders());

        view.getMf().getIp().getButt().getAddContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getAc().setVisible(true);
            }
        });
        view.getVc().getCp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getManage().getFirstLineToDisplay();
                int current_last_line = model.getManage().getLastLineToDisplay();
                int emp_no = model.getManage().getTable().size();
                int no_of_display_lines = model.getManage().getLinesBeingDisplayed();
                if (units <= 0 && current_first_line == 0) {
                    model.getManage().setFirstLineToDisplay(0);
                } else if (units <= 0 && current_first_line > 0) {
                    int new_first_line = current_first_line + units;
                    if (new_first_line <= 0) {
                        model.getManage().setFirstLineToDisplay(0);
                    } else {
                        model.getManage().setFirstLineToDisplay(new_first_line);
                    }
                } else if (units > 0 && current_last_line == emp_no - 1) {
                    model.getManage().setFirstLineToDisplay(current_first_line);
                } else if (units > 0 && current_last_line < emp_no - 1) {
                    int new_first_line = current_first_line + units;
                    if (new_first_line <= 0) {
                        model.getManage().setFirstLineToDisplay(0);
                    } else {
                        model.getManage().setFirstLineToDisplay(new_first_line);
                    }
                } else if (units > 0 && current_last_line == emp_no - 1) {
                    model.getManage().setFirstLineToDisplay(current_first_line);
                } else if (units > 0 && current_last_line < emp_no - 1) {
                    int new_first_line = current_first_line + units;
                    if (new_first_line > emp_no - no_of_display_lines) {
                        new_first_line = emp_no - no_of_display_lines;
                        model.getManage().setFirstLineToDisplay(new_first_line);
                    } else {
                        model.getManage().setFirstLineToDisplay(new_first_line);
                    }
                }
                view.centerUpdateBook(model.getManage().getLines(model.getManage().getFirstLineToDisplay(), model.getManage().getLastLineToDisplay()), model.getManage().getHeaders());
            }
        });


        view.getAc().getAddDetails().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getAc().getname().getText();
                String phoneNumber = view.getAc().getPhoneNumber().getText();
                String emailID = view.getAc().getEmailId().getText();
                String address = view.getAc().getAddress().getText();

                model.getManage().addNewContact(name,phoneNumber, emailID, address);
            }
        });

        view.getMf().getIp().getButt().getViewContacts().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getVc().setVisible(true);
            }
        });

        view.getMf().getIp().getButt().getDeleteContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDc().setVisible(true);
            }
        });

        view.getDc().getDel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getDc().getDelname().getText();
                model.getManage().delContact(name);
            }
        });

        view.getMf().getIp().getButt().getSearchContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSc().setVisible(true);
            }
        });
        view.getEc().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                view.getEc().setVisible(false);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        view.getSc().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {
                view.getSc().setVisible(false);
            }
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
        view.getAc().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosing(WindowEvent e) {
                view.getAc().setVisible(false);
            }
            @Override
            public void windowClosed(WindowEvent e) {
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        view.getVc().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                view.getVc().setVisible(false);
            }
            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }
            @Override
            public void windowActivated(WindowEvent e) {

            }
            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        view.getDc().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                view.getDc().setVisible(false);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }
            @Override
            public void windowIconified(WindowEvent e) {

            }
            @Override
            public void windowDeiconified(WindowEvent e) {

            }
            @Override
            public void windowActivated(WindowEvent e) {

            }
            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        view.getSc().getSearchBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nametosearch=view.getSc().getTxt_con_name().getText();
                String name = "";
                String p = "";
                String ei = "";
                String a = "";
                for(int i=0; i< model.getManage().getTable().size(); i++){
                    if (nametosearch.equals(model.getManage().getTable().get(i).getName())){
                        System.out.println("+1");
                        name = model.getManage().getTable().get(i).getName();
                        p = String.valueOf(model.getManage().getTable().get(i).getPhoneNumber());
                        ei = model.getManage().getTable().get(i).getEmailAddress();
                        a = model.getManage().getTable().get(i).getAddress();
                        break;
                    }
                }

                for (int i=0; i< model.getManage().getTable().size(); i++) {
                    if (view.getEc().getGetname().getText().equals(model.getManage().getTable().get(i).getName())) {

                    }
                }
                view.getSc().getTxt_name().setText(name);
                view.getSc().getTxt_phone().setText(p);
                view.getSc().getTxt_email().setText(ei);
                view.getSc().getTxt_addr().setText(a);
                view.getSc().getTop().setVisible(true);
                model.getManage().searchContact(view.getSc().getTxt_con_name().getText(), name, p, ei, a);
            }
        });


        view.getMf().getIp().getButt().getEditContact().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getEc().setVisible(true);
            }
        });

        view.getEc().getGet().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = null;
                String p = null;
                String ei = null;
                String a = null;
                for (int i = 0; i < model.getManage().getTable().size(); i++) {
                    if (view.getEc().getGetname().getText().equals(model.getManage().getTable().get(i).getName())) {
                        name = model.getManage().getTable().get(i).getName();
                        p = String.valueOf(model.getManage().getTable().get(i).getPhoneNumber());
                        ei = model.getManage().getTable().get(i).getEmailAddress();
                        a = model.getManage().getTable().get(i).getAddress();
                        break;
                    }
                }
                view.getEc().getname().setText(name);
                view.getEc().getPhoneNumber().setText(p);
                view.getEc().getEmailId().setText(ei);
                view.getEc().getAddress().setText(a);
                view.getEc().getUpp().setVisible(true);
            }
        });

        view.getEc().getAdd1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getEc().getname().getText();
                String phoneNumber = view.getEc().getPhoneNumber().getText();
                String emailID = view.getEc().getEmailId().getText();
                String address = view.getEc().getAddress().getText();

                model.getManage().editContact(view.getEc().getGetname().getText(), name, phoneNumber, emailID, address);
            }
        });
    }
}
