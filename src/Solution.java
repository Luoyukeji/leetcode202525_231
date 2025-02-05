public class Solution {

    public boolean isPowerOfTwo(int n) {

        //首先 幂大于0，并且 n 与 n - 1 的按位与运算结果应该是 0。
        //8            7
        //1000          0111
        return n > 0 && (n & (n - 1)) == 0;
    }

}
