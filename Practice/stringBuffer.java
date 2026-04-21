public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shivam");
        System.out.println(sb);
        sb.append(" Singh");
        System.out.println(sb);
        sb.insert(0, "Mr.");
        sb.setCharAt(0, 'E');
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
