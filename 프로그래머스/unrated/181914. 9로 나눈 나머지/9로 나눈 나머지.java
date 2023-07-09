import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
class Solution {
    public int solution(String number) {
        AtomicInteger sum = new AtomicInteger();
        IntStream.range(0, number.length()).forEach( (e) -> {
            sum.addAndGet(Integer.parseInt(String.valueOf(number.charAt(e))));
        });
        return sum.get() % 9;
    }
}