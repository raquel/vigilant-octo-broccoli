package com.concretesolutions.model;

import javax.persistence.*;

/**
 * Created by raquel on 8/26/16.
 */
@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phone_id")
    private Long id;

    @Column(name = "number")
    private Long number;

    @Column(name = "ddd")
    private Long ddd;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Phone(){}

    public Phone(Long number, Long ddd, User user) {
        this.number = number;
        this.ddd = ddd;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public Long getNumber() {
        return number;
    }

    public Long getDdd() {
        return ddd;
    }

    public User getUser() {
        return user;
    }
}
