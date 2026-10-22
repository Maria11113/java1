package vsu.cs.prinf.zolotareva.exception;

public class EmptyNameException extends BusinessException{
    public EmptyNameException(){
        super("Имя или фамилия студента не могут быть пустыми");
    }
}
