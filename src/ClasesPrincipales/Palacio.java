package ClasesPrincipales;

import CondicionesCobro.*;
import CondicionesEspecialidad.*;

public class Palacio {
    public static void main(String[] args) {
        // Creacion Cocina y Estacion por Defecto
        EstacionDeTrabajo estacionPorDefecto= new EstacionDeTrabajo(0);
        Cocina cocinaDuahu= new Cocina(estacionPorDefecto);

        // Estaciones de trabajo
        EstacionDeTrabajo estacion1= new EstacionDeTrabajo(1);
        EstacionDeTrabajo estacion2= new EstacionDeTrabajo(2);
        EstacionDeTrabajo estacion3= new EstacionDeTrabajo(3);

        // Especialidades
        Especialidad e1= new EspecialidadPorPreparacion("horno");
        Especialidad e2= new EspecialidadPorTipo("guarnicion");
        Especialidad e3= new EspecialidadPorPreparacion("fritas");
        Especialidad e4= new EspecialidadAnd(e1, e2);
        Especialidad e5= new EspecialidadPorPreparacion("mixta");

        //Criterios de Cobro
        CriterioCobro c1= new CostoFijo(100,200,e1);
        CriterioCobro c2= new CostoFijo(200, 300, e4);
        CriterioCobro c3= new Descuento(20, "Miercoles", "Miercoles");
        CriterioCobro c4= new CostoPropina(15);
        CriterioCobro c5= new CostoSumado(c1, c4);

        //Agregacion de Especialidades a Estaciones de Trabajo
        estacion1.agregarEspecialidad(e1);
        estacion2.agregarEspecialidad(e2);
        estacion3.agregarEspecialidad(e3);
        estacion3.agregarEspecialidad(e4);
        estacion3.agregarEspecialidad(e5);

        //Agregacion de Estaciones de Trabajo a Cocina
        cocinaDuahu.agregarEstacion(estacion1);
        cocinaDuahu.agregarEstacion(estacion2);
        cocinaDuahu.agregarEstacion(estacion3);

        // Cobros agregados
        cocinaDuahu.agregarCobros(c1);
        cocinaDuahu.agregarCobros(c2);
        cocinaDuahu.agregarCobros(c3);
        cocinaDuahu.agregarCobros(c4);
        cocinaDuahu.agregarCobros(c5);

        //Creacion de Comidas simples
        ComidaSimple comida1= new ComidaSimple("milanesa", "plato principal", "horno",500, 200, 20);
        ComidaSimple comida2= new ComidaSimple("papas fritas", "guarnicion","fritas",300,50,5);
        ComidaSimple comida3= new ComidaSimple("salsa tomate", "vegetal", "hervida", 100, 25, 10);
        ComidaSimple comida4= new ComidaSimple("queso","lacteo","rodajas", 600, 40,2 );


        //Creacion de Comidas Complejas
        ComidaCompleja comidaCompleja1= new ComidaCompleja("milanesas con papas", "plato principal", "mixta");
        ComidaCompleja comidaCompleja2= new ComidaCompleja("milanesa napolitana con papas","plato principal", "mixta");

        //Agregacion de comidas a compleja1
        comidaCompleja1.agregarComida(comida1);
        comidaCompleja1.agregarComida(comida2);

        //Agregacion de comidas a compleja
        comidaCompleja2.agregarComida(comida3);
        comidaCompleja2.agregarComida(comida4);

        //Creacion de Pedido
        Pedido pedido1= new Pedido(1,"Javier");

        //Agregacion de comida a pedido
        pedido1.agregarComida(comidaCompleja1);
        pedido1.agregarComida(comidaCompleja2);

        //Delegacion de pedido
        cocinaDuahu.delegarPedido(pedido1);

        //Impresiones por pantalla
        System.out.print("Cobro de todos los pedidos de la mesa '1': ");
        System.out.println("$ " + cocinaDuahu.cobroMesa(1));
        System.out.println("");
        System.out.print("Comidas del pedido '1': ");
        System.out.println(pedido1);

    }
}