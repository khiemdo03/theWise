import java.util.*;

//Khiem Do 5:27
public class Project4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> menu = new ArrayList<>();
        List<Character> charactersList = new ArrayList<>();
        Character myCharacter = new Character("", 0);

        menu.add("1. Create a character");
        menu.add("2. Character adds an item");
        menu.add("3. Character drops an item");
        menu.add("4. Character sells an item to a a vendor");
        menu.add("5. Character sells an item to another character");
        menu.add("6. List characters");
        menu.add("7. List a character's inventory by value");
        menu.add("8. List all characters' inventories by value");
        menu.add("9. Quit");
        System.out.println(menu.toString().replace(",", "\n").replace("[", " ").replace("]", " "));
        System.out.print(" What would you like to do? ");

        int selection = scan.nextInt(); // this include number and enter

        while (selection != 9) {
            switch (selection) {
                case 1: // 1. Create a character
                    String CharacterName = "";
                    int CharacterCredit = 0;

                    System.out.print(" What is the character's name? ");
                    CharacterName = scan.nextLine(); // take the enter(\n) @ 23
                    CharacterName = scan.nextLine(); // scan the input now

                    if (searchCharacter(charactersList, CharacterName) != null) {
                        System.out.println(" Error. This character's name has been used. \n");
                    } else {
                        System.out.print(" How many credits does this player have? ");
                        CharacterCredit = scan.nextInt();
                        System.out.println(" " + CharacterName + " is added. \n");
                        myCharacter = new Character(CharacterName, CharacterCredit); // new character created containing
                        charactersList.add(myCharacter);                                                         // Name, Credit
                    }
                    break;
                case 2: // 2. Character adds an item
                    System.out.print(" Which character is adding the item? ");
                    String ItemName = "";
                    int ItemValue = 0;
                    CharacterName = scan.nextLine();
                    CharacterName = scan.nextLine();

                    if (searchCharacter(charactersList, CharacterName) == null) {
                        System.out.println(" Error, this character is not added yet, try again. \n"); // call
                                                                                                      // searchCharacter
                                                                                                      // method
                    } else {
                        System.out.print(" What is the name of the item you want to add? ");
                        ItemName = scan.nextLine();
                        System.out.print(" How much is it worth? ");
                        ItemValue = scan.nextInt();
                        System.out.println(" " + CharacterName + " just got " + ItemName + ".\n");

                        for (Character i : charactersList) { // for (int i; i < characterList.size(); i ++);
                            Character thisCharacter = i; // get (i);
                            if (thisCharacter.get_CharacterName().equalsIgnoreCase(CharacterName)) { //thisCharacter to select the exact character. then compare StringName between thisCharacter to StringName from input
                                thisCharacter.addItem(ItemName, ItemValue);// add thisCharacter(now include name, credit) to addItem (which include name, credit, and Item)
                            }
                        }
                    }
                    break;
                case 3: // 3. Character drops an item
                    System.out.print(" Which character is dropping the item? ");
                    ItemName = "";
                    CharacterName = scan.nextLine();
                    CharacterName = scan.nextLine();

                    if (searchCharacter(charactersList, CharacterName) == null) {
                        System.out.println(" Error, this character is not added yet, try again. \n");
                    } else {
                        System.out.print(" What is the name of the item you want to drop? ");
                        ItemName = scan.nextLine();
                        if (myCharacter.dropItem(ItemName) == true) {
                            System.out.println(" " + CharacterName + " has succesfully drop " + ItemName + ". \n");

                        } else {
                            System.out.println(" " + ItemName + " is not yet added to be removed. \n");
                        }
                    }
                    break;
                case 4: // 4. Sell to vendor
                    System.out.print(" Which character is selling the item to the vendor? ");
                    ItemName = "";
                    CharacterName = scan.nextLine();
                    CharacterName = scan.nextLine();

                    if (searchCharacter(charactersList, CharacterName) == null) {
                        System.out.println(" Error, this character is not added yet, try again. \n");
                    } else {
                        System.out.print(" What is the name of the item you want to sell? ");
                        ItemName = scan.nextLine();
                        if (myCharacter.sellItemToVendor(ItemName) == true) {
                            System.out.println(
                                    " " + CharacterName + " has succesfully sell " + ItemName + "to the vendor. \n");
                        } else {
                            System.out.println(ItemName + " is not yet added to be removed. \n");
                        }
                    }
                    break;
                case 6:
                    System.out.println(" This is the list of character(s): \n");
                    for (Character i : charactersList){
                        Character thisCharacter = i;
                        System.out.println(" " + thisCharacter.get_CharacterName() + ".");
                    }
                    System.out.println("");
                    break;

            }
            System.out.println(menu.toString().replace(",", "\n").replace("[", " ").replace("]", " "));
            System.out.print(" What would you like to do? ");
            selection = scan.nextInt();
        }
        System.out.println(" Thank you for quitting.");
    }

    public static Character searchCharacter(List<Character> charactersList, String CharacterName) {
        for (Character i : charactersList) {
            Character currentCharacter = i;
            if (CharacterName.equalsIgnoreCase(currentCharacter.get_CharacterName())) {
                return currentCharacter; // existed CharacterName
            }
        }
        return null; // non-existed CharacterName
    }
}
