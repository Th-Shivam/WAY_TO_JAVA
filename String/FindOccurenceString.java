class FindOccurenceString {
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurence(String str, int i, int n, char key) {
        if (i == n) {
            if (str.charAt(i) == key) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }

            System.out.println("The first occurence is at : " + first);
            System.out.println("The last occurence is at : " + last);
            return;
        }

        if (str.charAt(i) == key) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        FindOccurence(str, i + 1, n, key);
    }

    public static void main(String[] args) {
        String str = "faaabbceaa";
        int n = str.length() - 1;
        char key = 'a';
        FindOccurence(str, 0, n, key);
    }
}