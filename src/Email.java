import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternativeEmail;

    //constructor (EVC)
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.print("EMAIL CREATED: " + this.firstName + this.lastName);
    }


    //ask for department
    private String setDepartment(){
        System.out.println("Enter Department \n[1] For Sales:\n[2] For Development:\n[3] For Accounting:\n[0] For None");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();

        return "z";
    }


    //generate random password

    //set the mail capacity

    //set the alt email

    // change the password

}
