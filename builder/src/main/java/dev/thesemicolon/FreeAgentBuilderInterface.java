package dev.thesemicolon;

public interface FreeAgentBuilderInterface {
    FreeAgentBuilderInterface withName(String name);

    FreeAgentBuilderInterface withAge(int age);

    FreeAgentBuilderInterface withPosition(String position);

    Player build();
}
