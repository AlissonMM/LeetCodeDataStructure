public class CountAndSay
{
    public String countAndSay(int n) {
        String answer = "1";

        for (int i = 1; i < n; i++) {
            answer = say(answer);
        }

        return answer;
    }

    public String say(String m) {
        StringBuilder saidAnswer = new StringBuilder();
        char[] chars = m.toCharArray();

        int count = 1;

        for (int j = 1; j < chars.length; j++) {
            if (chars[j] == chars[j - 1]) {
                count++;
            } else {

                saidAnswer.append(count).append(chars[j - 1]);
                count = 1;
            }
        }


        saidAnswer.append(count).append(chars[chars.length - 1]);

        return saidAnswer.toString();
    }

}
