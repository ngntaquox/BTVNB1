public class SecondProgram {

    public static void main(String[] args) {
        int arr[] = {1,6,28,0,4};


        for (int i=0;i< arr.length; i++)
        {
            int mark = CheckPerfect(arr[i]);
            if( mark == 1 )
            {System.out.printf("%d ",arr[i]);}

        }


    }
    public static int CheckPerfect(int x)
    { if(x==0){return 0;}
        else {
        int cnt = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                cnt = i + cnt;
            }

        }
        if (cnt == x) {
            return 1;
        } else {
            return 0;
        }
    }
    }
}
