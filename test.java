class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        fizzBuzz(3);
    }
       public static void fizzBuzz(int n) {
    // Write your code here
    for(int i=1; i<=n; i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        }else if(i%3==0 && i%5!=0){
            System.out.println("Fizz");
        }else if(i%3!=0 && i%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
    }
    //return;
    }
}