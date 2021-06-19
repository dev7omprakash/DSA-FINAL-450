public class minimumOperatioGFG {
    public static void main(String[] args) {

        int N = 11;
        System.out.println(minOpr(N)); //
        // 0 1 2 3 4 5 6 7 8 9 10 11
        // 0>1>2>4>5>10>11

    }

    // Given a number N and you have to move form 0 to N in minimum operation.
    // and the operation given are either you can move 1 step or you can double your
    // step
    // depending on at which position you are.

    static int minOpr(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        if (N % 2 == 0) {
            return minOpr(N / 2) + 1;
        }
        return minOpr(N - 1) + 1;
    }
}
