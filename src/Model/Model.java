package Model;
public class Model {
    manageAddressBook manage;
    public Model(){
        manage = new manageAddressBook();
    }
    public manageAddressBook getManage() {
        return manage;
    }
}
