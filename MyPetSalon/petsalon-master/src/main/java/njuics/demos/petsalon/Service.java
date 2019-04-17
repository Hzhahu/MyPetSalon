package njuics.demos.petsalon;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

enum ServiceCategory{shower,shearing,fosterage};
@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Date date;
    private Double fee;
    private ServiceCategory category;
    public Service(){
    }
    public void setDate(Date date){
        this.date=date;
    }
    public void setFee(Double fee){
        this.fee=fee;
    }
    public void setCategory(ServiceCategory category){
        this.category=category;
    }
    /*public void print(){
        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance
                (DateFormat.MEDIUM,DateFormat.MEDIUM);
        System.out.print(mediumDateFormat.format(date)+" ");
        System.out.print("$"+fee+" ");
        if(this.category==ServiceCategory.shower)
            System.out.println("shower");
        else if(this.category==ServiceCategory.shearing)
            System.out.println("shearing");
        else
            System.out.println("fosterage");
    }*/
}
