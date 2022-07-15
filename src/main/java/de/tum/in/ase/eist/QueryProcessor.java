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
           return "SUPER_TUTORIUM";
        } else if (query.contains("Joe Biden")) {
            return "President of America";
        } else if (query.contains("Elon Musk")) {
            return "Elon Musk a business magnate and investor" + "the founder, CEO, and Chief Engineer at SpaceX" +
                    "angel investor, CEO, and Product Architect of Tesla, Inc." + "founder of The Boring Company" +
                    "co-founder of Neuralink and OpenAI" ;
        } else if (query.contains("apple")) {
            return "fruit";
            
        } else { // TODO extend the programm here
            return "";
        }
    }
}
