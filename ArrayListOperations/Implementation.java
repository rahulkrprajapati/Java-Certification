package ArrayListOperations;

import java.util.*;
public class Implementation {
    public int sumOfElements(ArrayList<Integer> list){
        int sum = 0;
        if(list.size()==0){
            return 0;
        }
        else{
            for (int iterable_element : list) {
                sum += iterable_element;
            }
            return sum;
        }
         
    }

    public Integer getElementAtIndex(ArrayList<Integer>list, int index){
        try {

            return list.get(index);
        
        } catch (Exception e) {
            return null;
        }    
    }
    public ArrayList<Integer> splitReverse(ArrayList<Integer> list){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int size = list.size();

        double temp = size/2;
        int mid = (int)Math.ceil(temp);
        for (int i = 0; i < mid; i++) {
            first.add(list.get(i));
        }
        for (int i = mid; i < size; i++) {
            second.add(list.get(i));
        }

        if(size % 2 != 0){
            first.add(second.get(0));
            second.remove(second.get(0));
        }
        
        for(int i=first.size()-1;i>=0;i--){
            result.add(first.get(i));
        }
        for(int i=second.size()-1;i>=0;i--){
            result.add(second.get(i));
        }

        return result;

    }

}
