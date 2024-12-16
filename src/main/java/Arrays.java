import java.util.Comparator;

public class Arrays {

    static int binarySearch(byte[] a, byte key) {
       return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            byte current = a[middle];
            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);

    }

    static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            char current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            double current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }
    static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            float current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);

    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            long current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);

    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        validateRange(a.length, fromIndex, toIndex);

        int start = fromIndex;
        int end = toIndex - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int current = a[middle];

            if (current < key) {
                start = middle + 1;
            } else if (current > key) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        validateRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);

    }

    private static void validateRange(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > arrayLength || fromIndex > toIndex) {
            throw new IllegalArgumentException("Invalid range: [" + fromIndex + ", " + toIndex + ")");
        }
    }

}
