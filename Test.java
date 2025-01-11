import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;

class Test {
    public static void main(String[] args) {

        String nowStr="2024-12-20 23:42:10.972000";
        Timestamp now= Timestamp.valueOf(nowStr);
        System.out.println("2. now : "+now);

        String str1="2024-12-19 23:42:10.9719";
        Timestamp db= Timestamp.valueOf(str1);
        System.out.println("2. db : "+db);



        if(searchDB(db, now)){
            System.out.println("Result: "+searchDB(db, now));
            System.out.println("Release method here");
        } else if(db.equals(now)){
            System.out.println("Result: "+(db.equals(now)));
            System.out.println("Same date");
        } else {
            System.out.println("Ignore");
        }
    }

    public static Boolean searchDB(Timestamp db, Timestamp now){
        return db.after(now);
    }
}  
