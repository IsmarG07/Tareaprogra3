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
public class pacientes {
    
      public Date fecha(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Convierte la cadena a un objeto Date
            java.util.Date utilDate = formato.parse(this.getFechanacimiento());
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
        
            System.out.println("EdadC " + edadC + "thisEdad "+this.getEdad());
        return edadC;
    } catch (ParseException e) {
        e.printStackTrace();
        // Maneja la excepción de análisis de fecha según tus necesidades
    }
        return 0;
        
    }
    

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the horaegreso
     */
    public String getHoraegreso() {
        return horaegreso;
    }

    /**
     * @param horaegreso the horaegreso to set
     */
    public void setHoraegreso(String horaegreso) {
        this.horaegreso = horaegreso;
    }

    /**
     * @return the Nopaciente
     */
    public String getNopaciente() {
        return nopaciente;
    }

    /**
     * @param nopaciente the Nopaciente to set
     */
    public void setNopaciente(String nopaciente) {
        this.nopaciente = nopaciente;
    }

    /**
     * @return the primerapellido
     */
    public String getPrimerapellido() {
        return primerapellido;
    }

    /**
     * @param primerapellido the primerapellido to set
     */
    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    /**
     * @return the segundoapellido
     */
    public String getSegundoapellido() {
        return segundoapellido;
    }

    /**
     * @param segundoapellido the segundoapellido to set
     */
    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the DPI
     */
    public String getDPI() {
        return dpi;
    }

    /**
     * @param dpi the DPI to set
     */
    public void setDPI(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the fechanacimiento
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return the lugarnacimiento
     */
    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    /**
     * @param lugarnacimiento the lugarnacimiento to set
     */
    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    /**
     * @return the alergias
     */
    public String getAlergias() {
        return alergias;
    }

    /**
     * @param alergias the alergias to set
     */
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    /**
     * @return the tiposangre
     */
    public String getTiposangre() {
        return tiposangre;
    }

    /**
     * @param tiposangre the tiposangre to set
     */
    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    /**
     * @return the etnia
     */
    public String getEtnia() {
        return etnia;
    }

    /**
     * @param etnia the etnia to set
     */
    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nivelescolar
     */
    public String getNivelescolar() {
        return nivelescolar;
    }

    /**
     * @param nivelescolar the nivelescolar to set
     */
    public void setNivelescolar(String nivelescolar) {
        this.nivelescolar = nivelescolar;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * @return the horaingreso
     */
    public String getHoraingreso() {
        return horaingreso;
    }

    /**
     * @param horaingreso the horaingreso to set
     */
    public void setHoraingreso(String horaingreso) {
        this.horaingreso = horaingreso;
    }
    
    private String nopaciente;
    private String primerapellido;
    private String segundoapellido;
    private String nombres;
    private String dpi;
    private String fechanacimiento;
    private String lugarnacimiento;
    private String alergias;
    private String tiposangre;
    private String etnia;
    private String idioma;
    private String sexo;
    private String nivelescolar;
    private String ocupacion;
    private String departamento;
    private String municipio;
    private String direccion;
    private String telefono;
    private String email;
    private String observacion;
    private String horaingreso;
    private String horaegreso;
    private int edad;
    
    
}
