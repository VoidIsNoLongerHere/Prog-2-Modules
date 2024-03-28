import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class Contacts{
        //Create the contacts
        public static String[] firstName = new String[]{"Bill", "Jane", "John", "Beth", "Steve"};
        public static String[] lastName = new String[]{"Burr", "Doe", "Doe", "Beth", "Jameson"};
        public static String[] email = new String[]{"Bill@website.com", "Jane@website.com", "John@website.com", "Beth@website.com", "steve@website.com"};
        public static String[] phone = new String[]{"(000)-000-0001", "(000)-000-0002", "(000)-000-0003", "(000)-000-0004", "(000)-000-0005"};

    }
    public static void main(String[] args) throws Exception {


        while(true){
            switch (prompt()) {
                case 1 -> {
                    showAllContacts();
                    break;
                }
                case 2 -> {
                    searchLastName();

                    break;
                }
                case 3 -> {
                    searchFirstName();
                    break;
                }
                case 4 -> System.exit(0);
                default -> {
                    System.out.println("Invalid input");
                    break;
                }

            }
        }



    }
    public static Integer prompt(){
        return InGen.in("1: Show all contacts\n2: Last name search\n3: First name search\n4: Exit\nPlease enter your choice: ", Integer.class);
    }

    public static void showAllContacts(){
        for (int i = 0; i < Contacts.firstName.length-1;i++){

            System.out.println(Contacts.firstName[i] + " " + Contacts.lastName[i]+":");
            System.out.println("\tEmail: " + Contacts.email[i]);
            System.out.println("\tPhone: "+ Contacts.phone[i]);

        }
    }

    public static void printContact(int index){
        System.out.println(Contacts.firstName[index] + " " + Contacts.lastName[index]+":");
        System.out.println("\tEmail: " + Contacts.email[index]);
        System.out.println("\tPhone: "+ Contacts.phone[index]);
    }


    public static void searchLastName(){

        String search = InGen.in("Please enter the last name: ", String.class);
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < Contacts.lastName.length-1;i++){
            if (search.equalsIgnoreCase(Contacts.lastName[i])){
                indexes.add(i);
            }
        }
        for (Integer i : indexes) {
            printContact(i);
        }
    }

    public static void searchFirstName(){

        String search = InGen.in("Please enter the first name: ", String.class);
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < Contacts.firstName.length-1;i++){
            if (search.equalsIgnoreCase(Contacts.firstName[i])){
                indexes.add(i);
            }
        }
        for (Integer i : indexes) {
            printContact(i);
        }
    }


}