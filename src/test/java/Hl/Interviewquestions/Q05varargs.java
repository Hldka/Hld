package Hl.Interviewquestions;

public class Q05varargs {
    public static void main(String[] args) {
        int[] arr={17,23,33,9,20,55};
      arrTopla(arr);
varargsToplaList(17,23,33,9,20,55);
varargsToplaArr(arr);



}

    private static void varargsToplaArr(int[] arr) {
int sum=0;
        for (int w:arr ) {sum+=w;

        }
        System.out.println(sum);
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4, int i5) {

    }

    private static int arrTopla(int[] arr) {

        int con=0;
        for (int w:arr) {con+=w;

        }
        return con;
    }
}
