public class StringBufferBasics {
    public static void main(String[] args){
        StringBuffer sb = StringBuffer(str:"hello");
        sb.append(str:"world!");
        System.out.println("after append: " + sb);
        System.out.println("lenght: "+ sb.lenght());
        System.out.println("capacity: " + sb.capacity());
        System.out.println("character at index 1: " + sb.charAt(index:1));
        sb.delete(Start:5, end:11)
    }
}
