package Wipro;
public class UserMainCode {
    public int FindAdvancedContestants(String input1, String input2){
        String numbers[] = input1.split(" ");
        String vaues[] = input2.split(" ");
        int count = 0;
        for (String string : vaues) {
            if (Integer.parseInt(string) > Integer.parseInt(numbers[1])){
                count+=1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.FindAdvancedContestants("8 5", "10 9 8 7 7 7 5 5"));
    }
}
