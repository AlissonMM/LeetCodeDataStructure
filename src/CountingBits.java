public class CountingBits {
    public int[] countBits(int n) {
        int[] responseArray = new int[n + 1];
        responseArray[0] = 0;

        for (int i = 1; i < responseArray.length; i++) {
            char[] binary = convertToBinary(i);
            int ones = 0;
            for (char a : binary) {
                if (a == '1') {
                    ones++;
                }
            }
            responseArray[i] = ones;
        }

        return responseArray;
    }

    public static char[] convertToBinary(int number) {
        String binaryString = Integer.toBinaryString(number);
        return binaryString.toCharArray();
    }
}
