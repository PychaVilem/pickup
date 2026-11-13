package cz.esnhk.pickup.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Member> members = new ArrayList<>();
    private LocalDateTime pickupTime;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "trip")
    private List<Student> students = new ArrayList<>();

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addMember(Member member) {
        this.members.add(member);
        member.getTrips().add(this);
    }
    public void removeMember(Member member) {
        this.members.remove(member);
        member.getTrips().remove(this);

    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    protected Trip() {}
}
