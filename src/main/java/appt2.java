import java.util.Random;

public class appt2 {
    public static void main(String args[])
    {
        for(int i = 0 ; i < 10 ;i++){
        Random r = new Random();
            System.out.println(r.nextInt(10) + " ");
       }
    }

}
