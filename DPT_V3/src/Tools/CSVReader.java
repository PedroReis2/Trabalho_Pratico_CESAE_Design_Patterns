package Tools;

import Models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

    public static ArrayList<Client> readCsvFileClient(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Client> clientList= new ArrayList<Client>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id = linhaSeparada[0] ;
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            String telemovel = linhaSeparada[4];
            String dataNascimento = linhaSeparada[5];
            boolean consentMarketing = Boolean.parseBoolean(linhaSeparada[6]);



            Client currClient = new Client(id, nome, nacionalidade, email, telemovel, dataNascimento, consentMarketing);
            clientList.add(currClient);

        }

        return clientList;

    }

    public static ArrayList<Experience> readCsvFileExperience(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Experience> experiencesList = new ArrayList<Experience>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id = linhaSeparada[0] ;
            String nome = linhaSeparada[1];
            String idExperience = linhaSeparada[2];
            int adultPrice = Integer.parseInt(linhaSeparada[3]);
            int childPrice = Integer.parseInt(linhaSeparada[4]);

            Experience experienceType = new Experience(id, nome, idExperience, adultPrice,childPrice);
            experiencesList.add(experienceType);

        }

        return experiencesList;

    }

    public static ArrayList<Guide> readCsvFileGuide(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Guide> guidesList = new ArrayList<Guide>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            String telemovel = linhaSeparada[4];

            Guide currGuide = new Login(id, nome, nacionalidade, email, telemovel);
            guidesList.add(currGuide);

        }

        return guidesList;
    }

    public static ArrayList<Login> readCsvFileLogin(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Login> usersList = new ArrayList<Login>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String username = linhaSeparada[0];
            String password = linhaSeparada[1];
            String accessType = linhaSeparada[2];

            Login currLogin = new Login(username, password, accessType);
            usersList.add(currLogin);

        }

        return usersList;

    }

    public static ArrayList<Room> readCsvFileRoom(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Room> roomList = new ArrayList<Room>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String roomNum = linhaSeparada[0];
            int typeId = Integer.parseInt(linhaSeparada[1]);


            Room currRoom = new Room(roomNum, typeId);
            roomList.add(currRoom);

        }

        return roomList;

    }

    public static ArrayList<Rating> readCsvFileRating(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Rating> ratingsList = new ArrayList<Rating>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id =linhaSeparada[0];
            int experienceId = Integer.parseInt(linhaSeparada[1]);
            int experienceRating = Integer.parseInt(linhaSeparada[2]);
            int experienceGuide = Integer.parseInt(linhaSeparada[3]);


            Rating currRating = new Rating(id, experienceId, experienceRating, experienceGuide);
            ratingsList.add(currRating);

        }

        return ratingsList;

    }

    public static ArrayList<Sales> readCsvFileSales(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Sales> salesList = new ArrayList<Sales>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id =linhaSeparada[0];
            String experienceId = linhaSeparada[1];
            String clientType = linhaSeparada[2];
            int year = Integer.parseInt(linhaSeparada[3]);
            int month = Integer.parseInt(linhaSeparada[4]);


            Sales currSale = new Sales(id, experienceId, clientType, year, month);
            salesList.add(currSale);

        }

        return salesList;

    }

    public static ArrayList<Reservation>  readCsvFileReservation(String filePath) throws FileNotFoundException {
        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Reservation> reservationsList = new ArrayList<Reservation>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id = linhaSeparada[0];
            int roomNum = Integer.parseInt(linhaSeparada[1]);
            int clientId = Integer.parseInt(linhaSeparada[2]);
            int year = Integer.parseInt(linhaSeparada[3]);
            int month = Integer.parseInt(linhaSeparada[4]);
            int week = Integer.parseInt(linhaSeparada[5]);

            Reservation reservation = new Reservation(id, roomNum, clientId, year, month, week);

            reservationsList.add(reservation);
        }
        return reservationsList;
    }

    public static ArrayList<RoomType> readCsvFileType(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<RoomType> typesList = new ArrayList<RoomType>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String id =linhaSeparada[0];
            String description = linhaSeparada[1];
            String pricePerWeek = linhaSeparada[2];



            RoomType roomType = new RoomType(id, description, pricePerWeek);
            typesList.add(roomType);

        }

        return typesList;

    }

}