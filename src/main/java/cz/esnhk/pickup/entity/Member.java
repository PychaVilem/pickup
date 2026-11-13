package cz.esnhk.pickup.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String notes;
    private boolean active;
    private boolean firstPickup;
    private String email;
    private String phone;
    private String bankNumber;
    @OneToMany(mappedBy = "member")
    private List<Availability> availabilities = new ArrayList<>();
    @ManyToMany(mappedBy = "members")
    private List<Trip> trips = new ArrayList<>();
    private int capacity;
    @ManyToMany
    private Set<Location> preferedLocation = new HashSet<>();

    protected Member() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNotes() {
        return notes;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isFirstPickup() {
        return firstPickup;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public List<Availability> getAvailabilities() {
        return availabilities;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public int getCapacity() {
        return capacity;
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

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setFirstPickup(boolean firstPickup) {
        this.firstPickup = firstPickup;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
