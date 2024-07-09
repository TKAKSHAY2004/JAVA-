class hello{
    public static void main(String[] args){
        String str1 = "Hello";
        System.out.println(str1);
        
        String str2 = new String(" World");
        System.out.println(str2);
        
        String str3 = str1 + str2;
        System.out.println(str3);
        
        //operation
        System.out.println(str1.trim());
        System.out.println(str3.length());
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(2,7));
        System.out.println(str2.charAt(3));
        System.out.println(str1.equals(str2));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
    }
}
