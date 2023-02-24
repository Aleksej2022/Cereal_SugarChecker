package cereals;

import java.util.Scanner;

public class Sugar_Checker {
    public static void main(String[] args) {
        String auth_userName = "learnjava@22";
        String auth_password = "Ienjoycoding@22";
        Scanner obj = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        System.out.printf("%80s %n","Dear User, welcome to the cereal percentage sugar checker program");
        System.out.println("This program calculates the sugar percentage in different cereals using information from the nutritional facts");
        System.out.printf("%80s %n", "You can only calculate the sugar percent for two cereal");

        System.out.printf("%80s %n", "****************User Login****************");
        System.out.println("Username: -> ");
        String username = obj.nextLine();
        System.out.println("Password: -> ");
        String password = obj.nextLine();
        System.out.printf("%80s %n", "****************User Login****************");

        if (username.equals(auth_userName) && password.equals(auth_password)){
            System.out.println("Welcome " + username);
            System.out.printf("%80s %n", "How many cereals would you like to calculate the percent sugar for?");
            System.out.println("Response: -> ");
            int cerealNumber = myObj.nextInt();
            if (cerealNumber == 1){
                System.out.printf("%80s %n", "****************Cereal % Sugar Checker****************");
                System.out.println("Cereal Name: -> ");
                String cerealName = obj.nextLine();
                System.out.println("Sugar Content(g): -> ");
                double sugarContent = myObj.nextDouble();
                System.out.println("Total Food Weight(Food Serving Size g): -> ");
                double servingSize = myObj.nextDouble();
                double sugar_percent = (sugarContent / servingSize) * 100;
                System.out.printf("%80s %n", "****************Thank you****************");

                //Section to display information
                System.out.printf("%20s","Cereal name");
                System.out.printf("%20s","Serving Size(g)");
                System.out.printf("%20s","Sugar Content");
                System.out.printf("%20s","Sugar Percentage(%)");
                System.out.println();

                System.out.printf("%15s",cerealName);
                System.out.printf("%15s",servingSize);
                System.out.printf("%20s",sugarContent);
                System.out.printf("%15s %.2f","",sugar_percent);

                System.out.println();
            }

            else if (cerealNumber == 2){
                //First Cereal Entry

                System.out.printf("%80s %n", "****************Cereal % Sugar Checker****************");
                System.out.println("Cereal Name: -> ");
                String cerealName1 = obj.nextLine();
                System.out.println("Sugar Content(g): -> ");
                double sugarContent1 = myObj.nextDouble();
                System.out.println("Total Food Weight(Food Serving Size g): -> ");
                double servingSize1 = myObj.nextDouble();
                double sugar_percent1 = (sugarContent1 / servingSize1) * 100;
                System.out.printf("%80s %n", "****************Thank you****************");

                //Second Cereal Entry
                System.out.printf("%80s %n", "****************Cereal % Sugar Checker****************");
                System.out.println("Second Cereal Name: -> ");
                String cerealName2 = obj.nextLine();
                System.out.println("Sugar Content(g): -> ");
                double sugarContent2 = myObj.nextDouble();
                System.out.println("Total Food Weight(Food Serving Size g): -> ");
                double servingSize2 = myObj.nextDouble();
                double sugar_percent2 = (sugarContent2 / servingSize2) * 100;
                System.out.printf("%80s %n", "****************Thank you****************");

                //Section to display information
                System.out.printf("%20s","Cereal name");
                System.out.printf("%20s","Serving Size(g)");
                System.out.printf("%20s","Sugar Content");
                System.out.printf("%20s","Sugar Percentage(%)");
                System.out.println();

                System.out.printf("%15s",cerealName1);
                System.out.printf("%15s",servingSize1);
                System.out.printf("%20s",sugarContent1);
                System.out.printf("%15s %.2f","",sugar_percent1);

                System.out.println();

                System.out.printf("%15s",cerealName2);
                System.out.printf("%15s",servingSize2);
                System.out.printf("%20s",sugarContent2);
                System.out.printf("%15s %.2f","",sugar_percent2);

                System.out.println();
                System.out.printf("%80s %n", "****************Sugar Percentage Analytics(%)****************");
                if (sugar_percent1 > sugar_percent2){
                    System.out.println("Cereal: " + cerealName1 + "is much higher in sugar percentage than " + cerealName2);
                }
                else if (sugar_percent2 > sugar_percent1){
                    System.out.println("Cereal: " + cerealName2 + "is much higher in sugar percentage than " + cerealName1);
                }

                System.out.printf("%80s %n", "****************Sugar Percentage Analytics(%)****************");
            }

        }
        else {
            System.out.println("Sorry, Invalid Credentials!!!");
        }
    }
}
