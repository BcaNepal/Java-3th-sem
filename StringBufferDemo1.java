public class StringBufferDemo1{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(2);
        System.out.println(sb.capacity());
        sb.append("ram");
        System.out.println(sb.capacity());
        sb.append("whariram");
        System.out.println(sb.capacity());
    }
}