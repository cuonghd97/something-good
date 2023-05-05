package dev.thesemicolon;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {
    private String name;
    private int age;
    private String nationality;
    private String position;
    private String team;
    private String stat;


    Player(Player player) {
        this.name = player.getName();
        this.age = player.getAge();
        this.nationality = player.getNationality();
        this.position = player.getPosition();
        this.team = player.getTeam();
        this.stat = player.getStat();
    }
    public Player withName(String name) {
        this.name = name;
        return this;
    }

    public Player withAge(int age) {
        this.age = age;
        return this;
    }

    public Player withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Player withPosition(String position) {
        this.position = position;
        return this;
    }

    public Player withTeam(String team) {
        this.team = team;
        return this;
    }

    public Player withStat(String stat) {
        this.stat = stat;
        return this;
    }

    public Player build() {
        return new Player(this);
    }
}
