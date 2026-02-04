import javax.naming.Name;

public class SubjectChallenge {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101","DSA",100);
        subs[1] = new Subject("s102","Algorithms",100);
        subs[2] = new Subject("s103","Operating System",100);

        for(Subject s : subs){
            System.out.println(s);
        }

    }
}
class Subject{
    private String subID;
    private String Name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subid, String name,int maxmarks){
        subID = subid;
        Name = name;
        maxMarks=maxmarks;
    }
    public String getSubID(){ return subID; }
    public String getName(){ return Name; }
    public int getMaxMarks(){ return maxMarks; }
    public int getMarksObtain(){ return marksObtain; }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }
    boolean isQualified(int m){
        return m>=maxMarks/10*4;
    }
    public String toString(){
        return "\nSubjectID: "+subID+"\nName: "+Name+"\nMarksObtained: "+marksObtain+"\nMaxMarks: "+maxMarks;
    }

}
