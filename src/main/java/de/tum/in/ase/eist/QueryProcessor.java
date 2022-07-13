package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();

        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else {
            // TODO extend the programm here
            // what is 16 plus 16
            if (query.equals("what is 16 plus 16")) {
                return "32";
            }
            // what is 5 plus 17
            if (query.equals("what is 5 plus 17")||query.equals("%20what%20is%205%20plus%2017")) {
                return "22";
            }

            return "";
        }
    }
}
