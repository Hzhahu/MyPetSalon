package njuics.demos.petsalon;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
enum Pettype{dog,cat};

@Data
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Pettype type;
    public ArrayList<Service> services;
    public Pet(){
        this.services=new ArrayList<Service>();
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(Pettype type){
        this.type=type;
    }
   /* public void AddService(Date date, Double fee, ServiceCategory category){
        Service service=new Service(date,fee,category);
        services.add(service);
    }
    public boolean EditService(Date date,Double fee,ServiceCategory category,int index){
        if(index>=services.size()) return false;
        Service service=new Service(date,fee,category);
        services.set(index,service);
        return true;
    }
    public boolean DeleteService(int index){
        if(index>=services.size()) return false;
        services.remove(index);
        return true;
    }
    public void print(){
        System.out.print(this.name+" ");
        if(this.type==Pettype.dog)
            System.out.println("dog ");
        else
            System.out.println("cat ");
        if(this.services.size()>0){
            for(int i=0;i<this.services.size();i++)
            {
                Service service=services.get(i);
                service.print();
            }
        }
    }*/
}
