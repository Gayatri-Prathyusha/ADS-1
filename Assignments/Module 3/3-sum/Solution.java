import java.util.Scanner;
public class Solution {
    Solution() {

    }
    public static void main(String[] args)  { 
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] a = new int[n];
        ThreeSum ts = new ThreeSum(a, n);
        for(int i = 0; i < n; i ++) {
            a[i] = in.nextInt();
        }
        int count = ts.count(a);
        System.out.println(count);
    } 
} 
