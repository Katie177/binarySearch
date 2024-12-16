import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        if (list == null) {
            throw new IllegalArgumentException("list must not be null.");
        }
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        if (list == null || comparator == null) {
            throw new IllegalArgumentException("null list or comparator");
        }

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            T middleValue = list.get(middle);
            int comparison = comparator.compare(middleValue, key);

            if (comparison < 0) {
                left = middle + 1;
            } else if (comparison > 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -(left + 1);
    }

}
