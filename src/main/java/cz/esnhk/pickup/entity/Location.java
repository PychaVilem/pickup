package cz.esnhk.pickup.entity;
import jakarta.persistence.*;


@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String description;
    private int tripDurationMinutes;

    public Location(String name, String address, String city, String description) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.description = description;
    }
    protected Location() {}

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

