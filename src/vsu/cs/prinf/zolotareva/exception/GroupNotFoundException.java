package vsu.cs.prinf.zolotareva.exception;

import java.util.UUID;

public class GroupNotFoundException extends BusinessException{
    public GroupNotFoundException(UUID id){
        super("Группа не найдена" + id);
    }
}
