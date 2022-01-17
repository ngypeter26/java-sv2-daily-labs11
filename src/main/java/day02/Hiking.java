package day02;

import java.util.List;

public class Hiking {


    public long getPlusElevation(List<Long> heights){
        long sum = 0;
        long dh = 0;

        for (int i = 1; i<heights.size();i++){
            dh = heights.get(i) - heights.get(i-1);
            sum += dh > 0 ? dh : 0;
        }
        return sum;
    }
}
