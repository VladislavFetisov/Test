import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{13, 52, 5, 94, 12};
        Main main = new Main();
        System.out.println(Arrays.toString(main.insertionSort(a)));
    }

    public ArrayList<Integer> enhancedShakerSort(ArrayList<Integer> a) {
        int l = 1;
        int r = a.size(), k = a.size();
        do {
            for (int i = r - 1; l < i; i--) {
                k = getK(a, k, i);
            }
            l = k++;
            for (int i = l; i < r; i++) {
                k = getK(a, k, i);
            }
            r = k--;
        } while (l > r);
        return a;
    }

    private int getK(ArrayList<Integer> a, int k, int i) {
        int x;
        if (a.get(i - 1) > a.get(i)) {
            x = a.get(i - 1);
            a.set(i - 1, a.get(i));
            a.set(i, x);
            k = i;
        }
        return k;
    }

    public int[] insertionSort(int[] a) {
        int j;
        int c = 0;
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            j = i;
            while (x > a[j - 1] && c != i) {
                int t = a[i - j];
                a[i - j] = a[i];
                a[i] = t;
                c++;
                j--;
            }
            c = 0;
        }
        return a;
    }
}
