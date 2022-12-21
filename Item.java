public class Item {
    private String ItemName = "";
    private int ItemValue = 0;

    public Item(String ItemName, int ItemValue) {
        this.ItemName = ItemName;
        this.ItemValue = ItemValue;
    }

    public void set_ItemName(String name) {
        this.ItemName = name;
    }

    public String get_ItemName() {
        return ItemName;
    }

    public void set_ItemValue(int value) {
        this.ItemValue = value;
    }

    public int get_ItemValue() {
        return ItemValue;
    }

    public String toString() {
        return this.ItemName;
    }

}
