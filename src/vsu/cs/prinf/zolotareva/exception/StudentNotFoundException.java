package vsu.cs.prinf.zolotareva.exception;

import java.util.UUID;

public class StudentNotFoundException extends BusinessException{
    public StudentNotFoundException(UUID id){
        super("Студент не найден" + id);
    }
}
