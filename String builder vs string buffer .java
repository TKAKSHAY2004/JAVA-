class string {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer);
        System.out.println(buffer.capacity());
        long start = System.currentTimeMillis();
        for(int i=0 ; i<10000 ; i++){
            buffer.append("World");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end-start));
        
        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder);
        System.out.println(builder.capacity());
        for(int i=0 ; i<10000 ; i++){
            buffer.append("World");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime-start));
    }
}

/* output:
Hello 
22
Time taken : 2
Hello 
22
Time taken : 73

=== Code Execution Successful ===
  */

/*
The primary differences between StringBuilder and StringBuffer in Java revolve around synchronization, performance, and usage scenarios. Here's a detailed comparison:

Synchronization
StringBuffer: Methods in StringBuffer are synchronized, which means they are thread-safe. Multiple threads can access a StringBuffer instance without running into concurrency issues.
This makes StringBuffer suitable for use in a multi-threaded environment.
StringBuilder: Methods in StringBuilder are not synchronized, meaning it is not thread-safe. StringBuilder should be used when thread safety is not a concern, 
as its operations are faster due to the lack of synchronization overhead.

  
Performance
StringBuffer: Due to synchronization, StringBuffer operations are slower compared to StringBuilder.
StringBuilder: Because it is not synchronized, StringBuilder is faster and more efficient for most single-threaded operations.

  
  Usage Scenarios
StringBuffer: Use StringBuffer when working in a multi-threaded environment where multiple threads might access and modify the same StringBuffer instance.
StringBuilder: Use StringBuilder in a single-threaded environment or when you are sure that the instance will not be accessed by multiple threads simultaneously.
  */
