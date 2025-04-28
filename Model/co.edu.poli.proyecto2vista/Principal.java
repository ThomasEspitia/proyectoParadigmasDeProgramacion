package co.edu.poli.proyecto2vista;
import co.edu.poli.proyecto2.modelo.*;
import co.edu.poli.proyecto2.servicios.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementacionCRUD crud = new ImplementacionCRUD();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menú de Semillas ---");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Leer Todos");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("6. Serializar");
            System.out.println("7. Deserializar");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = 0;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    // Crear Semilla
                    System.out.print("Tipo (1: Hortaliza, 2: Legumbre, 3: Cereal, 4: Frutal): ");
                    int tipo = 0;
                    try {
                        tipo = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Tipo inválido.");
                        break;
                    }
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad disponible: ");
                    int cantidad = 0;
                    try {
                        cantidad = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad inválida.");
                        break;
                    }
                    System.out.print("Tiempo de cosecha: ");
                    int tiempo = 0;
                    try {
                        tiempo = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Tiempo inválido.");
                        break;
                    }
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    
                    Semilla s = null;
                    switch (tipo) {
                        case 1:
                            System.out.print("Tipo de hortaliza: ");
                            String tipoHortaliza = sc.nextLine();
                            s = new Hortaliza(id, nombre, cantidad, tiempo, origen, tipoHortaliza);
                            break;
                        case 2:
                            System.out.print("Temperatura ideal: ");
                            double temp = 0.0;
                            try {
                                temp = Double.parseDouble(sc.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Temperatura inválida.");
                                break;
                            }
                            s = new Legumbre(id, nombre, cantidad, tiempo, origen, temp);
                            break;
                        case 3:
                            System.out.print("Tipo de suelo: ");
                            String tipoSuelo = sc.nextLine();
                            s = new Cereal(id, nombre, cantidad, tiempo, origen, tipoSuelo);
                            break;
                        case 4:
                            System.out.print("Mes de fructificación: ");
                            String mes = sc.nextLine();
                            s = new Frutal(id, nombre, cantidad, tiempo, origen, mes);
                            break;
                        default:
                            System.out.println("Tipo no reconocido.");
                    }
                    if (s != null) {
                        System.out.println(crud.create(s));
                    }
                    break;
                    
                case 2:
                    // Leer por ID
                    System.out.print("ID a leer: ");
                    String idLeer = sc.nextLine();
                    Semilla semillaLeida = crud.read(idLeer);
                    if (semillaLeida != null) {
                        System.out.println("Semilla encontrada:");
                        System.out.println(semillaLeida);
                    } else {
                        System.out.println("No se encontró semilla con ese ID.");
                    }
                    break;
                    
                case 3:
                    // Leer todas las Semillas
                    Semilla[] todas = crud.readAll();
                    if (todas.length == 0) {
                        System.out.println("No hay semillas registradas.");
                    } else {
                        System.out.println("Listado de Semillas:");
                        for (Semilla sem : todas) {
                            System.out.println(sem);
                        }
                    }
                    break;
                    
                case 4:
                    // Actualizar Semilla
                    System.out.print("ID de la semilla a actualizar: ");
                    String idAct = sc.nextLine();
                    Semilla original = crud.read(idAct);
                    if (original == null) {
                        System.out.println("No existe semilla con ese ID.");
                        break;
                    }
                    System.out.println("Ingrese nuevos datos:");
                    System.out.print("Nombre: ");
                    String nuevoNom = sc.nextLine();
                    System.out.print("Cantidad disponible: ");
                    int nuevaCant = 0;
                    try {
                        nuevaCant = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad inválida.");
                        break;
                    }
                    System.out.print("Tiempo de cosecha: ");
                    int nuevoTiempo = 0;
                    try {
                        nuevoTiempo = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Tiempo inválido.");
                        break;
                    }
                    System.out.print("Origen: ");
                    String nuevoOri = sc.nextLine();
                    
                    Semilla s2 = null;
                    if (original instanceof Hortaliza) {
                        System.out.print("Tipo de hortaliza: ");
                        String nuevoTipoHortaliza = sc.nextLine();
                        s2 = new Hortaliza(idAct, nuevoNom, nuevaCant, nuevoTiempo, nuevoOri, nuevoTipoHortaliza);
                    } else if (original instanceof Legumbre) {
                        System.out.print("Temperatura ideal: ");
                        double nuevaTemp = 0.0;
                        try {
                            nuevaTemp = Double.parseDouble(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Temperatura inválida.");
                            break;
                        }
                        s2 = new Legumbre(idAct, nuevoNom, nuevaCant, nuevoTiempo, nuevoOri, nuevaTemp);
                    } else if (original instanceof Cereal) {
                        System.out.print("Tipo de suelo: ");
                        String nuevoTipoSuelo = sc.nextLine();
                        s2 = new Cereal(idAct, nuevoNom, nuevaCant, nuevoTiempo, nuevoOri, nuevoTipoSuelo);
                    } else if (original instanceof Frutal) {
                        System.out.print("Mes de fructificación: ");
                        String nuevoMes = sc.nextLine();
                        s2 = new Frutal(idAct, nuevoNom, nuevaCant, nuevoTiempo, nuevoOri, nuevoMes);
                    }
                    if (s2 != null) {
                        System.out.println(crud.update(s2));
                    }
                    break;
                    
                case 5:
                    // Eliminar Semilla
                    System.out.print("ID a eliminar: ");
                    String idDel = sc.nextLine();
                    System.out.println(crud.delete(idDel));
                    break;
                    
                case 6:
                    // Serializar
                    System.out.print("Ruta de archivo para serializar: ");
                    String rutaSerial = sc.nextLine();
                    System.out.println(crud.serializar(rutaSerial));
                    break;
                    
                case 7:
                    // Deserializar
                    System.out.print("Ruta de archivo para deserializar: ");
                    String rutaDeserial = sc.nextLine();
                    System.out.println(crud.deserializar(rutaDeserial));
                    break;
                    
                case 8:
                    running = false;
                    break;
                    
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        sc.close();
        System.out.println("Aplicación terminada.");
    }
}
