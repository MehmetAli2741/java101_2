public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course s1;
    String name;
    String stuNo;
    String classes;
    Double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3,Course s1){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.s1 = s1;
        this.avarage =0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1,int note2,int note3,int sNote){
         if (note1 > 0 && note1 <= 100){
             c1.note = note1;
         }
         if (note2 > 0 && note2 <= 100){
             c2.note = note2;
         }
         if (note3 > 0 && note3 <= 100){
             c3.note = note3;
         }
         if (sNote > 0 && sNote <= 100){
             s1.sNote = sNote;
         }

    }

    void calcAvarage(){
        avarage = (((this.c1.note + this.c2.note + this.c3.note ) / 3.0) * 0.80) + (this.s1.sNote * 0.20);
        System.out.println("Ortalamanız : "+avarage);

    }
    void printNote(){
        System.out.println(c1.name + " Notu " +c1.note);
        System.out.println(c2.name + " Notu " +c2.note);
        System.out.println(c3.name + " Notu " +c3.note);
        calcAvarage();


    }
}
