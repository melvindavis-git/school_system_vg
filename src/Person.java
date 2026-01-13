
import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Person implements Serializable {

    String firstName;
    String lastName;
    String emailAddress;
    String socialSecurityNumber;

    LocalDateTime dateCreated;

    public Person(String firstName, String lastName, String emailAddress, String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        this.socialSecurityNumber=socialSecurityNumber;
        this.dateCreated=LocalDateTime.now();
    }

    public Person(){
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
