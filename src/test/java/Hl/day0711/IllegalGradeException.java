package Hl.day0711;
//Eger Exception Class'a excentd ederseniz Class'iniz "Compile Time Exception "olur
public class IllegalGradeException extends Exception{
    public IllegalGradeException(String message){
        super(message);
    }
}
