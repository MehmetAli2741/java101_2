public class Main {
    public static void main(String[] args) {
      Teacher t1 = new Teacher("Ahmet","050000","TRH");
      Teacher t2 = new Teacher("Hüseyin","040000","FZK");
      Teacher t3 = new Teacher("Bera","40000","MAT");
      Teacher t4 = new Teacher("","","");

      Course tarih = new Course("Tarih","101","TRH");
      Course fizik = new Course("fizik","102","FZK");
      Course matematik = new Course("mat","101","MAT");
      Course sNote = new Course("","","");
/*
      tarih.addTeacher(t1);
      System.out.println("===========================");
      fizik.addTeacher(t2);
      System.out.println("===========================");
      matematik.addTeacher(t3);

 */
      Student s1 = new Student("Enes","321","10D",tarih,fizik,matematik,sNote );
      s1.addBulkExamNote(75,65,76,60);
      s1.printNote();

    }
}