public class third {
    public static void main(String[] args) {
        
        int[][] a = new int [4][3];
        System.out.println(a[0][0]);

        int [][] b = {{3,4,5},{6,7,8},{9,10,11}};
        System.out.println(b[1][2]);

        int [][] c = {{3,4,5},{6,7,8}};
        for(int i = 0; i<a.length;i++)
        System.out.println(c[i]);



        int [][] d = {{3,4,5},{6,7,8}};

        for(int i = 0; i<a.length;i++)

        for(int j = 0; j<3; j++){
        System.out.println(d[i][j]);



        int [][]e = {{13,14,15},{26,23,28}};
        for(int x=0;x<e[x].length;x++){
            for(int y=0; y<e[x].length;y++)
            System.out.println(e[x][y]);
        }

        }
    }
}