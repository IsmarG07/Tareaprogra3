/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anaca
 */
public class pacientes2 {

    /**
     * @return the dia1
     */
    public String getDia1() {
        return dia1;
    }

    /**
     * @param dia1 the dia1 to set
     */
    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    /**
     * @return the mes1
     */
    public String getMes1() {
        return mes1;
    }

    /**
     * @param mes1 the mes1 to set
     */
    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }

    /**
     * @return the anio1
     */
    public String getAnio1() {
        return anio1;
    }

    /**
     * @param anio1 the anio1 to set
     */
    public void setAnio1(String anio1) {
        this.anio1 = anio1;
    }

    /**
     * @return the edad1
     */
   

    
     public Date fecha(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Convierte la cadena a un objeto Date
            java.util.Date utilDate = formato.parse(this.getFechanacimiento1());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            System.out.println("fecha "+utilDate+" "+sqlDate);
            return sqlDate;
        } catch (ParseException e) {
          //  e.printStackTrace();
        }
        return null;
    }
    
      public int calcularEdad(String fechaN){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
        Date fechaNacimiento = sdf.parse(fechaN);
        Date fechaActual = new Date();
        
        long diferenciaEnMilis = fechaActual.getTime() - fechaNacimiento.getTime();
        
        int edadC = (int) (diferenciaEnMilis / 31536000000L); // 1 año = 31,536,000,000 milisegundos
        
        // Asumiendo que tienes un método setEdad en la misma clase para establecer la edad
        
        return edadC;
    } catch (ParseException e) {
        e.printStackTrace();
        // Maneja la excepción de análisis de fecha según tus necesidades
    }
        return 0;
        
    }
    
    
    /**
     * 
     * 
     * @return the edad
     */
 
 public int getEdad1() {
        return edad1;
    }

    /**
     * @param edad1 the edad1 to set
     */
    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }
      
    /**
     * @return the nopaciente1
     */
    public String getNopaciente1() {
        return nopaciente1;
    }

    /**
     * @param nopaciente1 the nopaciente1 to set
     */
    public void setNopaciente1(String nopaciente1) {
        this.nopaciente1 = nopaciente1;
    }

    /**
     * @return the primerapellido1
     */
    public String getPrimerapellido1() {
        return primerapellido1;
    }

    /**
     * @param primerapellido1 the primerapellido1 to set
     */
    public void setPrimerapellido1(String primerapellido1) {
        this.primerapellido1 = primerapellido1;
    }

    /**
     * @return the segundoapellido1
     */
    public String getSegundoapellido1() {
        return segundoapellido1;
    }

    /**
     * @param segundoapellido1 the segundoapellido1 to set
     */
    public void setSegundoapellido1(String segundoapellido1) {
        this.segundoapellido1 = segundoapellido1;
    }

    /**
     * @return the nombres1
     */
    public String getNombres1() {
        return nombres1;
    }

    /**
     * @param nombres1 the nombres1 to set
     */
    public void setNombres1(String nombres1) {
        this.nombres1 = nombres1;
    }

    /**
     * @return the dpi1
     */
    public String getDpi1() {
        return dpi1;
    }

    /**
     * @param dpi1 the dpi1 to set
     */
    public void setDpi1(String dpi1) {
        this.dpi1 = dpi1;
    }

    /**
     * @return the fechanacimiento1
     */
    public String getFechanacimiento1() {
        return fechanacimiento1;
    }

    /**
     * @param fechanacimiento1 the fechanacimiento1 to set
     */
    public void setFechanacimiento1(String fechanacimiento1) {
        this.fechanacimiento1 = fechanacimiento1;
    }

    /**
     * @return the lugarnacimiento1
     */
    public String getLugarnacimiento1() {
        return lugarnacimiento1;
    }

    /**
     * @param lugarnacimiento1 the lugarnacimiento1 to set
     */
    public void setLugarnacimiento1(String lugarnacimiento1) {
        this.lugarnacimiento1 = lugarnacimiento1;
    }

    /**
     * @return the alergias1
     */
    public String getAlergias1() {
        return alergias1;
    }

    /**
     * @param alergias1 the alergias1 to set
     */
    public void setAlergias1(String alergias1) {
        this.alergias1 = alergias1;
    }

    /**
     * @return the tiposangre1
     */
    public String getTiposangre1() {
        return tiposangre1;
    }

    /**
     * @param tiposangre1 the tiposangre1 to set
     */
    public void setTiposangre1(String tiposangre1) {
        this.tiposangre1 = tiposangre1;
    }

    /**
     * @return the etnia1
     */
    public String getEtnia1() {
        return etnia1;
    }

    /**
     * @param etnia1 the etnia1 to set
     */
    public void setEtnia1(String etnia1) {
        this.etnia1 = etnia1;
    }

    /**
     * @return the idioma1
     */
    public String getIdioma1() {
        return idioma1;
    }

    /**
     * @param idioma1 the idioma1 to set
     */
    public void setIdioma1(String idioma1) {
        this.idioma1 = idioma1;
    }

    /**
     * @return the sexo1
     */
    public String getSexo1() {
        return sexo1;
    }

    /**
     * @param sexo1 the sexo1 to set
     */
    public void setSexo1(String sexo1) {
        this.sexo1 = sexo1;
    }

    /**
     * @return the nivelescolar1
     */
    public String getNivelescolar1() {
        return nivelescolar1;
    }

    /**
     * @param nivelescolar1 the nivelescolar1 to set
     */
    public void setNivelescolar1(String nivelescolar1) {
        this.nivelescolar1 = nivelescolar1;
    }

    /**
     * @return the ocupacion1
     */
    public String getOcupacion1() {
        return ocupacion1;
    }

    /**
     * @param ocupacion1 the ocupacion1 to set
     */
    public void setOcupacion1(String ocupacion1) {
        this.ocupacion1 = ocupacion1;
    }

    /**
     * @return the departamento1
     */
    public String getDepartamento1() {
        return departamento1;
    }

    /**
     * @param departamento1 the departamento1 to set
     */
    public void setDepartamento1(String departamento1) {
        this.departamento1 = departamento1;
    }

    /**
     * @return the municipio1
     */
    public String getMunicipio1() {
        return municipio1;
    }

    /**
     * @param municipio1 the municipio1 to set
     */
    public void setMunicipio1(String municipio1) {
        this.municipio1 = municipio1;
    }

    /**
     * @return the direccion1
     */
    public String getDireccion1() {
        return direccion1;
    }

    /**
     * @param direccion1 the direccion1 to set
     */
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    /**
     * @return the telefono1
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * @param telefono1 the telefono1 to set
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * @return the email1
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * @param email1 the email1 to set
     */
    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    /**
     * @return the observacion1
     */
    public String getObservacion1() {
        return observacion1;
    }

    /**
     * @param observacion1 the observacion1 to set
     */
    public void setObservacion1(String observacion1) {
        this.observacion1 = observacion1;
    }

    /**
     * @return the horaingreso1
     */
    public String getHoraingreso1() {
        return horaingreso1;
    }

    /**
     * @param horaingreso1 the horaingreso1 to set
     */
    public void setHoraingreso1(String horaingreso1) {
        this.horaingreso1 = horaingreso1;
    }

    /**
     * @return the horaegreso1
     */
    public String getHoraegreso1() {
        return horaegreso1;
    }

    /**
     * @param horaegreso1 the horaegreso1 to set
     */
    public void setHoraegreso1(String horaegreso1) {
        this.horaegreso1 = horaegreso1;
    }
    
    private static String nopaciente1;
    private static String primerapellido1;
    private static String segundoapellido1;
    private static String nombres1;
    private static String dpi1;
    private static String fechanacimiento1;
    private static int edad1;
    private static String lugarnacimiento1;
    private static String alergias1;
    private static String tiposangre1;
    private static String etnia1;
    private static String idioma1;
    private static String sexo1;
    private static String nivelescolar1;
    private static String ocupacion1;
    private static String departamento1;
    private static String municipio1;
    private static String direccion1;
    private static String telefono1;
    private static String email1;
    private static String observacion1;
    private static String horaingreso1;
    private static String horaegreso1;
    private static String dia1;
    private static String mes1;
    private static String anio1;
    
}
