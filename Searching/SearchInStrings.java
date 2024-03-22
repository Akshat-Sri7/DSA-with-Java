public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Akshat";
        char target = 'A';
        System.out.println(search(name, target));
    }
    static boolean search(String name, char target){
        if(name.isEmpty())
            return false;
//        for (int i = 0; i < name.length(); i++) {
//            if(target == name.charAt(i))
//                return true;
//        }
        for (char ch: name.toCharArray()) {
            if(ch == target)
                return true;
        }
        return false;
    }
}
