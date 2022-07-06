package method;

public class DeleteByIndex {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6};
        int a1[] = deleteByIndex(a, 2);
        for (int a2:a1
             ) {
            System.out.println(a2);
        }
    }

    public static int[] deleteByIndex(int arr[], int index){
        int n = arr.length;
        //b1: taọ mới 1 mảng có kích thước nhỏ hơn mảng truyền vào
        int newArr[] = new int[n-1];
        //b2: sao chép lần lượt các phần tử
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < n-1; i++) {
            newArr[i] = arr[i+1];
        }
        return newArr;
    }
}
