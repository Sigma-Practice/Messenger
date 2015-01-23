package ua.sigma.model;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.AccessType.FIELD;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by vlad on 24.01.15.
 */
@Entity
@Access(FIELD)
public class Message {
    @GeneratedValue(strategy = IDENTITY)
    @Id int id;
    String text;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Chat chat;
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    public Message() {
    }

    public Message(String text, Chat chat, User user) {
        this.text = text;
        this.chat = chat;
        this.user = user;
    }
}
