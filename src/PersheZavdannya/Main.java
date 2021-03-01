package PersheZavdannya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Savtsi savtsi = new Savtsi();
        Ryby ryby = new Ryby();
        Zebra zebra = new Zebra();
        Kenguru kenguru = new Kenguru();
        Akula akula =new Akula();
        Karas karas = new Karas();

        Zebra zebra1 =new Zebra("Savtsi","Savana-Africa",40,false,"Dimon");
        Kenguru kenguru1 = new Kenguru("Savtsi","Savana-Australia",25,true,"Igor");
        Akula akula1 = new Akula("Ryby","Okeans-All",50,"SolenaVoda","Anya");
        Karas karas1 = new Karas("Ryby","Ozera",10,"PrisnaVoda","Taras");
        Animal[] animals =new Animal[4];
        animals[0]=zebra1;
        animals[1]=kenguru1;
        animals[2]=akula1;
        animals[3]=karas1;
        System.out.println(Arrays.toString(animals));
    }
}
