
public class Recursion{
    public static void  moveAll(String str, int idx, int count, String newstring){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newstring += 'x';
                
            }
            System.out.println(newstring);
                return ;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveAll(str, idx+1, count, newstring);
        }
        else{
            newstring += currchar;
            moveAll(str, idx+1, count, newstring);
        }

    }
    
    public static void main(String rags[]){
        String str = "axbcxxdxe";
        moveAll(str, 0, 0, "");
        

    }
}
    



    
   

             