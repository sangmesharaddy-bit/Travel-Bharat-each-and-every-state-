package com.travelbharat.destination;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "destinations", indexes = {
    @Index(name = "idx_destination_state", columnList = "stateName"),
    @Index(name = "idx_destination_region", columnList = "region")
})
public class Destination {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 140)
    private String name;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String stateName;

    @Column(length = 30)
    private String region;

    @Column(length = 40)
    private String category;

    @Column(length = 1200)
    private String description;

    @Column(length = 600)
    private String imageUrl;

    protected Destination() {}

    public Destination(String name, String stateName, String region, String category,
                       String description, String imageUrl) {
        this.name = name; this.stateName = stateName; this.region = region;
        this.category = category; this.description = description; this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getStateName() { return stateName; }
    public String getRegion() { return region; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }
}
