package Lesson3;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        String[] keys = {"Pro", "Expert"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите лицензионный ключ для версии программы");
        String choice = reader.readLine();

        if (choice.equals(keys[0])) {
        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
        proDocumentWorker.editDocument();
        proDocumentWorker.saveDocument();
        }
        else if(choice.equals(keys[1])) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.saveDocument();
        }
        else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
        }

    }

}