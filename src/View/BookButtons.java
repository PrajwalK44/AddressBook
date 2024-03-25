package View;
import java.awt.*;
public class BookButtons extends Panel {
    Button viewContacts;
    Button addContact;
    Button deleteContact;
    Button editContact;
    Button searchContact;
    public BookButtons(){
        viewContacts = new Button("View All Contacts");
        viewContacts.setForeground(Color.RED);
        viewContacts.setBackground(new Color(153, 246, 255, 239));
        viewContacts.setSize(10,30);
        viewContacts.setFont(new Font("Helvetica", Font.BOLD, 14));
        addContact = new Button("Add Contact");
        addContact.setForeground(Color.RED);
        addContact.setBackground(new Color(153, 243,255));
        addContact.setFont(new Font("Helvetica", Font.BOLD, 14));
        addContact.setSize(5,20);
        deleteContact = new Button("Delete Contact");
        deleteContact.setForeground(Color.RED);
        deleteContact.setBackground(new Color(153, 243,255));
        deleteContact.setFont(new Font("Helvetica", Font.BOLD, 14));
        editContact = new Button("Edit Contact");
        editContact.setForeground(Color.RED);
        editContact.setBackground(new Color(153, 236,255));
        editContact.setFont(new Font("Helvetica", Font.BOLD, 14));
        searchContact = new Button("Search a Contact");
        searchContact.setForeground(Color.RED);
        searchContact.setBackground(new Color(153, 243,255));
        searchContact.setFont(new Font("Helvetica", Font.BOLD, 14));
        add(viewContacts);
        add(addContact);
        add(deleteContact);
        add(editContact);
        add(searchContact);
        setLayout(new GridLayout(6,1));
    }
    public Button getAddContact() {
        return addContact;
    }
    public Button getDeleteContact() {
        return deleteContact;
    }
    public Button getEditContact() {
        return editContact;
    }
    public Button getSearchContact() {
        return searchContact;
    }
    public Button getViewContacts() {
        return viewContacts;
    }
}
