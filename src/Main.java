package src;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

public static void main(String[] args) {
        int[] arr = generateRandomArray();
    System.out.println(arr);
}
        int [] arr = generateRandomArray();
//        for (int i = 0; i < arr.length; i++)
//            if (i % 2 == 0)
//                i++;
//        System.out.println(arr);
//    }
}
