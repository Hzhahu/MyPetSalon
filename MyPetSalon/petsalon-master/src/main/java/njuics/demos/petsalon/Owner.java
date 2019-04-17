package njuics.demos.petsalon;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    public ArrayList<Pet> pets;
    public Owner(){
        this.pets=new ArrayList<Pet>();
    }
    public void setName(String name){
        this.name=name;
    }
    /*public void AddPet(String name,Pettype type){
        Pet pet=new Pet(name,type);
        pets.add(pet);
    }
    public boolean EditPet(String name,Pettype type,int index){
        if(index>=pets.size())
            return false;
        Pet pet=pets.get(index);
        Pet newpet=new Pet(name,type);
        newpet.services=pet.services;
        pets.set(index,newpet);
        return true;
    }
    public boolean DeletePet(int index){
        if(index>=pets.size()) return false;
        pets.remove(index);
        return true;
    }
    public void print(){
        System.out.println(name+" ");
        if(pets.size()>0){
            for(int i=0;i<pets.size();i++) {
                Pet pet=pets.get(i);
                pet.print();
            }
        }
    }*/
}
