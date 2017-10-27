import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class DoorsTest {

    public static int[] verify() {
      int[] answer = new int[100];
      int i;		
      for(i = 1; i < 101; i++){
         double sqrt = Math.sqrt(i);
         if(sqrt != (int)sqrt){
            answer[i-1] = 0;
         }else{
            answer[i-1] = 1;
         }
        }
        return answer;
    } 

    @Test
    public void door_status100() {
        int len = 100;
        int[] d;
        int[] answer;
        double sqrt;
        
        Doors doors = new Doors(len);
        d = doors.answer(new int[len], 1);  

        answer = this.verify();

        assertArrayEquals(d, answer);
    }
}

