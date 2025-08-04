package stringsRecursion;

public class keypadKaKaam {
    static void print(String key, String[] map, String res){
        if(key.isEmpty()) {
            System.out.print(res+" ");
            return;
        }
        int button = key.charAt(0) - '0';

        for(int i=0; i<map[button].length(); i++){
            print(key.substring(1), map, res+map[button].charAt(i));
        }


        
    }
    public static void main(String[] args) {
        String key = "235";
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        print(key, map, "");
    }
}
