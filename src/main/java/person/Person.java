package person;

import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class Person {

    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public Person(String id, String lastName, String firstName, String middleName,
                  Physical phys, Appearance appearance, Phone phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(lastName).append(" ").append(firstName).append(" ").append(middleName).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n")
                .append(phone);
        return sb.toString();
    }
}
