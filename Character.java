import java.util.*;

public class Character {
    private String CharacterName = "";
    private int CharacterCredit = 0;
    private Item Item_owned;

    List<Item> items = new ArrayList<>();

    public Character(String CharacterName, int CharacterCredit) {
        this.CharacterName = CharacterName;
        this.CharacterCredit = CharacterCredit;
    }

    public void print() {
        System.out.print(CharacterName + CharacterCredit);
    }

    public void set_CharacterName(String name) {
        this.CharacterName = name;
    }

    public String get_CharacterName() {
        return CharacterName;
    }

    public void set_CharacterCredit(int credit) {
        this.CharacterCredit = credit;
    }

    public int get_CharacterCredit() {
        return CharacterCredit;
    }

    public void addItem(String ItemName, int ItemValue) {
        Item item = new Item(ItemName, ItemValue);
        items.add(item);
    }

    public boolean dropItem(String ItemName) {
        for (Item i : items) {
            Item thisItem = i;
            if (thisItem.get_ItemName().equalsIgnoreCase(ItemName)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean sellItemToVendor(String ItemName) {
        for (Item i : items) {
            Item thisItem = i;
            if (thisItem.get_ItemName().equalsIgnoreCase(ItemName)) {
                Character.this.set_CharacterCredit(CharacterCredit + thisItem.get_ItemValue());
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean isLetter(char charAt) {
        return false;
    }
}
