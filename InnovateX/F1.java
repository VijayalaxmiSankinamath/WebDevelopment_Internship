import java.util.Scanner;
/*class TodayTask{
	static int calculateParkingLot(int hr,int min){
		int fees=0;
		if(hr<0){
			return -1;
		}
		if(min<0 || min>59){
			return -2;
		}
		if( min<=15){
			return fees;
		}else if(hr<=2 && min>15){
			return fees+5;
		}
		else if(hr >2 && hr <=5){
			return fees+10;
		}
		else if(hr>5){
			return fees+ 10 + (hr-5);
		}
		return fees;
	}
}
class F1
{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min= sc.nextInt();
		int s1=TodayTask.calculateParkingLot(hr, min);
		System.out.println(s1);
		
	}
}
		
		
*/

class TodayTask {

    static int calculateParkingLot(int hr, int min) {

        if (hr < 0) return -1;
        if (min < 0 || min > 59) return -2;

        int totalMinutes = hr * 60 + min;

        if (totalMinutes <= 15) {
            return 0;
        }
        else if (totalMinutes <= 120) {  // 2 hours
            return 5;
        }
        else if (totalMinutes <= 300) {  // 5 hours
            return 10;
        }
        else {
            int extraHours = (totalMinutes - 300 + 59) / 60; 
            return 10 + extraHours;
        }
    }
}

class F1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int min = sc.nextInt();

        int result = TodayTask.calculateParkingLot(hr, min);
        System.out.println(result);
    }
}
			
			
