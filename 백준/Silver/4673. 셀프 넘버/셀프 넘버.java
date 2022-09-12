import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
		int num;
        for(int i = 1; i<=10000;i++){
            num = i;
            for(int j = 0;j<(Integer.toString(i)).length();j++){
                num+=(Integer.toString(i)).charAt(j)-'0';
            }
            nums.add(num);
        }
        for(int i = 1; i<=10000;i++){
            if(!nums.contains(i)){
                System.out.println(i);
            }
        }
	}
}
