import java.io.*;
import java.util.ArrayList;

public class Paseo {
    public static void main(String[] args) {
        Perro perrito1 = new Perro("Gusgus","Caniche","10","Santiago");
        Perro perrito2 = new Perro("Panterita","Gato","2","Santiago");
        Perro perrito3 = new Perro("Simba","Leon","100","Africa");
        Perro perrito4 = new Perro("Mufassa","Leon","100","Africa");
        Perro perrito5 = new Perro("Dora","Exploradora","100","NoSe");
        Perro perrito6 = new Perro("Mochilla","Todo","103","Dibujo");

        ArrayList<Perro> lunes=new ArrayList<Perro>();
        ArrayList<Perro> martes=new ArrayList<Perro>();
        ArrayList<Perro> miercoles=new ArrayList<Perro>();
        ArrayList<Perro> jueves=new ArrayList<Perro>();
        ArrayList<Perro> viernes=new ArrayList<Perro>();
        ArrayList<Perro> sabado=new ArrayList<Perro>();

        lunes.add(perrito1);
        lunes.add(perrito2);
        lunes.add(perrito3);
        lunes.add(perrito4);
        lunes.add(perrito5);
        lunes.add(perrito6);

        martes.add(perrito1);
        martes.add(perrito2);
        martes.add(perrito3);
        martes.add(perrito4);
        martes.add(perrito5);
        martes.add(perrito6);

        miercoles.add(perrito1);
        miercoles.add(perrito2);
        miercoles.add(perrito3);
        miercoles.add(perrito4);
        miercoles.add(perrito5);
        miercoles.add(perrito6);

        jueves.add(perrito1);
        jueves.add(perrito2);
        jueves.add(perrito3);
        jueves.add(perrito4);
        jueves.add(perrito5);
        jueves.add(perrito6);

        viernes.add(perrito1);
        viernes.add(perrito2);
        viernes.add(perrito3);
        viernes.add(perrito4);
        viernes.add(perrito5);
        viernes.add(perrito6);

        sabado.add(perrito1);
        sabado.add(perrito2);
        sabado.add(perrito3);
        sabado.add(perrito4);
        sabado.add(perrito5);
        sabado.add(perrito6);

        //cree un objeto de salido

        try {
            FileOutputStream file =new FileOutputStream("perros.dat");
            ObjectOutputStream archivo = new ObjectOutputStream(file);
            archivo.writeObject(lunes);
            archivo.writeObject(martes);
            archivo.writeObject(miercoles);
            archivo.writeObject(jueves);
            archivo.writeObject(viernes);
            archivo.writeObject(sabado);
            archivo.close();

            FileInputStream fileIn =new FileInputStream("perros.dat");
            ObjectInputStream archivoIn =new ObjectInputStream(fileIn);

            ArrayList<Perro> dia;

            for(int i=0; i<5;i++){
                System.out.println("Dia:"+ i+1);
                System.out.println("========================");
                dia= (ArrayList<Perro>) archivoIn.readObject();
                for (Perro p: dia
                     ) {
                    System.out.println(p);
                }
            }
            archivoIn.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
