package org.example.Game.Persons;

public class AdminPerson extends StartPerson {

    public AdminPerson(int id, String userName, int score) {
        super(id, userName, score);
    }

    public int givePoint(StartPerson person, int point) {
        return person.point += point;
    }

}
