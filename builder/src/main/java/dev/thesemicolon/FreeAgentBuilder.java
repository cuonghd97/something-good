package dev.thesemicolon;

public class FreeAgentBuilder implements FreeAgentBuilderInterface {
    private String name;
    private int age;
    private String position;

    @Override
    public FreeAgentBuilderInterface withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public FreeAgentBuilderInterface withAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public FreeAgentBuilderInterface withPosition(String position) {
        this.position = position;
        return this;
    }

    @Override
    public Player build() {
        return new Player();
    }
}
