package Utils;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Region extends Thread{
    private String nombre;
    private int n;
    private List<Pais>InfoCSV;
    public List<Pais>PaisesRegion;
    double v=0,w=0,x=0,y=0,z=0,mayorPer=0,mayorGe=0;

    public Region(String nombre) {
        this.nombre = nombre;
        this.InfoCSV = new ArrayList<>();
        this.PaisesRegion = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Pais> getPaisesRegion() {
        return PaisesRegion;
    }

    public void setPaisesRegion(List<Pais> paisesRegion) {
        PaisesRegion = paisesRegion;
    }

    public List<Pais> getInfoCSV() {
        return InfoCSV;
    }

    public void setInfoCSV(List<Pais> infoCSV) {
        InfoCSV = infoCSV;
    }

    public void Calculos (){
        System.out.println("Calculos de la Region: " + nombre);

        /*

        try{
            CsvReader leerPais = new CsvReader("C:\\Users\\jcfun\\IdeaProjects\\ProyectoCSV\\Complementos\\world-happiness-report-2021.CSV");
            leerPais.readHeaders();

            while (leerPais.readRecord()){
                String Country_name = leerPais.get(0);

                String Regional_indicator = leerPais.get(1);

                String Social_support = leerPais.get(7);
                double SocialS = Double.parseDouble(Social_support);

                String Healthy_life_expectancy = leerPais.get(8);
                double Healthy = Double.parseDouble(Healthy_life_expectancy);

                String Freedom_to_make_life_choices = leerPais.get(9);
                double Fredom = Double.parseDouble(Freedom_to_make_life_choices);

                String Generosity = leerPais.get(10);
                double Generosi = Double.parseDouble(Generosity);

                String Perceptions_of_corruption = leerPais.get(11);
                double PerceptionC = Double.parseDouble(Perceptions_of_corruption);

                //System.out.println("Datos CSV: (" + Regional_indicator + ")");
                //System.out.println("Nombre Instancia:(" + nombre + ")\n");

                if(Regional_indicator == nombre){
                this.PaisesRegion.add(new Pais(Country_name,Regional_indicator,SocialS,Healthy,Fredom,Generosi,PerceptionC));

                    v += SocialS;
                    w += Healthy;
                    x += Fredom;
                    y += Generosi;
                    z += PerceptionC;

                    if(PerceptionC>mayorPer){
                        mayorPer = PerceptionC;
                    }

                    if(Generosi>mayorGe){
                        mayorGe = Generosi;
                    }
                }
                //this.getInfoCSV().add(new Pais(Country_name,Regional_indicator,SocialS,Healthy,Fredom,Generosi,PerceptionC));
            }
            leerPais.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        //for (Pais p: getInfoCSV()) {
        //    System.out.println(p.getCountry_name() + " " + p.getRegional_indicator());
        //}

        //SALIDA DE VALORES

        System.out.println("Promedio de Social support: " + (v/ PaisesRegion.size()) );
        System.out.println("Promedio de Healthy life expectancy: " + (w/ PaisesRegion.size()));
        System.out.println("Promedio de Freedom to make life choices: " + (x/ PaisesRegion.size()));
        System.out.println("Promedio de Generosity: " + (y/ PaisesRegion.size()));
        System.out.println("Promedio de Perceptions of corruption: " + (z/ PaisesRegion.size()));

        for (Pais t: this.PaisesRegion) {
          if (t.getPerceptions_of_corruption()==mayorPer){
             System.out.println("País con la más alta percepción de corrupción: " + t.getCountry_name());
          }

          if (t.getGenerosity() == mayorGe){
                System.out.println("País con la mas alta generosidad: " + t.getCountry_name());
          }
        }

        */



        //DEMOSTRACION DE LOS METODOS (Si la parte de igualacion funciona, esta parte no se ocuparia) -------------------------------------------------------------

        this.PaisesRegion.add(new Pais("Finland","Western Europe",0.954,72.000,0.949,11.32,0.186));
        this.PaisesRegion.add(new Pais("Denmark","Western Europe",0.954,72.700,0.946,0.030,0.179));
        this.PaisesRegion.add(new Pais("Netherlands","Western Europe",0.942,72.400,0.913,0.175,0.338));
        this.PaisesRegion.add(new Pais("Germany","Western Europe",0.903,72.500,0.875,0.011,0));
        this.PaisesRegion.add(new Pais("United Kingdom","Western Europe",0.934,72.500,0.859,0.233,0.459));

        for (Pais s: this.PaisesRegion) {
                v += s.getSocial_support();
                w += s.getHealthy_life_expectancy();
                x += s.getFreedom_to_make_life_choices();
                y += s.getGenerosity();
                z += s.getPerceptions_of_corruption();

                if(s.getPerceptions_of_corruption()>mayorPer){
                    mayorPer = s.getPerceptions_of_corruption();
                }

                if(s.getGenerosity()>mayorGe){
                 mayorGe = s.getGenerosity();
                }
        }

        for (Pais t: this.PaisesRegion) {
                if (t.getPerceptions_of_corruption()==mayorPer){
                    System.out.println("País con la más alta percepción de corrupción: " + t.getCountry_name());
                }

                if (t.getGenerosity() == mayorGe){
                    System.out.println("País con la mas alta generosidad: " + t.getCountry_name());
                }
        }

        System.out.println("Promedio de Social support: " + (v/ PaisesRegion.size()));
        System.out.println("Promedio de Healthy life expectancy: " + (w/ PaisesRegion.size()));
        System.out.println("Promedio de Freedom to make life choices: " + (x/ PaisesRegion.size()));
        System.out.println("Promedio de Generosity: " + (y/ PaisesRegion.size()));
        System.out.println("Promedio de Perceptions of corruption: " + (z/ PaisesRegion.size()));

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println();
    }

    @Override
    public void run(){
        if(n<= getPaisesRegion().size()){
            for (int i=0;i<n;i++) {
                System.out.println("Country name: "+PaisesRegion.get(i).getCountry_name() + "\nSocial support: "+(PaisesRegion.get(i).getSocial_support()-(v/ PaisesRegion.size()))
                    + "\nHealthy life expectancy: " +(PaisesRegion.get(i).getHealthy_life_expectancy()-(w/ PaisesRegion.size())) + "\nFreedom to make life choices: " + (PaisesRegion.get(i).getFreedom_to_make_life_choices()-(x/ PaisesRegion.size()))
                    + "\nGenerosity: " +(PaisesRegion.get(i).getGenerosity()-(y/ PaisesRegion.size())) +  "\nPerceptions of corruption: " + (PaisesRegion.get(i).getPerceptions_of_corruption()-(z/ PaisesRegion.size())));
                System.out.println();
            }
        }else{
            System.out.println("La region no cuenta con esa cantidad de paises");
        }
    }


}
