package cz.esnhk.pickup.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;


    private LocalDateTime availabilityFrom;
    private LocalDateTime availabilityTo;

    private String note;

    public Availability(Member member, LocalDateTime from, LocalDateTime to, String note) {
    }

    protected Availability() {}

    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public LocalDateTime getAvailabilityFrom() {
        return availabilityFrom;
    }

    public LocalDateTime getAvailabilityTo() {
        return availabilityTo;
    }

    public String getNote() {
        return note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setAvailabilityFrom(LocalDateTime availabilityFrom) {
        this.availabilityFrom = availabilityFrom;
    }

    public void setAvailabilityTo(LocalDateTime availabilityTo) {
        this.availabilityTo = availabilityTo;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
