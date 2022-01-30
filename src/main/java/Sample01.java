import java.util.Arrays;

public class Sample01 {
    public static void main(String[] args) {
        int[] Array01 = new int[]{1,3,6,7,8,4,0,3};
        returnNewArray(Array01);
    }

    public static int [] returnNewArray (int[] Array) {
        String str = Arrays.toString(Array);
        System.out.println(str);
        int index = 0;
        for (int i = 0; i < Array.length; i++)
            if (Array[i] == 4)
                index = i;
            if (Array[index] !=4 )
                throw new RuntimeException();
        int [] newArr = Arrays.copyOfRange(Array, index + 1, Array.length);
        String newStr = Arrays.toString(newArr);
        System.out.println(newStr);
        return newArr;
    }

}
