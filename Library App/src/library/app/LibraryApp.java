package library.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryApp {

    public static void main(String[] args) {
        String activity;

        getMenu(activity);
        System.out.println(activity);

    }

    public void getMenu(String activity) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            activity = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
