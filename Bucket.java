import java.util.ArrayList;
import java.util.List;
class Bucket<T> {
    private List<T> items;

    public Bucket() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added " + item.toString() + " to the bucket.");
    }

    public List<T> getItems() {
        return items;
    }
}