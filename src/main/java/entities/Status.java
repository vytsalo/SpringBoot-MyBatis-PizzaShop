package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasilevvs on 17.03.2020.
 */
public enum Status {

        ACCEPTED ("Order accepted"),
        PAYMENT_WAITING ("Waiting for payment"),
        IN_TRANSIT ("Order is on the way"),
        DELIVERED("Order were delivered"),
        CLOSED ("Order is closed"),
        CANCELLED("Order is cancelled");

        private final String name;

        Status(String s) {
            name = s;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static List<String> getNames() {
            List<String> list = new ArrayList<>();
            for (Status t : values()) {
                list.add(t.getName());
            }
            return list;
        }

        public String getName() {
            return name;
        }

    }
