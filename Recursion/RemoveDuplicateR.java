class RemoveDuplicateR {

    public static boolean[] map = new boolean[26];

    public static void RemoveDup(String str, String newStr, int idx) {
        char currChar = str.charAt(idx);

        if (idx == str.length() - 1) {
            if (map[currChar - 'a']) {
                System.out.println(newStr);
            } else {
                map[currChar - 'a'] = true;
                newStr += currChar;
                System.out.println(newStr);
            }
            return;
        }

        if (map[currChar - 'a']) {
            RemoveDup(str, newStr, idx + 1);
        } else {
            map[currChar - 'a'] = true;
            newStr += currChar;
            RemoveDup(str, newStr, idx + 1);
        }

    }

    public static void main(String[] args) {
        RemoveDup("aaabaaaccccdeaaafbbbbgccc", "", 0);
    }
}