package ComputerScience;

public class Subject {
    private String name;
    // private static int misssinglimit;
    private int quiz;
    private int midterm;
    private int project;
    private int finalexam;

    public Subject(String name, int quiz,int midterm, int project,int finalexam){
        this.name=name;
        this.quiz=quiz;
        this.midterm=midterm;
        this.project=project;
        this.finalexam=finalexam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuiz() {
            return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public int getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(int finalexam) {
        this.finalexam = finalexam;
    }

    public void setGeneralPoint(int quiz,int midterm,int project,int finalexam){
        this.midterm=midterm;
        this.quiz=quiz;
        this.project=project;
        this.finalexam=finalexam;
    }
    public int getGeneralPoint(){
        return (midterm+quiz+project+finalexam);
    }
   
   
}