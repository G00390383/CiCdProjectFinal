package ie.atu.project.CiCd.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.print.DocFlavor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Document(collection = "User")

public class User {
    private String name;
    private String ppsn_no;
    private int credit_score;
    public User(String name,String ppsn_no,int credit_score) {
        set_name(name);
        set_ppsn(ppsn_no);
        set_credit_score(credit_score);

    }

    public void set_credit_score(int credit_score) {
        if((300 <= credit_score ) && (credit_score <= 850)) {
            this.credit_score = credit_score;
        }
        else{
            throw new IllegalArgumentException("Credit score can only be between 300 and 850");
        }
    }

    public void set_ppsn(String ppsn_no) {
        if(ppsn_no.length() >9 || ppsn_no.length()<8) {
            throw new IllegalArgumentException("PPSN number must be 8 or 9 characters long");
        }
        else if(Character.isDigit(ppsn_no.charAt(ppsn_no.length()-1))) {
            throw new IllegalArgumentException("PPSN number must end with 1 or 2 characters");

        }
        else
        {
            this.ppsn_no = ppsn_no;
        }
    }

    public void set_name(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be 3 characters or longer");
        }
    }

    public String get_name(){
        return this.name;
    }

    public int get_credit_score() {
        return this.credit_score;
    }

    public String get_ppsn() { return this.ppsn_no;
    }
}
