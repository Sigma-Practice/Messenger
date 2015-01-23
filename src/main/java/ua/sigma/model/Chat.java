package ua.sigma.model;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.AccessType.FIELD;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by vlad on 23.01.15.
 */
@Entity
@Access(FIELD)
public class Chat {
    @GeneratedValue(strategy = IDENTITY)
    @Id int id;
    String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Topic topic;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chat")
    Set<Message> messages=new HashSet<Message>(0);

    public Chat() {
    }

    public Chat(String name, Topic topic) {
        this.name = name;
        this.topic = topic;
    }
}
