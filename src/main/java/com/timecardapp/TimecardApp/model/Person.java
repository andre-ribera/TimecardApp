package com.timecardapp.TimecardApp.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private ArrayList<TimeCard> timeCards;
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(int id, ArrayList<TimeCard> timeCards, String firstName, String lastName) {
        this.id = id;
        this.timeCards = timeCards;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<TimeCard> getTimeCards() {
        return timeCards;
    }

    public void seTimeCards(ArrayList<TimeCard> timeCards) {
        this.timeCards = timeCards;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
