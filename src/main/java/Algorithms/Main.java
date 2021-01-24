package Algorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    public int multiplication(int a,int b){
        return a*b;
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
        int key, j;
        for (int i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && key > a[j]) {
                a[j + 1] = a[j];
                a[j] = key;
                j--;
            }
        }
        return a;
    }

    public int bagPacking(Map<Integer, Integer> tre, int capacity) {
        int i = 0;
        int[][] res = new int[tre.size()][capacity + 1];

        for (Map.Entry<Integer, Integer> treasure : tre.entrySet()) {
            for (int j = 0; j < capacity + 1; j++) {
                if (j < treasure.getKey()) {
                    if (i == 0) res[i][j] = 0;
                    else res[i][j] = res[i - 1][j];
                } else {
                    if (i == 0) res[i][j] = treasure.getValue();
                    else res[i][j] = Math.max(res[i - 1][j], treasure.getValue() + res[i - 1][j - treasure.getKey()]);
                }
            }
            i++;
        }
        return res[tre.size() - 1][capacity];
    }
}