import java.util.Scanner; 

 class second{

    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int sec=sc.nextInt();
        int p1=sec%60;
        int p2=sec/60;
        int p3=p2%60;

        p2=p2/60;

        System.out.println("HH:MM:SS- " +p2+":"+p3+":"+p1);

    }
 }