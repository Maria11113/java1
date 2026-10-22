package vsu.cs.prinf.zolotareva.model;

import java.util.UUID;

public record Group (
    UUID id,
    int courseNumber,
    int groupNumber
){}
