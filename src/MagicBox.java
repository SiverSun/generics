import java.util.Random;
public class MagicBox <T> {
    protected T[] items;
    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    int filled = 0;
    Random random = new Random();
    int randomInt = random.nextInt(5);

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled+=1;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++){
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
