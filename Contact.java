import java.util.HashMap;

public class Contact {
    static HashMap<String, String> map = new HashMap<>();

    String addContact(String name, String contact){
        if(map.containsKey(name)){
            return "Adding Contact Failed, name already present";
        }
        else{
            map.put(name, contact);
            return "Contact Saved";
        }
    }

    String deleteContact(String name){
        if(map.containsKey(name)){
            map.remove(name);
            return "Contact deleted successfully";
        }
        else{
            return "No contact found";
        }
    }

    String searchContact(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }
        else{
            return "No contact found";
        }
    }
    public static void main(String[] args) {
        Contact obj = new Contact();
        String out1 = obj.addContact("Steve", "9988998899");
        String out2 = obj.addContact("John", "7898812345");
        String out3 = obj.deleteContact("John");
        String out4 = obj.searchContact("Steve");
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
        System.out.println(out4);
    }

}
