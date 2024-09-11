// Contact class
class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateContactDetails(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayContactInformation() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
// ContactManager class
class ContactManager {
    Contact[] contacts;
    int contactCount;

    public ContactManager(int maxContacts) {
        this.contacts = new Contact[maxContacts];
        this.contactCount = 0;
    }

    public void addContact(Contact contact) {
        if (contactCount < contacts.length) {
            contacts[contactCount] = contact;
            contactCount++;
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact list is full. Cannot add more contacts.");
        }
    }

    public void searchContactByName(String name) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equals(name)) {
                contacts[i].displayContactInformation();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void listAllContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts in the list.");
        } else {
            for (int i = 0; i < contactCount; i++) {
                contacts[i].displayContactInformation();
                System.out.println();
            }
        }
    }
}
public class ContactManagementSystem {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager(10);

        while (true) {
            System.out.println("Contact Management System Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Search for a contact by name");
            System.out.println("3. List all contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = System.console().readLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = System.console().readLine();
                    System.out.print("Enter contact email: ");
                    String email = System.console().readLine();

                    Contact c = new Contact(name, phoneNumber, email);
                    cm.addContact(c);
                    break;

                case 2:
                    System.out.print("Enter contact name to search: ");
                    String searchName = System.console().readLine();
                    cm.searchContactByName(searchName);
                    break;

                case 3:
                    cm.listAllContacts();
                    break;

                case 4:
                    System.out.println("Exiting the contact management system.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}