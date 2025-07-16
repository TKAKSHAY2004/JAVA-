public class StringBufferDemo {
    public static void main(String[] args) {
        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(3, 5);
        System.out.println("After delete: " + sb);

        // Delete char at
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Set char at
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // Char at
        char ch = sb.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // Length
        int len = sb.length();
        System.out.println("Length: " + len);

        // Capacity
        int cap = sb.capacity();
        System.out.println("Capacity: " + cap);

        // Ensure capacity
        sb.ensureCapacity(50);
        System.out.println("New capacity after ensureCapacity(50): " + sb.capacity());

        // Substring
        String sub = sb.substring(0, 3);
        System.out.println("Substring (0,3): " + sub);

        // To string
        String result = sb.toString();
        System.out.println("Final StringBuffer result: " + result);
    }
}


/*

After append: Hello World
After insert: Hello, World
After replace: Hi, World
After delete: HiWorld
After deleteCharAt: Hiorld
After reverse: dlroiH
After setCharAt: XlroiH
Character at index 1: l
Length: 6
Capacity: 21   // (depends on initial string & default)
New capacity after ensureCapacity(50): 50
Substring (0,3): Xlr
Final StringBuilder result: XlroiH

*/
