package com.company;

import com.company.model.Flower;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {

    private static final String DATA_URL = "http://services.hanselandpetal.com/feeds/flowers.json";

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
	// write your code here
        //Have access of modules or modularity but it functions correctly I didn't import or something
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(new URI(DATA_URL))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }

    public static void parsingJsonFile() throws IOException {
        String fileName = "files/data.json";

        Gson gson = new Gson();

        try(FileReader fileReader = new FileReader(fileName);
            JsonReader reader = new JsonReader(fileReader)
        ) {
            Flower[] data = gson.fromJson(reader, Flower[].class);
            for (Flower flower: data){
                System.out.println(flower);
            }
        }
    }

    public static void modernWayToCopyFiles(){
        //This is a new way to create a file instead of using buffers and the filewriters, etc
        //Path represents either a file or directory
        Path sourceFile = Paths.get("files", "loremipsum.txt");
        Path targetFile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFiles(){
        //Will work java 7 and after
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        try(FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter writer = new FileWriter(targetFile);) {
            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dateTimemethod(){
        //THE OLD ONE
        // The older system of the month starts at 0
        Date now = new Date();
        System.out.println(now);

        //THE NEW/CURRENT ONE Localdatetime
        //This new system start the month in 1
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 2,3);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/dd/yyyy");
        System.out.println(dtf.format(ld));
    }
}
