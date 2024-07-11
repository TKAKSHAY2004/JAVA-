class HelloWorld {
    public static void main(String[] args) {
        String name[] = {"Lohit","Yeshwin","Jayadeep","Sarah","Abishake","Jayashree","Yeshu"};
        for(String names : name){
            System.out.print(names + "\t");
        }
        System.out.println("\n");
        for(int i=0 ; i<name.length ; i++){
            System.out.print( name[i] + "\t");
        }
        System.out.println("\n");
        for(int i=name.length-1 ; i>=0 ; i--){
            System.out.print(name[i] + "\t");
        }
    }
}

/*
Lohit	Yeshwin	Jayadeep	Sarah	Abishake	Jayashree	Yeshu	

Lohit	Yeshwin	Jayadeep	Sarah	Abishake	Jayashree	Yeshu	

Yeshu	Jayashree	Abishake	Sarah	Jayadeep	Yeshwin	Lohit	
*/
