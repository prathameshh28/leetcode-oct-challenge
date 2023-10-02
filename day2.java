public class day2 {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        int a=0, b=0, i=0;
        while(i<n){
            char currentColour = colors.charAt(i);
            if(currentColour=='A'){
                int continousA = 0;
                while(i<n && colors.charAt(i)=='A'){
                    continousA++;
                    i++;
                }
                if(continousA>=3){
                    a+=continousA-2;
                } 
            }
            else if(currentColour=='B'){
                int continousB = 0;
                while(i<n && colors.charAt(i)=='B'){
                    continousB++;
                    i++;
                }
                if(continousB>=3){
                    b+=continousB-2;
                } 
            }
        }
       return a>b; 
    }
}
