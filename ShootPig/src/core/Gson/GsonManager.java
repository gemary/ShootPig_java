package core.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import core.Player;
import java.io.*;

public class GsonManager {
    public Player ParseGsonToObject(String jsonString) {
        Gson gson = new Gson();
        Player player = gson.fromJson(jsonString, Player.class);
        return player;
    }

    public String ReadText(String filename){
        String text = "";

        String line;

        BufferedReader dis = null;

        try {

            dis = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

            while ((line = dis.readLine()) != null) {

                text += line;

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (dis != null)

                    dis.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

        return text;
    }

    public  void save(String filename, Player player) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(player);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
            writer.write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
