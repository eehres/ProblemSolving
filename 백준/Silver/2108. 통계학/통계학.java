import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];
        double sum = 0;
        for(int i = 0 ; i< N ; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);

        int[] plus = new int[4002];
        int[] minus = new int[4001];
        for(int i=0;i<N;i++) {
            if(arr[i] <0) {
                minus[Math.abs(arr[i])]++;
            }

            else {
                plus[arr[i]]++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;

        int max = 0;
        for(int i=0; i<plus.length;i++) {
            max = Math.max(max, plus[i]);

        }
        for(int i=0; i<minus.length;i++) {
            max = Math.max(max, minus[i]);
        }

        for(int i : arr) {
            if(i<0) {
                if(minus[Math.abs(i)] == max && !(list.contains(i))) {
                    list.add(i);
                }
            }
            else {
                if(plus[i] == max && !(list.contains(i))) {
                    list.add(i);
                }
            }
        }

        if(list.size()>=2) {
            c = list.get(1);
        }
        else {
            c = list.get(0);
        }
        System.out.println(Math.round(sum/N));
        System.out.println(arr[arr.length/2]);
        System.out.println(c);
        System.out.println(arr[arr.length-1]-arr[0]);

    }
}
