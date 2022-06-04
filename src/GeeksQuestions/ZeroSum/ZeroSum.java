package GeeksQuestions.ZeroSum;

public class ZeroSum {
    static void findZeroSum(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    if (data[i] + data[j] + data[k] == 0) {
                        System.out.println("Index : " + "{" + i + "," + j + "," + k + "}");
                        System.out.println("{" + data[i] + "," + data[j] + "," + data[k] + "}");
                    }}}}}

    public static void main(String[] args) {
        int[] data = {1, 2, 1, -2, -4, -2, 2};
        findZeroSum(data);

    }
}
