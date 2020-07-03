package com.test.actuator;

/**
 * @author yanHeng
 * @date 2020-07-01 11:53
 * @description 二维数组
 */
public class Demo1 {




    public static boolean Find(int[][] array, int target) {
        if (array == null || array[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = array.length - 1;
        while (row < array.length && col >= 0) {
            if (target > array[row][col]) {
                row++;
            } else if (target < array[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;

    }

    public static int[][] getRandomNum(int m,int n){
        int[][] generate = new int[m][n];

        for(int i=0;i<m; i++){
            int row = i;
            for(int j=0 ; j<n;j++){
                generate[i][j]=row;
                row++;
            }
        }
        return generate;
    }

    public static void print(int[][] p){
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[i].length;j++){
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] test = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        //boolean testFlag = Find(test,5);
//        int row = test.length;
//        System.out.println(row);

        int[][] test2 = getRandomNum(3,5);
        print(test2);

    }
}
