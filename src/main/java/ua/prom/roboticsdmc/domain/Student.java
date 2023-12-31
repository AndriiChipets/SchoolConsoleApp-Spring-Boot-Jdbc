package ua.prom.roboticsdmc.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@SuperBuilder(setterPrefix = "with")
public class Student extends User {

    private final Integer groupId;

    public abstract static class ChildBuilder<C extends Student, B extends StudentBuilder<C, B>>
            extends UserBuilder<C, B> {

    }
}
