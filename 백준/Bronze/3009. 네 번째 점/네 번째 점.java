import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arrX = new int[3];
        int []arrY = new int[3];
        int x = 0;
        int y = 0;
        for(int i = 0; i<3 ; i++){
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }
        if(arrX[0]==arrX[1]){
            x = arrX[2];
        }else if(arrX[0]==arrX[2]){
            x = arrX[1];
        }else if(arrX[1]==arrX[2]){
            x = arrX[0];
        }
        if(arrY[0]==arrY[1]){
            y = arrY[2];
        }else if(arrY[0]==arrY[2]){
            y = arrY[1];
        }else if(arrY[1]==arrY[2]){
            y = arrY[0];
        }   
		System.out.println(x+" "+y);
	}
}
