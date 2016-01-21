/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descriptordelictivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.reflect.generics.visitor.Reifier;

/**
 *
 * @author ine031
 */
public class Generador {
    
    private String ruta;
    private File texs;
    private String trimestre;
    private int anio;
    
    public Generador(String ruta, String rutaTEX, String trimestre, int anio){
        this.ruta = ruta;
        texs = new File(rutaTEX);
        this.trimestre = trimestre;
        this.anio = anio;
    }
    
    public void run(){
        generarDescripcion("1_01");
        generarDescripcion("1_02");
        generarDescripcion("1_03");
        generarDescripcion("1_04");
        generarDescripcion("1_05");
        generarDescripcion("1_06");
        generarDescripcion("1_07");
        generarDescripcion("1_08");
        generarDescripcion("1_09");
        generarDescripcion("1_10");
        
        generarDescripcion("2_01");
        generarDescripcion("2_02");
        generarDescripcion("2_03");
        generarDescripcion("2_04");
        generarDescripcion("2_05");
        generarDescripcion("2_06");
        generarDescripcion("2_07");
        generarDescripcion("2_08");
        generarDescripcion("2_09");
        generarDescripcion("2_10");
        
        generarDescripcion("3_01");
        generarDescripcion("3_02");
        generarDescripcion("3_03");
        generarDescripcion("3_04");
        generarDescripcion("3_05");
        generarDescripcion("3_06");
        
        generarDescripcion("4_01");
        generarDescripcion("4_02");
        generarDescripcion("4_03");
        generarDescripcion("4_04");
        generarDescripcion("4_05");
        
        generarDescripcion("5_01");
        generarDescripcion("5_02");
        generarDescripcion("5_03");
        generarDescripcion("5_04");
        generarDescripcion("5_05");
        
        generarDescripcion("6_01");
        generarDescripcion("6_02");
        generarDescripcion("6_03");
        generarDescripcion("6_04");
        generarDescripcion("6_05");
        generarDescripcion("6_06");
        generarDescripcion("6_07");
        generarDescripcion("6_08");
        generarDescripcion("6_09");
        generarDescripcion("6_10");
        generarDescripcion("6_11");
        generarDescripcion("6_12");
    }

    
    
    private void generarDescripcion(String csv) {
        File seccion = new File(texs, csv);
        File des = new File(seccion, "descripcion");
        switch(csv){
            case "1_01":
                //las series históricas utilizan una lista de registros para hacer
                //su descripción; getRegistros lee el csv y retorna esa lista
                escribirTEX(des.getAbsolutePath(), des1_01(getRegistros(csv)));
                break;
            case "1_02":
                escribirTEX(des.getAbsolutePath(), des1_02(getRegistrosDepartamento(csv)));
                break;
            case "1_03":
                escribirTEX(des.getAbsolutePath(), des1_03(getRegistrosDepartamento(csv)));
                break;
            case "1_04":
                escribirTEX(des.getAbsolutePath(), des1_04(getRegistrosDepartamento(csv)));
                break;
            case "1_05":
                escribirTEX(des.getAbsolutePath(), des1_05(getRegistrosDobles(csv)));
                break;
            case "1_06":
                escribirTEX(des.getAbsolutePath(), des1_06(getRegistrosDepartamento(csv)));
                break;
            case "1_07":
                escribirTEX(des.getAbsolutePath(), des1_07(getRegistrosDepartamento(csv)));
                break;
            case "1_08":
                escribirTEX(des.getAbsolutePath(), des1_08(getRegistrosDepartamento(csv)));
                break;
            case "1_09":
                escribirTEX(des.getAbsolutePath(), des1_09(getRegistrosDepartamento(csv)));
                break;
            case "1_10":
                escribirTEX(des.getAbsolutePath(), des1_10(getRegistrosDobles(csv)));
                break;
            case "2_01":
                escribirTEX(des.getAbsolutePath(), des2_01(getRegistros(csv)));
                break;
            case "2_02":
                escribirTEX(des.getAbsolutePath(), des2_02(getRegistrosDepartamento(csv)));
                break;
            case "2_03":
                escribirTEX(des.getAbsolutePath(), des2_03(getRegistrosDepartamento(csv)));
                break;
            case "2_04":
                escribirTEX(des.getAbsolutePath(), des2_04(getRegistrosDepartamento(csv)));
                break;
            case "2_05":
                escribirTEX(des.getAbsolutePath(), des2_05(getRegistrosDobles(csv)));
                break;
            case "2_06":
                escribirTEX(des.getAbsolutePath(), des2_06(getRegistrosDepartamento(csv)));
                break;
            case "2_07":
                escribirTEX(des.getAbsolutePath(), des2_07(getRegistrosDepartamento(csv)));
                break;
            case "2_08":
                escribirTEX(des.getAbsolutePath(), des2_08(getRegistrosDepartamento(csv)));
                break;
            case "2_09":
                escribirTEX(des.getAbsolutePath(), des2_09(getRegistrosDepartamento(csv)));
                break;
            case "2_10":
                escribirTEX(des.getAbsolutePath(), des2_10(getRegistrosDobles(csv)));
                break;
            case "3_01":
                escribirTEX(des.getAbsolutePath(), des3_01(getRegistros(csv)));
                break;
            case "3_02":
                escribirTEX(des.getAbsolutePath(), des3_02(getRegistrosDepartamento(csv)));
                break;
            case "3_03":
                escribirTEX(des.getAbsolutePath(), des3_03(getRegistrosDepartamento(csv)));
                break;
            case "3_04":
                escribirTEX(des.getAbsolutePath(), des3_04(getRegistrosDepartamento(csv)));
                break;
            case "3_05":
                escribirTEX(des.getAbsolutePath(), des3_05(getRegistrosDepartamento(csv)));
                break;
            case "3_06":
                escribirTEX(des.getAbsolutePath(), des3_06(getRegistrosDobles(csv)));
                break;
            case "4_01":
                escribirTEX(des.getAbsolutePath(), des4_01(getRegistros(csv)));
                break;
            case "4_02":
                escribirTEX(des.getAbsolutePath(), des4_02(getRegistrosDepartamento(csv)));
                break;
            case "4_03":
                escribirTEX(des.getAbsolutePath(), des4_03(getRegistrosDepartamento(csv)));
                break;
            case "4_04":
                escribirTEX(des.getAbsolutePath(), des4_04(getRegistrosDepartamento(csv)));
                break;
            case "4_05":
                escribirTEX(des.getAbsolutePath(), des4_05(getRegistrosDobles(csv)));
                break;
            case "5_01":
                escribirTEX(des.getAbsolutePath(), des5_01(getRegistros(csv)));
                break;
            case "5_02":
                escribirTEX(des.getAbsolutePath(), des5_02(getRegistrosDepartamento(csv)));
                break;
            case "5_03":
                escribirTEX(des.getAbsolutePath(), des5_03(getRegistrosDepartamento(csv)));
                break;
            case "5_04":
                escribirTEX(des.getAbsolutePath(), des5_04(getRegistrosDepartamento(csv)));
                break;
            case "5_05":
                escribirTEX(des.getAbsolutePath(), des5_05(getRegistrosDobles(csv)));
                break;
            case "6_01":
                escribirTEX(des.getAbsolutePath(), des6_01(getRegistros(csv)));
                break;
            case "6_02":
                escribirTEX(des.getAbsolutePath(), des6_02(getRegistrosDepartamento(csv)));
                break;
            case "6_03":
                escribirTEX(des.getAbsolutePath(), des6_03(getRegistrosDepartamento(csv)));
                break;
            case "6_04":
                escribirTEX(des.getAbsolutePath(), des6_04(getRegistrosDepartamento(csv)));
                break;
            case "6_05":
                escribirTEX(des.getAbsolutePath(), des6_05(getRegistrosDobles(csv)));
                break;
            case "6_06":
                escribirTEX(des.getAbsolutePath(), des6_06(getRegistrosDepartamento(csv)));
                break;
            case "6_07":
                escribirTEX(des.getAbsolutePath(), des6_07(getRegistrosDepartamento(csv)));
                break;
            case "6_08":
                escribirTEX(des.getAbsolutePath(), des6_08(getRegistrosDepartamento(csv)));
                break;
            case "6_09":
                escribirTEX(des.getAbsolutePath(), des6_09(getRegistrosDepartamento(csv)));
                break;
            case "6_10":
                escribirTEX(des.getAbsolutePath(), des6_10(getRegistrosDobles(csv)));
                break;
            case "6_11":
                escribirTEX(des.getAbsolutePath(), des6_11(getRegistrosDepartamento(csv)));
                break;
            case "6_12":
                escribirTEX(des.getAbsolutePath(), des6_12(getRegistrosDepartamento(csv)));
                break;
            default:
                break;
        }
    }
    
