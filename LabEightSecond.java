public class LabEightSecond{
    public static void main(String[] args){
        try{
            int x = Integer.parseInt(args[0]);
            if(x<0){
                throw new NegativeNoException();
            }
            else if(x%10==0){
                throw new NumberDivisibleByTen();
            }
            else if(x>1000 && x<2000){
                throw new NumberGreaterThanOneThousand();
            }
            else if(x>7000){
                throw new NumberGreaterThanSevenThousand();
            }
            else{
                System.out.println("Entered number is: "+x);
            }
        }catch(NegativeNoException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(NumberDivisibleByTen e){
            System.out.println("Error: "+e.getMessage());
        }c
        catch(NumberGreaterThanOneThousand e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(NumberGreaterThanSevenThousand e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
class NegativeNoException extends Exception{
    public NegativeNoException(){
        super("Negative number not allowed!");
    }
}
class NumberDivisibleByTen extends Exception{
    public NumberDivisibleByTen(){
        super("Number is evenly divisible by 10!");
    }
}
class NumberGreaterThanOneThousand extends Exception{
    public NumberGreaterThanOneThousand(){
        super("Entered Numbered is between 1000 And 2000!");
    }
}
class NumberGreaterThanSevenThousand extends Exception{
    public NumberGreaterThanSevenThousand(){
        super("Entered Numbered is greater than 7000!");
    }
}