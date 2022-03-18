package com.splineguy.junit.quotient;
import java.util.*;

public class myclass2 {
    public static Boolean myclass2(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        int x=0;
        int y=0;
        int z=0;
        for(int i=0; i<n; i++)
            for(int j=0; j<3; j++)
                arr[i][j] = in.nextInt();
        for(int i=0; i<n; i++){
            x += arr[i][0];
            y += arr[i][1];
            z += arr[i][2];

        }
        if(x==0 && y==0 && z==0) {
            System.out.println("YES");
            return true;
        }
        else{
            System.out.println("NO");
            return false;
        }
    }
}
