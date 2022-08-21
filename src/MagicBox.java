import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int filled = 0;
    Random random = new Random();

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, заполните " + (items.length - filled) + " ячеек");
            } else {
                int randomInt = random.nextInt(items.length);
                System.out.println("Коробка заполнена, случайный элемент: " + items[randomInt]);
                return items[randomInt];
            }
        }
        return null;
    }

}
