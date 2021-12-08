package de.kugel.trainingservice.training;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
@Table(name = "trainings")
public class Training{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private final Date trainingDate;
    private final RequestState requestState;
    private final Type type;
    private final Integer trainingMinutes;
    private final Integer horseId;
    private final Integer trainerId;
    private final Double price;
    private final boolean payed;

    public static enum Type {
        Jumping,
        Dressage
    }

    public static enum RequestState {
        Requested,
        Accepted,
        Denied,
        RequestAlternativeDate,
        Canceled
    }
}
