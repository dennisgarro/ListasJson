import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class ExportarJson {
    public void exportarJson(LinkedList<objVenta> listaCarros) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("VentasJson.json")) {
            gson.toJson(listaCarros, writer);
            System.out.println("Lista exportada correctamente a carros.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}