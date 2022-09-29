import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[26];
		String s = sc.next().toUpperCase();
        int max = 0;
        char result = '?';
         for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            if (max < arr[s.charAt(i) - 'A']) {
                max = arr[s.charAt(i) - 'A'];
                result = s.charAt(i);
            } else if (max == arr[s.charAt(i) - 'A']) {
                result = '?';
            }
        }
        System.out.println(result);
        
    }
}
