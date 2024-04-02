public class StringCompresion {
    public static String compresion(String str){
        Integer count;
        String newStr = "";

        for(int i =0; i< str.length(); i++){
            count =1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
               newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compresion(str));
    }
    
}
