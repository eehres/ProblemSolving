import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int cnt = 0;
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> next;

		set.add(x);
		while (!set.isEmpty()) {
			if (set.contains(y))
				return cnt;

			next = new HashSet<>();
			for (int val : set) {
				if (val + n <= y)
					next.add(val + n);
				if (val * 2 <= y)
					next.add(val * 2);
				if (val * 3 <= y)
					next.add(val * 3);
			}
			
			set = next;
			cnt++;
		}

		return -1;
	}
}