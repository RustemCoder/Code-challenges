public class MyClass {
    public static void main(String args[]) {
    System.out.println(compareStrings("kayla","Jayla"));
    }
    public static String compareStrings(String first , String second){
        int count = 0;
        int current = 0;
        for(int i=0;i<first.length();i++){
            for(int j=current;j<second.length();j++){
                if(first.charAt(i)==second.charAt(j)){
                    count++;
                    current = j;
                    break;
                }
            }
        }
        if(count == first.length()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
