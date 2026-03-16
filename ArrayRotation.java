
//See Instrucitons:
// http://apcsa-book.ausdk12.org/apcsa/r/cur/c4/L23_2D_arrays/exercises3.html?topic=c4%2FL23_2D_arrays.topic
public class ArrayRotation{
    private int[][] nums;
    
    public ArrayRotation(int n){
        nums = new int[n][n];
        int y = 0;
        for(int r = 0; r < nums.length; r ++){
            for(int c = 0; c < nums[r].length; c++){
                nums[r][c] = ++y;
            }
        }
    }

    public void rotate(){
         int[][] temp = new int[nums.length][nums[0].length];
        for(int r = 0; r < nums.length; r ++){
            for(int c = 0; c < nums[r].length; c++){
                temp[r][c] = nums[nums[0].length-c-1][r];
            }
        }
        nums = temp;
    }
    public void print(){
        for(int r = 0; r < nums.length; r ++){
            for(int c = 0; c < nums[r].length; c++){
                String v = String.format("%02d", nums[r][c]);
                System.out.print(v + "|");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        ArrayRotation a = new ArrayRotation(5);
        a.rotate();
        a.print();
        
    }
}