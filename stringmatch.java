public class stringmatch {
    public static void main(String[] args) {
        String path ="ab";
        String orj = "bcabc";
        System.out.println();
        for(int i=0;i<=orj.length()-path.length();i++){
            int j=0;
            while(j!=path.length()&&path.charAt(j)==orj.charAt(i+j)){
                j++;
            }
            if(j==path.length()){
                System.out.println("bulundu");
                break;
            }

        }
    }
}
