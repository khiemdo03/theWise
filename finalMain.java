import java.util.*;
//Khiem Do

public class finalMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> menu = new ArrayList<>();
        List<finalTruck> nameList = new ArrayList<>();
        menu.add("1. View truck status");
        menu.add("2. Assign job to truck");
        menu.add("3. Refuel truck");
        menu.add("4. End program");

        finalTruck first = new finalTruck("Scoop", 5, 10);
        finalTruck second = new finalTruck("Muck", 2, 8);
        finalTruck third = new finalTruck("Dizzy", 4, 20);
        nameList.add(first);
        nameList.add(second);
        nameList.add(third);

        System.out.println(menu.toString().replace(",", "\n").replace("[", " ").replace("]", " "));
        System.out.print(" What would you like to do? ");

        int selection = scan.nextInt(); // this include number and enter

        while (selection != 4) {
            switch (selection) {
                case 1:
                String name = "";
                System.out.println(" Truck name?");
                name = scan.nextLine(); 
                name = scan.nextLine(); // scan the input now
                if (searchName(nameList, name) != null) {
                    if(name.equals("Scoop")){
                        System.out.println(first);
                    }
                    if(name.equals("Muck")){
                        System.out.println(second);
                    }
                    if(name.equals("Dizzy")){
                        System.out.println(third);
                    }
                } else {
                    System.out.print(" Unavailable name!");
                }
                break;
            }
            System.out.println(" Choose a given number \n");
            System.out.println(menu.toString().replace(",", "\n").replace("[", " ").replace("]", " "));
            System.out.print(" What would you like to do? ");
            selection = scan.nextInt();

        }
        System.out.println(" Good Bye");
    }
    public static finalTruck searchName(List<finalTruck> nameList, String name) {
        for (finalTruck i : nameList) {
            finalTruck currentName = i;
            if (name.equalsIgnoreCase(currentName.getName())) {
                return currentName; // existed name
            }
        }
        return null; // non-existed name
    }
}
