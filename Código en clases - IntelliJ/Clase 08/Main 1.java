import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Fernando", 21, "Quinto");

        ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();

        listaDeEstudiantes.add(estudiante);
        listaDeEstudiantes.add(new Estudiante("Camila",19, "Tercero"));


        System.out.println("Nombre del estudiante:" + listaDeEstudiantes.get(1).getNombre());
        listaDeEstudiantes.remove(estudiante);
        boolean auxiliar = listaDeEstudiantes.contains(estudiante);
        if(auxiliar) {
            System.out.println("Estudiante dentro de la lista");
        }else{
            System.out.println("No esta en la lista");
        }

        System.out.println();

        System.out.println("________________________________________________");

        HashMap<String, Estudiante> listaEstudiantesHashMap = new HashMap<>();
        listaEstudiantesHashMap.put("20221153", estudiante);
        System.out.println(listaEstudiantesHashMap.get("20221153"));
        listaEstudiantesHashMap.put("20221153", new Estudiante("Claris", 19, "Segundo"));
        System.out.println(listaEstudiantesHashMap.get("20221153"));
        System.out.println("________________________________________________");



       for(String estudiante1 : listaEstudiantesHashMap.keySet()) {
           System.out.println(listaEstudiantesHashMap.get(estudiante1));
       }




    }
}