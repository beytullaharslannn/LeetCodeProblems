import java.util.HashMap;

class validAnagram{
    public static void main(String[]args){
        System.out.println(isAnagram("anagram", "gramana"));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sH = new HashMap<>();
        HashMap<Character,Integer> tH = new HashMap<>();
        for(int i =0 ;i<s.length();i++){
            sH.put(s.charAt(i), sH.getOrDefault(s.charAt(i), 0)+1);
            tH.put(t.charAt(i), tH.getOrDefault(t.charAt(i), 0)+1);
        }
        System.out.println(sH);
        System.out.println(tH);
      

        return sH.equals(tH);
    }
}