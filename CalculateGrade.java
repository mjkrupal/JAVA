public class CalculateGrade
{
    public char Grade(int marks){
        if(marks>=90 && marks<=100) return 'A';
        else if (marks>=80 && marks<90) return 'B';
        else if (marks>=70 && marks<60) return 'C';
        else if (marks>=60 && marks<50) return 'D';
        else if (marks>=50 && marks<40) return 'E';
        else return 'F';
    }
    public char Grade(int[] marks){
        int total_marks=0;
        for(int ele : marks){
            total_marks+=ele;
        }
        double avg_marks=total_marks/marks.length;
        char result = Grade((int)avg_marks);
        return result;
    } 
    public char Grade(double gpa){
        char result = Grade((int)gpa);
        return result;
    }
    public char Grade(int testscore, int assignmentscore){
        double final_score=0.7*testscore+0.3*assignmentscore;
        char result = Grade((int)final_score);
        return result;
    }
    public static void main(String args[]){
        CalculateGrade s = new CalculateGrade();
        System.out.println("Grade Calculation with subject marks: "+s.Grade(84));
        int marks[] = {80,60,70,93};
        System.out.println("Grade Calculation with Array of subject marks: "+s.Grade(marks));
        System.out.println("Grade Calculation with GPA: "+s.Grade(84.66));
        System.out.println("Grade Calculation with TestScore and AssingmentScore: "+s.Grade(40,50));

    }
}