import java.util.ArrayList;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        System.out.println("Elemen ArrayList sebelum diurutkan: " + list);
        list.sort(null);
        System.out.println("Elemen ArrayList setelah diurutkan: " + list);

    }
}