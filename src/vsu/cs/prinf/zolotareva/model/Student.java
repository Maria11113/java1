package vsu.cs.prinf.zolotareva.model;

import java.util.UUID;

public record Student (
    UUID id,
    UUID groupId,
    String lastName,
    String firstName,
    boolean task1Done,
    boolean task2Done,
    boolean task3Done
){}
