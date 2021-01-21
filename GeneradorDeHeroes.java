import java.util.*;

public class GeneradorDeHeroes {
    public static void main(String[] args) throws Exception {
        String[] nombres = new String[8];
        String[] poderes = new String[10];
        String[] alias = new String[10];
        String[] nacionalidad = new String[10];

        nombres[0] = "Adolfo";
        nombres[1] = "Sergio";
        nombres[2] = "Ines";
        nombres[3] = "Feli";
        nombres[4] = "Adriana";
        nombres[5] = "Leire";
        nombres[6] = "Uriel";
        nombres[7] = "Pablo";

        poderes[0] = "Super fuerza";
        poderes[1] = "Super Velocidad";
        poderes[2] = "Millonario";
        poderes[3] = "Le salen muy bien los macarrones";
        poderes[4] = "Puede chuparse el codo";
        poderes[5] = "Super simpatia";
        poderes[6] = "Rayo españolizador";
        poderes[7] = "Siempre le sale a devolver en hacienda";
        poderes[8] = "Sabe programar";
        poderes[9] = "Super paciencia con los tontos";

        alias[0] = "mondarinus";
        alias[1] = "cuchufletus";
        alias[2] = "Super cis genero";
        alias[3] = "Sopla gaitas";
        alias[4] = "danonino";
        alias[5] = "pocoyo";
        alias[6] = "grana power";
        alias[7] = "chispa";
        alias[8] = "biscochito de frambuesa";
        alias[9] = "cielito";

        nacionalidad[0] = "España";
        nacionalidad[1] = "Usa";
        nacionalidad[2] = "Panama";
        nacionalidad[3] = "Suiza";
        nacionalidad[4] = "Francia";
        nacionalidad[5] = "Chikitistan";
        nacionalidad[6] = "Mordor";
        nacionalidad[7] = "La comarca";
        nacionalidad[8] = "Colomera";
        nacionalidad[9] = "Holanda";

        List<Heroes> heroes = new ArrayList<Heroes>();

        for (int i = 0; i <= 20; i++) {
            heroes.add(new Heroes(nombres[(int) (Math.random() * 8)], poderes[(int) (Math.random() * 10)],
                    alias[(int) (Math.random() * 10)], nacionalidad[(int) (Math.random() * 10)]));
        }

        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i).getNombre() + " el " + heroes.get(i).getPoder() + ", "
                    + heroes.get(i).getAlias() + " de " + heroes.get(i).getNacionalidad());
        }
    }
}