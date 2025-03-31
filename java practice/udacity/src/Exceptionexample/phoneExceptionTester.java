package Exceptionexample;

public class phoneExceptionTester {
    public static void main(String[] args) {    
        String[] numbers = new String[]{"123-435", null, "31413", "31413"};
        for(int i=0; i<numbers.length;i++){
            try{
                System.err.println(new Phone("iphone", numbers[i]));
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }
}
