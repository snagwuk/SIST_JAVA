package ch05;

public class ArrayCreate
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        final int SIZE = 5;
        char[] arr = new char[9];
        String origin = "";

        boolean flag = true;    // 랜덤값 생성을 정지시키는 boolean
        boolean overlap; // 기존에 있는 숫자인지 확인하는 boolean

        for(int i = 0 ; i < SIZE; i++)
        {
            if (i == 0)
            {
                origin = Integer.toString((int)((Math.random() * 10)))  + origin;
            }
            else
            {
               while(flag)
               {
                   overlap = true;
                   String tmp = Integer.toString((int)((Math.random() * 10)));

                   for(int j = 0; j < origin.length() ; j++)
                   {
                       if(origin.charAt(j) == tmp.charAt(0))    //이미 존재하는 숫자이므로 for문 종료 후 다시 while문
                       {
                           overlap = false;
                           break;
                       }
                   }
                   if(overlap)                                  // 중복되지 않으므로 해당 숫자 String에 더함
                   {
                       flag = false;
                       origin = origin + tmp;
                       //
                   }
               }
               flag = true;
            }
        }
        System.out.println( origin);
        int j = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(i %2 == 1)
                j++;
            arr[i] = origin.charAt(j);


        }
        for (int i = 0; i < 1000; i++)
        {
            int f = (int) (Math.random() * 9);
            int t = (int) (Math.random() * 9);

            char tmp = arr[f];
            arr[f] = arr[t];
            arr[t] = tmp;
        }
        for(char x : arr)
            System.out.print(x + ",");

    }

}
