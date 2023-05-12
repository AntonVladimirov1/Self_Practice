package day38_Exception_Handling;

public class BreakTimeException extends RuntimeException{

public BreakTimeException(){
    super("It's a break time");
}
public BreakTimeException(String message){
    super(message);
}

}
