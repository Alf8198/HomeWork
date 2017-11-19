package NET;

import java.util.*;

public class Task_ch3 {

    public static void main(String[] args) {
        ArrayList<Integer> weight = new ArrayList<>(Arrays.asList(73, 74, 75, 93, 75, 93, 82, 92, 61, 10, 185,11,12,13,14));
        Collections.sort(weight);
        weight.forEach(System.out::println);

        Map<Integer, String> map = new TreeMap<>();
        Iterator<Integer> iterator = weight.iterator();
        String s = "*";
        int bar = 0;
        for (int i = 0; i < weight.size(); i++) {
//getValue s+; подумать
                while (weight.get(i) > bar) {
                    bar += 5;
                    if (weight.get(i) <= bar) {
                        map.put(bar, s);
                    }

                }
            }
        System.out.println(map);


//        Integer oldCount = (Integer) groupFreqData.get(weightGroup);
//        Integer newCount = (oldCount==null);
//        new Integer(1);
//        new Integer(oldCount.intValue()+1);
//        gropFreqData.put(weightGroup, newCount);
//
//        //HashMap<Integer, String> map  = new HashMap<>();
//
//
//        list keys = new ArrayList<>(groupFreqData.keySet());
//        Collections.sort(keys);
//        //текущий ключ(группа)
//        Integer group = (Integer)keyIterstor.next();
//        // счетчик (значение) из карты
//        Integer count = (Integer) groupFreqData.get(group);
//
//        Arrays.fill(bar,"*");

    }
}
