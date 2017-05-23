import java.util.Arrays;


public class Doors {

    public Doors(int len) {
        this.doorStatus = new int[len];      
    }

    public int[] answer(int[] d, int pass) {
        if (pass == d.length) {
            d[d.length-1] ^= 1;
            return this.doorStatus = d;
        } else {
            for(int i=pass-1; i<d.length; i=i+pass) {
                d[i] ^= 1;
            }

            return this.answer(d, pass+1);
        }
    }

    private int[] doorStatus;
}
