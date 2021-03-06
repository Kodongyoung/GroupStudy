package Class20210112;

public class DobleArrayTest {
    public static void main(String[] args) {
        //int[][] arr = new int[][];
        int[][] arr = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("new를 통해 Heap에 할당하기");

        int[][] mat = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = (i+1) * (j +1);
                System.out.printf("%2d", mat[i][j]);
            }
            System.out.println("");
    }
}
}
//연습문제 1
//위의 이중 배열을 클래스를 통해 초기화 하도록 프로그래밍 해보자
//ex) DubleArray(3, 3) 형식으로 동작하고
//    printArray() 를 통해 결과를 확인하도록 한다.
