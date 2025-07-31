/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchezrosales_20250728_2;

/**
 *
 * @author Jeronica
 */
public class Main {
//---------------------------VARIABLES GLOBALES-------------------------------

public static String nombres = "Veronica Alejandra";
public static String apellidos ="Sanchez Rosales";
public static int anio_nacimiento =2006;
public static int mes_nacimiento = 01;
public static float estatura = 1.62f;
public static float peso = 110f;
public static char genero = 'F';
public static String estado_familiar = "Casada";
public static double salario_mensual = 460d;

public static void main(String[] args) {
//----------------------VARIABLES LOCALES-------------------------

double indice_masa_corporal = 0.0d;
float tasa_kilogramo = 0.453592f;// 1 libra equivale a 0.453592 kilogramos
int dias_laborales = 22;// dias laborales al mes
int horas_laborales = 8;// horas laborales al dia


//-------------------CALCULANDO INDICE DE MASA CORPORAL----------------

//convertir peso de libras a kilogramos
float peso_kilogramos = Main.peso*tasa_kilogramo;
//elevando el valor de estatura al cuadrado
float estatura_al_cuadrado = Main.estatura*Main.estatura;
//calcular el indice de masa corporal
indice_masa_corporal = peso_kilogramos / estatura_al_cuadrado;

//---------------------CALCULANDO SALARIOS----------------------

//calculando salario diario
double salario_diario =Main.salario_mensual / dias_laborales;
// calculando salario por horra
double salario_hora = salario_diario / horas_laborales;

//********************************************
//--------------SALIDA DE DATOS---------------
//********************************************
System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
System.out.println("su peso en libras es: "+Main.peso+" pero en kilogramos es:"+peso_kilogramos);
System.out.println("su indice de masa corporal es de: "+indice_masa_corporal);
System.out.println("su salario es de: "+Main.salario_mensual);
System.out.println("su salario diario es de: "+salario_diario);
System.out.println("su salario por hora es de: "+salario_hora);
}
}