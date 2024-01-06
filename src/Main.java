public class Main {
    public static void main(String[] args) {
        String result = "";
        String[] arr = {"2", "5", "8", "2", "3", "1", "5", "4", "7"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        arr[j] = null;
                    }
                }
                result += arr[i];
            }
        }
        System.out.println(result);
    }
}