package cz.esnhk.pickup.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String phonePrefix;
    private String phoneNumber;
    private String email;
    private String country;
    private String department;
    private LocalDateTime arrivalDateTime;
    private String flightNumber;
    @ManyToOne
    private Trip trip;

    protected Student() {
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