    private String des1_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        int anioAnterior = (int)(lista.get(lista.size()-5).getValor());
        String descripcion = "La serie histórica del "
                + this.trimestre + " trimestre de " + (this.anio-2)
                + " al " + this.trimestre + " trimestre de " + this.anio
                + " muestra que la cantidad de víctimas que se registraron en"
                + " el "
                + this.trimestre + " trimestre de " + this.anio
                + " fue de "
                + getNumeroComas(actual)
                + ", que representa "
                + getPorcentaje7(actual, anterior)
                + " respecto al trimestre anterior y "
                + getPorcentaje7(actual, anioAnterior)
                + " respecto al trimestre correspondiente del año anterior."
                ;
        return descripcion;
    }
    
    private String des1_02(List<RegistroDepto> lista){
        String descripcion = "El comportamiento de la gráfica por tipo de causa,"
                + " denota más ocurrencia para las causas "
                + getPreposicion(lista.get(lista.size()-1))
                + (lista.get(lista.size()-1).getNombre()).toLowerCase()
                + " con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% y "
                + getPreposicion(lista.get(lista.size()-2))
                + (lista.get(lista.size()-2).getNombre()).toLowerCase()
                + " con un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Las menos incidentes fueron las causas "
                + getPreposicion(lista.get(0))
                + (lista.get(0).getNombre()).toLowerCase()
                + " con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des1_03(List<RegistroDepto> lista){
        String descripcion = "La distribución por departamento da a conocer que "
                + lista.get(lista.size()-1).getNombre()
                + " tuvo el mayor registro de víctimas, con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\%, seguido de "
                + lista.get(lista.size()-2).getNombre()
                + " con "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Por el contrario, el departamento con menor"
                + " porcentaje de víctimas fue "
                + lista.get(0).getNombre()
                + ", con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des1_04(List<RegistroDepto> lista){
        String descripcion = "La partición de la gráfica por"
                + " área geográfica muestra más incidencia en el área "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + ", reflejando un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\%, mientras el área "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " tuvo el restante "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des1_05(List<RegistroDoble> lista){
        String[] menores = lista.get(0).getNombre().split("-");
        Double menorHombres = lista.get(0).getValor();
        Double menorMujeres = lista.get(0).getValor2();
        
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[1].getNombre().split("-");
        String[] edadesMujeres = mayores[0].getNombre().split("-");
        String descripcion = "Para el grupo de edad y sexo"
                + " se distinguen a las víctimas que oscilan"
                + " entre las edades de "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años con "
                + getNumeroComas(mayores[1].getValor())
                + " hombres y las edades de "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " mujeres.\\\\ \\\\"
                + "Dentro del grupo de víctimas con edades entre "
                + menores[0]
                + " y "
                + menores[1]
                + " años, se registraron "
                + getNumeroComas(menorHombres) + " hombres y "
                + getNumeroComas(menorMujeres) + " mujeres."
                ;
        return descripcion;
    }
    
    private String des1_06(List<RegistroDepto> lista){
        String descripcion = "En el grupo de homicidios se registran"
                + " como los más sobresalientes los de tipo "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(lista.size()-1).getValor())
                + " víctimas y a los de tipo "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(lista.size()-2).getValor())
                + " víctimas. Inverso se encuentran los de tipo "
                + lista.get(0).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(0).getValor())
                + " víctimas como el menos incidente."
                ;
        return descripcion;      
    }
    
    private String des1_07(List<RegistroDepto> lista){
        lista = eliminarOtros(lista);
        String descripcion = "En la agrupación de robos y hurtos"
                + " representados como la causa contra el patrimonio,"
                + " el "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + " registró "
                + getNumeroComas(lista.get(lista.size()-1).getValor())
                + " víctimas y el "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " "
                + getNumeroComas(lista.get(lista.size()-2).getValor())
                + " víctimas. Inverso se encuentran el "
                + lista.get(0).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(0).getValor())
                + " víctimas como el menos incidente."
                ;
        return descripcion;      
    }
    
    private List<RegistroDepto> eliminarOtros(List<RegistroDepto> lista){
        List<RegistroDepto> nueva = new ArrayList();
        for (RegistroDepto lista1 : lista) {
            if(!lista1.getNombre().equalsIgnoreCase("otros")) nueva.add(lista1);
        }
        return nueva;
    }
    
    private String des1_08(List<RegistroDepto> lista){
        String descripcion = "Para la causa de extorsiones, los departamentos más destacados fueron "
                + lista.get(lista.size()-1).getNombre()
                + ", con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% y "
                + lista.get(lista.size()-2).getNombre()
                + " con un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. No obstante, el departamento que"
                + " menos extorsiones tuvo fue "
                + lista.get(0).getNombre()
                + " con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des1_09(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        String descripcion = "En las extorsiones por sexo, se refleja con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% las extorsiones de "
                + " hombres y con un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% las de mujeres.\\\\ \\\\"
                + "Se ignora el "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de los casos."
                ;
        return descripcion;      
    }
    
    private String des1_10(List<RegistroDoble> lista){
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[0].getNombre().split("-");
        String[] edadesMujeres = mayores[1].getNombre().split("-");
        String descripcion = "En el grupo de edad y sexo"
                + " para la causa de extorsiones,"
                + " sobresalen las víctimas hombres entre las edades de "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años con "
                + getNumeroComas(mayores[1].getValor())
                + " extorsiones.\\\\ \\\\"
                + "Entre las mujeres resaltan las víctimas entre "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " extorsiones."
                ;
        return descripcion;
    }
    
    private String des2_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        int anioAnterior = (int)(lista.get(lista.size()-5).getValor());
        String descripcion = "La serie histórica del "
                + this.trimestre + " trimestre de " + (this.anio-2)
                + " al " + this.trimestre + " trimestre de " + this.anio
                + " muestra que la cantidad de detenidos(as)"
                + " que se registraron en el "
                + this.trimestre + " trimestre de " + this.anio
                + " fue de "
                + getNumeroComas(actual)
                + ", que representa "
                + getPorcentaje7(actual, anterior)
                + " respecto al trimestre anterior y "
                + getPorcentaje7(actual, anioAnterior)
                + " respecto al trimestre correspondiente del año anterior."
                ;
        return descripcion;
    }
    
    private String des2_02(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        imprimirLista(porcentajes);
        /*System.out.println(getNumeroComas(porcentajes.get(porcentajes.size()-1).getValor2()));
        System.out.println(getPreposicion(new RegistroDepto(porcentajes.get(porcentajes.size()-1).getNombre(), "0.0")));
        System.out.println((porcentajes.get(porcentajes.size()-1).getNombre()).toLowerCase());
        System.out.println(getNumero(porcentajes.get(porcentajes.size()-1).getValor()));
        */String descripcion = "El comportamiento por tipo de causa"
                + " muestra que "
                + getNumeroComas(porcentajes.get(porcentajes.size()-1).getValor2())
                + " fueron detenidos(as) por la causa "
                + getPreposicion(new RegistroDepto(porcentajes.get(porcentajes.size()-1).getNombre(), "0.0"))
                + (porcentajes.get(porcentajes.size()-1).getNombre()).toLowerCase()
                + ", representada por un "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\% del total del trimestre, seguido de causas "
                + getPreposicion(new RegistroDepto(porcentajes.get(porcentajes.size()-2).getNombre(), "0.0"))
                + (porcentajes.get(porcentajes.size()-2).getNombre()).toLowerCase()
                + " con "
                + getNumeroComas(porcentajes.get(porcentajes.size()-2).getValor2())
                + " detenidos(as), representada por un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private void imprimirLista(List<RegistroDoble> lista){
        System.out.println("Tamaño lista: " + lista.size());
        for(int i=0; i<lista.size(); i++){
            System.out.println("registro doble: " + lista.get(i).getNombre() + ", "
             + lista.get(i).getValor() + ", " + lista.get(i).getValor2());
        }
    }
    
    private String des2_03(List<RegistroDepto> lista){
        String descripcion = "La distribución por departamento da a conocer que "
                + lista.get(lista.size()-1).getNombre()
                + " tuvo el mayor registro de detenidos, con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\%, seguido de "
                + lista.get(lista.size()-2).getNombre()
                + " con "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Por el contrario, el departamento con menor"
                + " porcentaje de detenidos fue "
                + lista.get(0).getNombre()
                + ", con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des2_04(List<RegistroDepto> lista){
        String descripcion = "La partición de la gráfica por"
                + " área geográfica muestra que hay más detenidos(as) en el área "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + ", reflejando un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\%, mientras el área "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " tuvo el restante "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des2_05(List<RegistroDoble> lista){
        String[] menores = lista.get(0).getNombre().split("-");
        Double menorHombres = lista.get(0).getValor();
        Double menorMujeres = lista.get(0).getValor2();
        
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[1].getNombre().split("-");
        String[] edadesMujeres = mayores[0].getNombre().split("-");
        String descripcion = "La posición en el grupo de edad y sexo"
                + " que manifiesta alta incidencia en los(as) detenidos(as)"
                + " oscila entre las edades de "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años con "
                + getNumeroComas(mayores[1].getValor())
                + " hombres y las edades de "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " mujeres.\\\\ \\\\"
                + "Dentro del grupo de víctimas con edades entre "
                + menores[0]
                + " y "
                + menores[1]
                + " años, se registraron "
                + getNumeroComas(menorHombres) + " hombre(s) y "
                + getNumeroComas(menorMujeres) + " mujer(es)."
                ;
        return descripcion;
    }
    
    private String des2_06(List<RegistroDepto> lista){
        String descripcion = "En el grupo de homicidios se registran"
                + " como los más sobresalientes los de tipo "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(lista.size()-1).getValor())
                + " detenidos(as) y a los de tipo "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(lista.size()-2).getValor())
                + " detenidos(as) mientras los menos incidentes fueron los de tipo "
                + lista.get(0).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(0).getValor())
                + " detenidos(as)."
                ;
        return descripcion;      
    }
    
    private String des2_07(List<RegistroDepto> lista){
        lista = eliminarOtros(lista);
        String descripcion = "En la agrupación de robos y hurtos"
                + " representados como la causa contra el patrimonio,"
                + " el "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + " registró "
                + getNumeroComas(lista.get(lista.size()-1).getValor())
                + " detenidos(as) y el "
                + lista.get(lista.size()-2).getNombre().toLowerCase()
                + " "
                + getNumeroComas(lista.get(lista.size()-2).getValor())
                + " detenidos(as). Inverso se encuentran el "
                + lista.get(0).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(0).getValor())
                + " detenidos(as) como el menos incidente."
                ;
        return descripcion;      
          
    }
    
    private String des2_08(List<RegistroDepto> lista){
        String descripcion = "Para la causa de extorsiones, los departamentos más destacados fueron "
                + lista.get(lista.size()-1).getNombre()
                + ", con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% de los detenidos y "
                + lista.get(lista.size()-2).getNombre()
                + " con un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. No obstante, el departamento que"
                + " menos extorsiones tuvo fue "
                + lista.get(0).getNombre()
                + " con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des2_09(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        String descripcion = "En las extorsiones por sexo, se refleja con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% los hombres "
                + " detenidos y con un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% las mujeres.\\\\ \\\\"
                + "Se ignora el "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de los casos."
                ;
        return descripcion;      
    }
    
    private String des2_10(List<RegistroDoble> lista){
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[0].getNombre().split("-");
        String[] edadesMujeres = mayores[1].getNombre().split("-");
        
        String descripcion = "En el grupo de edad y sexo"
                + " para la causa de extorsiones,"
                + " sobresalen los hombres detenidos entre "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años con "
                + getNumeroComas(mayores[1].getValor())
                + " detenidos.\\\\ \\\\"
                + "Entre las mujeres resaltan las detenidas entre "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " detenidas."
                ;
        return descripcion;
    }
    
    private String des3_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        int anioAnterior = (int)(lista.get(lista.size()-5).getValor());
        String descripcion = "La serie histórica del "
                + this.trimestre + " trimestre de " + (this.anio-2)
                + " al " + this.trimestre + " trimestre de " + this.anio
                + " muestra que la cantidad de sindicados(as)"
                + " que se registraron en el "
                + this.trimestre + " de " + this.anio
                + " fue de "
                + getNumeroComas(actual)
                + ", que representa "
                + getPorcentaje7(actual, anterior)
                + " respecto al trimestre anterior y "
                + getPorcentaje7(actual, anioAnterior)
                + " respecto al trimestre correspondiente del año anterior."
                ;
        return descripcion;
    }
    
    private String des3_02(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "La distribución de sindicados(as)"
                + " por el tipo de delito reporta con alta incidencia "
                + getArticulo(porcentajes.get(porcentajes.size()-1).getNombre()) + " "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de "
                + getArticulo(porcentajes.get(porcentajes.size()-2).getNombre()) + " "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y "
                + getArticulo(porcentajes.get(porcentajes.size()-3).getNombre()) + " "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%. Contrario están aquellos delitos con menor proporción como "
                + getArticulo(porcentajes.get(0).getNombre()) + " "
                + porcentajes.get(0).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(0).getValor())
                + "\\% y "
                + porcentajes.get(1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(1).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des3_03(List<RegistroDepto> lista){
        String descripcion = "La distribución por departamento da a conocer que "
                + lista.get(lista.size()-1).getNombre()
                + " tuvo el mayor registro de sindicados(as), con un "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\%, seguido de "
                + lista.get(lista.size()-2).getNombre()
                + " con "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Por el contrario, el departamento con menor"
                + " porcentaje de detenidos fue "
                + lista.get(0).getNombre()
                + ", con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des3_04(List<RegistroDepto> lista){
        String descripcion = "En el "
                + this.trimestre + " trimestre de " + this.anio
                + " sobresalió el mes de "
                + lista.get(lista.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumeroComas(lista.get(lista.size()-1).getValor())
                + " sindicados(as), contrario al mes de "
                + lista.get(0).getNombre().toLowerCase()
                + " que reportó menos sindicados(as), con "
                + getNumeroComas(lista.get(0).getValor())
                + " personas."
                ;
        return descripcion;      
    }
    
    private String des3_05(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        String descripcion = "En el "
                + this.trimestre + " trimestre de " + this.anio
                + " sobresalió que de los sindicados, el "
                + getNumero(lista.get(0).getValor())
                + "\\% eran "
                + lista.get(0).getNombre().toLowerCase()
                + "s, el "
                + getNumero(lista.get(1).getValor())
                + "\\% "
                + lista.get(1).getNombre().toLowerCase()
                + "es y se desconoce el "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de los casos."
                ;
        return descripcion;      
    }
    
    private String des3_06(List<RegistroDoble> lista){
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[1].getNombre().split("-");
        String[] edadesMujeres = mayores[0].getNombre().split("-");
        String descripcion = "En el grupo de edad y sexo"
                + " para los sindicados,"
                + " sobresalen los hombres detenidos entre "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años con "
                + getNumeroComas(mayores[1].getValor())
                + " detenidos.\\\\ \\\\"
                + "Entre las mujeres resaltan las detenidas entre "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " detenidas."
                ;
        return descripcion;
    }
    
    private String des4_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        int anioAnterior = (int)(lista.get(lista.size()-5).getValor());
        String descripcion = "La serie histórica trimestral"
                + " muestra que las evaluaciones médico legales"
                + " para el "
                + this.trimestre + " trimestre de " + this.anio + " "
                + getPorcentaje3(actual, anterior)
                + " respecto al trimestre anterior y "
                + " una variación interanual de "
                + getPorcentajeSolo(actual, anioAnterior)
                + "\\%."
                ;
        return descripcion;
    }
    
    private String des4_02(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "Los tipo de evaluaciones médico legales que"
                + " destacaron sobre el resto fueron las de "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " representadas con el "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des4_03(List<RegistroDepto> lista){
        String descripcion = "La gráfica muestra la distribución"
                + " de las evaluaciones médico legales por departamento realizadas durante el "
                + this.trimestre + " trimestre de " + this.anio
                + ", en donde sobresale el departamento de "
                + lista.get(lista.size()-1).getNombre()
                + " representado por el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% de las evaluaciones, seguido de"
                + " los departamentos de "
                + lista.get(lista.size()-2).getNombre()
                + " con el "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% y "
                + lista.get(lista.size()-3).getNombre()
                + " con el "
                + getNumero(lista.get(lista.size()-3).getValor())
                + "\\%. Por el contrario, el departamento con menos"
                + " evaluaciones realizadas fue "
                + lista.get(0).getNombre()
                + " con el "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des4_04(List<RegistroDepto> lista){
        List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        String descripcion = "Al considerar las evaluaciones médico legales "
                + " divididas por sexo, se identificó que el "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\% fueron realizadas a "
                + toPlural(porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase())
                + ", mientras un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% fueron realizadas a "
                + toPlural(porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase())
                + "."
                ;
        return descripcion;      
    }
    
    private String toPlural(String singular){
        switch(singular){
            case "hombre": return "hombres";
            case "mujer": return "mujeres";
            default: return singular + "s";
        }
    }
    
    private String des4_05(List<RegistroDoble> lista){
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[1].getNombre().split("-");
        String[] edadesMujeres = mayores[0].getNombre().split("-");
        String descripcion = "Para las evaluaciones médico legales"
                + " por grupos de edad y sexo,"
                + " se observó que la mayor cantidad de evaluaciones"
                + " se practicaron a hombres entre "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años, con "
                + getNumeroComas(mayores[1].getValor())
                + " evaluaciones y a mujeres entre "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " evaluaciones."
                ;
        return descripcion;
    }
    
    private String des5_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        int anioAnterior = (int)(lista.get(lista.size()-5).getValor());
        String descripcion = "La gráfica muestra la serie histórica del "
                + this.trimestre + " trimestre de " + (this.anio-2)
                + " al " + this.trimestre + " trimestre de " + this.anio
                + ". La cantidad de necropsias practicadas "
                + getPorcentaje(actual, anterior)
                + " respecto al trimestre anterior."
                + " La variación interanual indica que "
                + getPorcentaje2(actual, anioAnterior)
                + "."
                ;
        return descripcion;
    }
    
    private String des5_02(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "Dentro de las tres causas de muerte que predominan"
                + " en las evaluaciones médicas de necropsia, resaltan las de "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des5_03(List<RegistroDepto> lista){
        String descripcion = "La gráfica muestra la distribución"
                + " de las evaluaciones médicas de necropsia por departamento realizadas durante el "
                + this.trimestre + " trimestre de " + this.anio
                + ", en donde sobresale el departamento de "
                + lista.get(lista.size()-1).getNombre()
                + " representado por el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% de las evaluaciones, seguido de"
                + " los departamentos de "
                + lista.get(lista.size()-2).getNombre()
                + " con el "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% y "
                + lista.get(lista.size()-3).getNombre()
                + " con el "
                + getNumero(lista.get(lista.size()-3).getValor())
                + "\\%. Por el contrario, el departamento con menos"
                + " evaluaciones realizadas fue "
                + lista.get(0).getNombre()
                + " con el "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des5_04(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        
        String descripcion = "La distribución porcentual de las evaluaciones médicas "
                + " de necropcias practicadas por sexo revela que el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% pertenecieron a "
                + toPlural(lista.get(lista.size()-1).getNombre().toLowerCase())
                + ", mientras un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% fueron realizadas a "
                + toPlural(lista.get(lista.size()-2).getNombre().toLowerCase())
                + ". Se desconoció el sexo del(la) evaluado(a) en un "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de las necropsias practicadas."
                ;
        return descripcion;      
    }
    
    private String des5_05(List<RegistroDoble> lista){
        RegistroDoble[] mayores = getMayoresDobles(lista);
        String[] edadesHombres = mayores[1].getNombre().split("-");
        String[] edadesMujeres = mayores[0].getNombre().split("-");
        String descripcion = "Para las evaluaciones médicas de necropsias"
                + " por grupos de edad y sexo,"
                + " se observó que la mayor cantidad de evaluaciones"
                + " se practicaron a hombres entre "
                + edadesHombres[0]
                + " y "
                + edadesHombres[1]
                + " años, con "
                + getNumeroComas(mayores[1].getValor())
                + " evaluaciones y a mujeres entre "
                + edadesMujeres[0]
                + " y "
                + edadesMujeres[1]
                + " años con "
                + getNumeroComas(mayores[0].getValor2())
                + " evaluaciones."
                ;
        return descripcion;
    }
    
    private String des6_01(List<Registro> lista){
        int actual = (int)(lista.get(lista.size()-1).getValor());
        int anterior = (int)(lista.get(lista.size()-2).getValor());
        String descripcion = "La serie histórica del "
                + this.trimestre + " trimestre de " + (this.anio-2)
                + " al " + this.trimestre + " trimestre de " + this.anio
                + " muestra que la cantidad de sentenciados(as)"
                + " que se registraron en el "
                + this.trimestre + " trimestre de " + this.anio
                + " fue de "
                + getNumeroComas(actual)
                + ", que representa "
                + getPorcentaje7(actual, anterior)
                + " respecto al trimestre anterior."
                ;
        return descripcion;
    }
    
    private String des6_02(List<RegistroDepto> lista){
        List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
        String descripcion = "Los tipos de sentencias que destacaron fueron las "
                + convertirSustantivo(porcentajes.get(porcentajes.size()-1).getNombre())
                + ", representadas con el "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de las "
                + convertirSustantivo(porcentajes.get(porcentajes.size()-2).getNombre())
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_03(List<RegistroDepto> lista){
        String descripcion = "La distribución porcentual por departamento"
                + " revela, para los(as) sentenciados(as) condenados(as) del "
                + this.trimestre + " trimestre de " + this.anio
                + ", al departamento de "
                + lista.get(lista.size()-1).getNombre()
                + " que sobresale con el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% de los sentenciados(as), seguido de "
                + lista.get(lista.size()-2).getNombre()
                + " con "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Por el contrario, el departamento con menor"
                + " porcentaje de sentenciados(as) condenados(as) fue "
                + lista.get(0).getNombre()
                + ", con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_04(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
      
        String descripcion = "Al considerar las sentencias condenadas divididas por sexo"
                + ", se identificó que el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% correspondieron a "
                + toPlural(lista.get(lista.size()-1).getNombre().toLowerCase())
                + ", mientras un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% a "
                + toPlural(lista.get(lista.size()-2).getNombre().toLowerCase())
                + ". Se desconoció el sexo del(la) sentenciado(a) en un "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de los casos."
                ;
        return descripcion;      
    }
    
    private String des6_05(List<RegistroDoble> lista){
        String descripcion = "En la gráfica por edad y sexo"
                + " para las sentencias condenatorias, resaltan"
                + " los hombres y mujeres mayores de edad con "
                + getNumeroComas(lista.get(1).getValor())
                + " y "
                + getNumeroComas(lista.get(1).getValor2())
                + " respectivamente, en comparación con los menores de edad con "
                + getNumeroComas(lista.get(0).getValor())
                + " hombres y "
                + getNumeroComas(lista.get(0).getValor2())
                + " mujeres."
                ;
        return descripcion;
    }
    
    private String des6_06(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "La distribución de sentenciados(as) condenados(as)"
                + " por el tipo de ley reporta con alta incidencia los delitos de la "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de los delitos de la "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y de los delitos contemplados en la "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_07(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "La distribución de sentenciados(as) condenados(as) por"
                + " tipo de delito del Ramo Penal da a conocer con alta incidencia al "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_08(List<RegistroDepto> lista){
        String descripcion = "La distribución porcentual por departamento"
                + " revela, para los(as) sentenciados(as) absueltos(as) del "
                + this.trimestre + " trimestre de " + this.anio
                + ", al departamento de "
                + lista.get(lista.size()-1).getNombre()
                + " con el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% de los sentenciados(as), seguido de "
                + lista.get(lista.size()-2).getNombre()
                + " con "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\%. Por el contrario, el departamento con menor"
                + " porcentaje de sentenciados(as) condenados(as) fue "
                + lista.get(0).getNombre()
                + ", con un "
                + getNumero(lista.get(0).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_09(List<RegistroDepto> lista){
        //List<RegistroDepto> porcentajes = getPorcentajeTotal(lista);
         String descripcion = "Al considerar las sentencias absolutorias divididas por sexo"
                + ", se identificó que el "
                + getNumero(lista.get(lista.size()-1).getValor())
                + "\\% correspondieron a "
                + toPlural(lista.get(lista.size()-1).getNombre().toLowerCase())
                + ", mientras un "
                + getNumero(lista.get(lista.size()-2).getValor())
                + "\\% a "
                + toPlural(lista.get(lista.size()-2).getNombre().toLowerCase())
                + ". Se desconoció el sexo del(la) sentenciado(a) en un "
                + getNumero(getRegistro(lista, "ignorado").getValor())
                + "\\% de los casos."
                ;
        return descripcion;      
    }
    
    private String des6_10(List<RegistroDoble> lista){
        String descripcion = "En la gráfica por edad y sexo"
                + " para las sentencias absolutorias, resaltan"
                + " los hombres y mujeres mayores de edad con "
                + getNumeroComas(lista.get(1).getValor())
                + " y "
                + getNumeroComas(lista.get(1).getValor2())
                + " respectivamente, en comparación con los menores de edad con "
                + getNumeroComas(lista.get(0).getValor())
                + " hombres y "
                + getNumeroComas(lista.get(0).getValor2())
                + " mujeres."
                ;
        return descripcion;
    }
    
    private String des6_11(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "La distribución de sentenciados(as) absueltos(as)"
                + " por el tipo de ley reporta con alta incidencia los delitos de la "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de los delitos de la "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y de los delitos contemplados en la "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String des6_12(List<RegistroDepto> lista){
        List<RegistroDoble> porcentajes = getPorcentajeTotalDoble(lista);
        String descripcion = "La distribución de sentenciados(as) absueltos(as) por"
                + " tipo de delito del Ramo Penal da a conocer con alta incidencia al "
                + porcentajes.get(porcentajes.size()-1).getNombre().toLowerCase()
                + " con "
                + getNumero(porcentajes.get(porcentajes.size()-1).getValor())
                + "\\%, seguido de "
                + porcentajes.get(porcentajes.size()-2).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-2).getValor())
                + "\\% y "
                + porcentajes.get(porcentajes.size()-3).getNombre().toLowerCase()
                + " con un "
                + getNumero(porcentajes.get(porcentajes.size()-3).getValor())
                + "\\%."
                ;
        return descripcion;      
    }
    
    private String convertirSustantivo(String sustantivo){
        switch(sustantivo.toLowerCase()){
            case "absueltos":
                return "absolutorias";
            case "condenados":
                return "condenatorias";
            
            default:
                return "*convertir sustantivo*";
        }
    }
    
    private String getPorcentajeSolo(int a, int b){
        return getNumero((double)(((double)a-(double)b)/(double)b));
    }
    
    private Double getIgnorado(List<RegistroDepto> lista){
        int total = 0;
        for(int i=0; i<lista.size(); i++){
            total += lista.get(i).getValor();
        }
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNombre().toLowerCase().equals("ignorado")){
                return ((lista.get(i).getValor()/total)*100);
            }
        }
        return -1.0;
    }
    
    private String getArticulo(String nombre){
        String[] primera = nombre.split(" ");
        switch(primera[0].toLowerCase()){
            case "amenazas":
                return "las";
            case "violencia":
                return "la";
            case "hurto":
                return "el";
            case "robo":
                return "el";
            case "lesiones":
                return "las";
            case "maltrato":
                return "el";
            case "extorsión":
                return "la";
            case "violación":
                return "la";
            case "coacción":
                return "la";
            default:
                return "el";
        }
    }
    
    private RegistroDepto getRegistro(List<RegistroDepto> lista, String nombre){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNombre().equalsIgnoreCase(nombre)) return lista.get(i);
        }
        if(nombre.equalsIgnoreCase("ignorado")){
            return new RegistroDepto("ignorado", Double.toString(100.0 - (getTotal(lista))));
        }
        return new RegistroDepto("No encontrado", "0.0");
    }
    
    private Double getTotal(List<RegistroDepto> lista){
        Double total = 0.0;
        for (RegistroDepto lista1 : lista) {
            total += lista1.getValor();
        }
        return total;
    }
    
    private String getPreposicion(RegistroDepto registro){
        switch(registro.getNombre().toLowerCase().substring(0, 5)){
            case "contr":
                return "";
            case "extor":
                return "de ";
            case "homic":
                return "de ";
            case "lesio":
                return "de ";
            default:
                return "de ";
        }
    }
    
    //devuelve la lista de registrosDepto con el porcentaje como valor dentro de todos los valores sumados de la lista
    private List<RegistroDepto> getPorcentajeTotal(List<RegistroDepto> lista){
        double total = 0;
        for(int i=0; i<lista.size(); i++){
            total += lista.get(i).getValor();
        }
        List<RegistroDepto> porcentajes = new ArrayList();
        for(int i=0; i<lista.size(); i++){
            if(!(lista.get(i).getNombre().toLowerCase().equals("ignorado") 
                    || lista.get(i).getNombre().toLowerCase().equals("otras"))){
                Double porcentaje = (lista.get(i).getValor()/total) * 100;
                porcentajes.add(new RegistroDepto(lista.get(i).getNombre(), porcentaje.toString()));
            }
        }
        //ordenando lista de menor a mayor
        for(int i=0; i<porcentajes.size(); i++){
            for(int j=i; j<porcentajes.size(); j++){
                if(porcentajes.get(i).getValor() > porcentajes.get(j).getValor()){
                    RegistroDepto aux = porcentajes.get(i);
                    porcentajes.set(i, porcentajes.get(j));
                    porcentajes.set(j, aux);
                }
            }
        }
        return porcentajes;
    }
    
    //devuelve la lista de registrosDepto con el porcentaje como valor dentro de todos los valores sumados de la lista
    //hecho para el 2.2 y parecidos. "Otras" no es tomado en cuenta
    private List<RegistroDoble> getPorcentajeTotalDoble(List<RegistroDepto> lista){
        double total = 0;
        for(int i=0; i<lista.size(); i++){
            total += lista.get(i).getValor();
        }
        List<RegistroDoble> porcentajes = new ArrayList();
        for(int i=0; i<lista.size(); i++){
            if(!(lista.get(i).getNombre().toLowerCase().equals("ignorado") 
                    || lista.get(i).getNombre().toLowerCase().equals("otras causas")
                    || lista.get(i).getNombre().toLowerCase().equals("otros"))){
                Double porcentaje = (lista.get(i).getValor()/total) * 100;
                porcentajes.add(new RegistroDoble(lista.get(i).getNombre(), porcentaje.toString(), lista.get(i).getValor().toString()));
            }
        }
        //ordenando lista de menor a mayor
        for(int i=0; i<porcentajes.size(); i++){
            for(int j=i; j<porcentajes.size(); j++){
                if(porcentajes.get(i).getValor() > porcentajes.get(j).getValor()){
                    RegistroDoble aux = porcentajes.get(i);
                    porcentajes.set(i, porcentajes.get(j));
                    porcentajes.set(j, aux);
                }
            }
        }
        return porcentajes;
    }
    
    
    private String getPorcentaje(int a, int b){
        double div = (double)((double)((double)a-(double)b)/(double)b);
        if(a==b) return "se mantuvo igual";
        else if(a<b) return "disminuyó en un " + getNumero((double)(-(div))*100) + "\\%";
        else return "aumentó en un " + getNumero((double)(div)*100) + "\\%";
    }
    
    private String getPorcentaje2(int a, int b){
        double div = (double)((double)((double)a-(double)b)/(double)b);
        if(a==b) return "no hubo variación";
        else if(a<b) return "hubo una disminución del " + getNumero((double)(-(div))*100) + "\\%";
        else return "hubo un aumento del " + getNumero((double)(div)*100) + "\\%";
    }
    
    private String getPorcentaje3(int a, int b){
        double div = (double)((double)((double)a-(double)b)/(double)b);
        if(a==b) return "no tuvieron variación";
        else if(a<b) return "tuvieron una disminución de " + getNumero(((double)(-(div))) * 100) + "\\%";
        else return "tuvieron un aumento de " + getNumero((double)((div) * 100)) + "\\%";
    }
    
    private String getPorcentaje7(int a, int b){
        double div = (double)((double)((double)a-(double)b)/(double)b);
        if(a==b) return "un equilibrio";
        else if(a<b) return "un descenso de " + getNumero(((double)(-(div))) * 100) + "\\%";
        else return "un ascenso de " + getNumero((double)((div) * 100)) + "\\%";
    }
    
    private String getNumero(Double n){
        DecimalFormat decim = new DecimalFormat("0.0");
        return (decim.format(n));
    }
    
    private String getNumeroComas(int n){
        DecimalFormat decim = new DecimalFormat("###,###,###");
        return (decim.format(n));
    }
    
    private String getNumeroComas(Double n){
        DecimalFormat decim = new DecimalFormat("###,###,###");
        return (decim.format(n));
    }
    
    private void escribirTEX(String nombre, String texto){
         File file = new File(nombre);
         file.getParentFile().setReadable(true, false);
        file.getParentFile().setExecutable(true, false);
        file.getParentFile().setWritable(true, false);
        file.getParentFile().mkdirs();
        String fileName = nombre + ".tex";
         Path textFile = Paths.get(fileName);
         List<String> lines = new ArrayList<>();
         lines.add(texto);
        try {
            Files.write(textFile, lines, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    //lee el archivo csv y retorna la lista con los registros de una serie histórica
    private List<Registro> getRegistros(String csv){
        File f = new File(ruta, csv + ".csv");
        BufferedReader br = null;
        String line = "";
        boolean encabezado = true;
        
        List<Registro> lista = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(f.getAbsolutePath()));
        while ((line = br.readLine()) != null) {
                    if(encabezado){
                        encabezado = false;
                    }
                    else{
            String[] valores = line.split(";");
                        
                            lista.add(new Registro(valores[0], valores[1]));
                        
                    }
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lista;
    }
    
    //lee el archivo csv y retorna la lista con los registros por departamento
    private List<RegistroDepto> getRegistrosDepartamento(String csv){
        File f = new File(ruta, csv + ".csv");
        BufferedReader br = null;
        String line = "";
        boolean encabezado = true;
        
        List<RegistroDepto> lista = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(f.getAbsolutePath()));
        while ((line = br.readLine()) != null) {
                    if(encabezado){
                        encabezado = false;
                    }
                    else{
            String[] valores = line.split(";");
                        lista.add(new RegistroDepto(valores[0], valores[1]));
                    }
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        if(!(csv.equals("3_05")))
          {
            //ordenando lista de menor a mayor
            for(int i=0; i<lista.size(); i++){
                for(int j=i; j<lista.size(); j++){
                    if(lista.get(i).getValor() >= lista.get(j).getValor()){
                        RegistroDepto aux = lista.get(i);
                        lista.set(i, lista.get(j));
                        lista.set(j, aux);
                    }
                }
            }
        }
        
        return lista;
    }
    
    private List<RegistroDoble> getRegistrosDobles(String csv){
        File f = new File(ruta, csv + ".csv");
        BufferedReader br = null;
        String line = "";
        boolean encabezado = true;
        
        List<RegistroDoble> lista = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(f.getAbsolutePath()));
        while ((line = br.readLine()) != null) {
                    if(encabezado){
                        encabezado = false;
                    }
                    else{
            String[] valores = line.split(";");
                        lista.add(new RegistroDoble(valores[0], valores[1], valores[2]));
                    }
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        //ordenando lista de menor a mayor
        /*for(int i=0; i<lista.size(); i++){
            for(int j=i; j<lista.size(); j++){
                if((lista.get(i).getSuma()) > lista.get(j).getSuma()){
                    RegistroDoble aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }*/
        
        return lista;
    }
    
    private RegistroDoble[] getMayoresDobles(List<RegistroDoble> lista){
        RegistroDoble[] res = new RegistroDoble[2];
        for(int i=0; i<lista.size(); i++){
            for(int j=i; j<lista.size(); j++){
                if((lista.get(i).getValor()) < lista.get(j).getValor()){
                    RegistroDoble aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        res[1] = lista.get(0);
        for(int i=0; i<lista.size(); i++){
            for(int j=i; j<lista.size(); j++){
                if((lista.get(i).getValor2()) < lista.get(j).getValor2()){
                    RegistroDoble aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        res[0] = lista.get(0);
        return res;
    }
    
    
}
