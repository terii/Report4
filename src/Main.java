
public class Main {
        public static void main(String[] args){
            try {
                String str ="3．14";
                double value;
                value=Double.parseDouble(str);
                System.out.println(value);
            }catch(NullPointerException e){
                System.err.println("NullPointerException error "+e.getMessage());
            }catch(NumberFormatException e){
                System.err.println("NumberFormatException error "+e.getMessage());
            }
        }
    }
