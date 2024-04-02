public class ShortestPath {
    public static float shortPath(String str){
        int x = 0, y =0;

        for(int i =0; i<str.length(); i++){
            char dir = str.charAt(i);

            if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'N'){
                y++;
            } else{
                y--;
            }

        }
        int X = x*x;
        int Y = y*y;

        return (float)Math.sqrt(X+Y);
    }

    public static void main(String args[]){
        String str = "WNEENESENNN";

        System.out.println(shortPath(str));

    }
    
}
