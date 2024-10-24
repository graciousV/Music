public class ConStructure{
    public static void main (string[]args){

        //input marks for assignments and CATS
        System.out.print("Enter marks for assignment 1: ");
        double assignment1 =input.nextDouble();
        System.out.print("Enter marks for assignment 2: ");
        double assignment2 =input.nextDouble();
        System.out.print("Enter marks for CAT 1: ");
        double CAT1 =input.nextDouble();
        System.out.print("enter marks for CAT 2: ");
        double CAT2 =input.nextDouble();

        //calculate the average marks
        double average = (assignment1 + assignment2 + CAT1 +CAT2)/4

        //print grade based on average
        if (average >=50){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }

        //print the grades
        if(average >=40 $$ average <= 50){
            System.out.println("grade A");
        }
        else if(average >=30 && average <=39){
            System.ut.println("grade B");
        }
        else if(average >=20 && average <=29){
            System.out.println("grade C");
        }
        else if(average >=10 && average <=19){
            System.out.println("gradeD");
        }
        else if(average >=0 && average <=9){
            System.outprintln("fail");
        }
    }
}