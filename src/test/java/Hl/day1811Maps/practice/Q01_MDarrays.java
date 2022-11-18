package Hl.day1811Maps.practice;

public class Q01_MDarrays {
    /*
    {{1,2,3},{2,3},{5,5,5},{2,1,3}} int 2D arayini olusturu
    "D-Dimensional arrayinden min number print et
     */
    public static void main(String[] args) {
        int arr [][]={{1,2,3},{2,3},{5,5,5},{2,1,3}};

int min=arr[0][0];

for (int i=0;i< arr.length;i++){
    System.out.println("arr["+i+"].length i"+ arr[i].length);
    for (int j=0; j< arr[i].length;j++){
        if (arr[i][j]<min){
            System.out.println(arr[i][j]);
            min=arr[i][j];
        }
    }
    System.out.println("min= "+min);

}

    }
}
