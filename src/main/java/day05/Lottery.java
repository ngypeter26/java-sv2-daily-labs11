package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int numberOfPulls;
    private int numberOfNumbers;
    private List<Integer>  numbers;

    public Lottery(int numberOfPulls, int numberOfNumbers) {
        this.numberOfPulls = numberOfPulls;
        this.numberOfNumbers = numberOfNumbers;
        this.numbers = createNumbers(numberOfNumbers);
    }

    // ha ugyanazt húzza, visszateszi
//    public List<Integer>  startLottery(){
//        Random random = new Random();
//        List<Integer> results = new ArrayList<>();
//        int actual;
//
//        while (results.size()<numberOfPulls){
//            actual=random.nextInt(numberOfPulls)+1;
//            if (!results.contains(actual)){
//                results.add(actual);
//            }
//        }
//        return results;
//    }

    // ha ugyanazt húzza, visszateszi
    public List<Integer>  startLottery(){
        Random random = new Random();


        List<Integer> results = new ArrayList<>();
        int index;
        int numberOfRestNumbers = numberOfNumbers;

        while (results.size()<numberOfPulls){
            index=random.nextInt(numberOfRestNumbers);
            results.add(numbers.get(index));
            numbers.remove(index);
            numberOfRestNumbers--;
        }
        return results;
    }
    public List<Integer> createNumbers (int numberOfNumbers){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<numberOfNumbers+1;i++){
            numbers.add(i);
        }
        return numbers;
    }
}
