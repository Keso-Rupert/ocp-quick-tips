package enums;

import java.util.List;

public class EnumExample {

    /* Enum is short for enumerated type. Simply put it is a sort of object that only has a finite set of values.
    For example colors, days of the week, seasons. In this example we'll use "Status", as in the status of a
    user of a chat program of some sorts*/

    /* Enums, behind the scenes, mainly have static members (like the values() method).
     The enum values are like static final constants; they will be initialized by the JVM only once,
     so each reference to the enum value is the same static object */

    public static void main(String[] args) {
        System.out.println(Status.ONLINE);
//        Status status = Status.ONLINE;
//        if(status == Status.ONLINE) {
//            System.out.println("It's true!");
//        }

        // You can see all enum values by using the values() method:
        for (Status status : Status.values()) {
            // Each enum value has a name..
            System.out.println(status.name());
            // ..and a ordinal (position within the enum)
            System.out.println(status.ordinal());
        }

        //.. or use functional programming:
        List.of(Status.values()).stream()
                .forEach(System.out::println);

        // Retrieve enum from String with valueOf()
        System.out.println(Status.valueOf("BUSY"));

        // Usage of enums in switch statements: note that only the value is used, the enum (Status) itself is implicit:
        Status busyStatus = Status.BUSY;
        switch(busyStatus) {
            case ONLINE:
                System.out.println("user is online");
                break;
            case BUSY:
                System.out.println("user is busy");
                break;
            default:
                System.out.println("user is doing something else");
        }

        StatusWithConstructor.ONLINE.printStatusMessage();
        System.out.println(StatusWithConstructor.ONLINE.getColor());
        System.out.println(StatusWithConstructor.BUSY.getColor());
    }
}

// An enum uses the keyword 'enum' instead of 'class' or 'interface
enum Status {
    // After the curly braces, all valid types for that enum are listed, comma separated, semicolon not required at the end
    ONLINE,
    BUSY,
    AWAY,
    OFFLINE
}

// Enums can contain constructors fields and methods
enum StatusWithConstructor {
    ONLINE(0) {
        String getColor() {return "green";}
    },
    BUSY(1),
    AWAY(2),
    OFFLINE(3){
        String getColor() {return "grey";}
    };

    int status;

    StatusWithConstructor(int status){
        this.status = status;
    }

    void printStatusMessage() {
        System.out.println("User is currently " + this);
    }

    String getColor() {return "red";};
}