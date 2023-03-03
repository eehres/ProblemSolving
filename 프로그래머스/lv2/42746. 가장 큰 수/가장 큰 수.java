import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        String answer = "";
        Arrays.sort(arr, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return (o2+o1).compareTo(o1+o2);
		}
	});
        if(arr[0].equals("0")) return "0";
        answer = String.join("", arr);
        return answer;
    }
}