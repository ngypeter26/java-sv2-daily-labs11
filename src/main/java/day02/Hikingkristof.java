package day02;

import java.util.List;

public class Hikingkristof {


    public long getPlusElevation(List<Integer> elevation){
        long sum = 0;
        long dh = 0;

        for (int i = 1; i<elevation.size();i++){
            dh = elevation.get(i) - elevation.get(i-1);
            sum += dh > 0 ? dh : 0;
        }
        return sum;
    }


}
