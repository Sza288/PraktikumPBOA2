package Pertemuan10;

/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : Person.java
* Deskripsi : Person database model
*/
public class Person {
    //Atribut
    private int id ;
    private String name ;
    
    //konstruktor 
    public Person(String n){
        name = n ;
    }
    public Person (int i,String n){
        id = i;
        name = n ;
    }
    
    public int getId(){
        return id ; 
    }
    
    public String getName(){
        return name;
    }
}
