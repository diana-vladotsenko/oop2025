package ee.dianaV.online.entity;
//jakarta.persistance
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//teeme andmebaasi tabelid automaatselt, mis on klassi nimega ehk Hibernate
//plugin File - Setting - Pluggins- JPA Buddy(teeb automaatselt andmetabeleid, ei pea kasutama sql lauseid, nagu "insert into jne")


//Javas eristatakse primaarväärtuseid:
//boolean
//String - koosneb charrist, Stringis saab olla funktsioonid
//char

//Numbrid
//Long - suur väärtus
//int , mis koosneb 2.1milj numbritest
//chort - 128 numbrit
//byte - 32 numbrit

//float - kaheksa kohta
//double - 16 kohta
@Entity
@Setter //encapsulation (paneme kõik privatsesse)
@Getter
public class Product {
    @Id
    //hakkame genereerima id-d
    //auto - ise andmebaas hakkab genereerima, mis on tüütu
    //sequence - ise paigutad millest alustab (nt 100st)
    //table - unikaalsed numbrid
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Teeme andmebaasi tabeli:
    private Long id; //int, pigem pannakse Long, kui int, selle poolest et Javas eristatakse väärtused
    //Lombok, (Setter, Getter)
    private String name;
    private double price;
    private String image; // .jpg - teeme pärast
    private boolean active;


}