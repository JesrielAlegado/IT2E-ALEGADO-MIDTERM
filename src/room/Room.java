package room;
import java.util.Scanner;

public class Room {

    public static void addStudents(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Room Number : ");
        String room_num = sc.nextLine();
        System.out.print("Room Type: ");
        String room_type = sc.nextLine();
        System.out.print("Availability Status : ");
        String avail = sc.nextLine();
        System.out.print("Daily Rate: ");
        String daily_r = sc.nextLine();
        
        String sql = "INSERT INTO s_room (room_num, s_lname, Program, Violation, Date) VALUES (?, ?, ?, ?)";
        
        
        System.out.println("");
    }
  public static void viewRoom() {
        System.out.println("");
        String qry= "SELECT * FROM room1";
        String[] hrds = {"ID", "Room Number", "Room Type", "Availability Status", "Daily Rate",};
        String[] clmns = {"room_num", "room_type", "avail", "daily_r" };
        
        config conf = new config();
        conf.viewRecords(qry, hrds, clmns);
        System.out.println("");
    }
     public static void updateRoom(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Room Number: ");
        int room_num = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Room Type: ");
        String room_type = sc.nextLine();
        
        System.out.print("Enter Availability Status: ");
        String avail = sc.nextLine();
        
        System.out.print("Daily Rate: ");
        String daily_r = sc.nextLine();
        
        
        String sqlUpdate =  "UPDATE s_room SET room_num = ?, room_type = ?, Avail = ?, daily_r = ?, Date = ? WHERE ID = ?";
        
        config conf = new config();
       
        System.out.println("");
  
    }
   public static void deleteRoom(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("\nEnter ID to delete: ");
        int id = sc.nextInt();
               
        String qry = "DELETE FROM s_room WHERE ID = ?";
       
        conf.deleteRecord(qry, id);
        
        System.out.println("");
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int action;
        do {
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.print("\nENTER action: ");
            action = sc.nextInt();

            switch(action) {
                case 1:
                    addRoom();
                    break;
                    
                case 2:
                    viewRoom();
                    break;
                    
                case 3:
                    viewRoom();
                    updateRoom;
                    viewRoom();
                    break;
                    
                case 4:
                    viewRoom();
                    deleteRoom();
                    viewRoom();
                    break;
                    
                case 5:
                    System.out.println("\nExiting...");
                    sc.close();  
                    break;
                    
                default:
                    System.out.println("Invalid option.");
            }
        }while(action != 5);
    }

    private static void viewRoom() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

       
    }

       



