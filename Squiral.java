public class Squiral{
    private int[][] nums;

    public Squiral(int n){
        nums = new int[n][n];
        int x = n/2;
        int y = n/2;
        int count = 1;
        nums[x][y] = count;
        
        for(int r = 1; r < n; r++){
            if(x == 0 && y ==0){
                for(int d = 0; d < r; d++){
                    count ++;
                    nums[x+1][y] = count;
                    x = x+1;
                    
                }
            }
                else if(r%2 != 0 && (x - r >= 0 && y -r >= 0)){
                    for(int i = 0; i < r; i++){
                        count++;
                nums[x-1][y] = count;
                x = x - 1;
                    }
                    for(int j = 0; j < r; j++){
                        count++;
                nums[x][y-1] = count;
                y = y - 1;
                    }
                }
                else if(r%2 == 0 && (x + r <= n && y +r <= n)){
                    for(int a = 0; a < r; a++){
                    nums[x+1][y] = count;
                    count++;
                    x = x+ 1;
                    }
                    for(int b = 0; b < r; b++){
                    nums[x][y+1] = count;
                    count++;
                    y = y+1;
                    }
                }

        }
    }
    public void print(){
        for(int r = 0; r < nums.length; r ++){
            for(int c = 0; c < nums[0].length; c++){
                String v = String.format("%02d", nums[r][c]);
                System.out.print(v + "|");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Squiral n = new Squiral(8);
        n.print();
    }
}