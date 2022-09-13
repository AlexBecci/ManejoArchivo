package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        //Creando archivo en Windows
        //var nombreArchivoWindows = "C:\\carpeta\\Prueba.txt";
        //ManejoArchivos.crearArchivo(nombreArchivoWindows);

        //Creando archivo de manera local
        var nombreArchivo = "Prueba.txt";
        //ManejoArchivos.crearArchivo(nombrenombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde Java");
        anexarInformacion(nombreArchivo, "Como estas?");
        anexarInformacion(nombreArchivo, "Hola de nuevo\nProbando los metodos\nLinea\nLineaaa");
        anexarInformacion(nombreArchivo, "Archivo terminadooo");
        leerArchivo(nombreArchivo);

        //Creando archivo en Mac
        //var nombreArchivoMac = "/carpeta/prueba.txt";
        //ManejoArchivos.crearArchivo(nombreArchivoMac);
    }
}
