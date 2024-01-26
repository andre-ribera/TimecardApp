package com.timecardapp.TimecardApp.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class TimeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne()
    @JoinColumn(name = "person_id")
    private Person person;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private Time hoursWorked;
    private float totalHours;
    @Column(nullable = false)
    private String notes;

    public TimeCard(){
        //TODO: populate with default values

    }

    public TimeCard(int id, Person person, Date date, Time hoursWorked, float totalHours, String notes) {
        this.id = id;
        this.person = person;
        this.date = date;
        this.hoursWorked = hoursWorked;
        this.totalHours = totalHours;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Time getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Time hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //TODO: create methods that sum the hours worked for the day, week, month (note: the hoursWorked field is Time not float)
    public float getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(float totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        //TODO: Customize toString
        return "Timecard{" +
                "id=" + id +
                ", date=" + date +
                ", hoursWorked=" + hoursWorked +
                ", totalHours=" + totalHours +
                ", notes='" + notes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeCard timecard = (TimeCard) o;
        return id == timecard.id && Objects.equals(date, timecard.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }
}
