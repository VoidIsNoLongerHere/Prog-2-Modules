import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        if (InGen.in("Use pre-generated data? Theres like 12 prompts. (Y/N): ", String.class).equalsIgnoreCase("y")){
            OfficeLocation office = new OfficeLocation(
                    "Some Hospital",
                    "(123)-456-7890",
                    "123 example street",
                    "city",
                    "state,",
                    "12345"
            );

            MedicalProvider doc = new Doctor(
                    "John",
                    "Doe",
                    "1234567890",
                    office,
                    "Oncologist",
                    "0987654321",
                    "1234",
                    12345.67
            );
            MedicalProvider nurse = new Nurse(
                    "Jane",
                    "Doe",
                    "1234567890",
                    office,
                    "RN",
                    32.47,
                    83
            );


            doc.printInfo();
            nurse.printInfo();

        } else {
            OfficeLocation office = new OfficeLocation(
                    InGen.in("Please enter the Office Name: ", String.class),
                    InGen.in("Please enter the Office Phone Number: ", String.class),
                    InGen.in("Please enter the Office address: ", String.class),
                    InGen.in("Please enter the Office city: ", String.class),
                    InGen.in("Please enter the Office state: ", String.class),
                    InGen.in("Please enter the Office zip code: ", String.class)
            );

            MedicalProvider doc = new Doctor(
                    InGen.in("Please enter the doctor's first name: ", String.class),
                    InGen.in("Please enter the doctor's last name: ", String.class),
                    InGen.in("Please enter the doctor's employee ID: : ", String.class),
                    office,
                    InGen.in("Please enter the doctor's specialty: ", String.class),
                    InGen.in("Please enter the doctor's license number: ", String.class),
                    InGen.in("Please enter the doctor's room number: ", String.class),
                    InGen.in("Please enter the doctor's salary: $", Double.class)
            );
            MedicalProvider nurse = new Nurse(
                    InGen.in("Please enter the nurse's first name: ", String.class),
                    InGen.in("Please enter the nurse's last name: ", String.class),
                    InGen.in("Please enter the nurse's employee ID: : ", String.class),
                    office,
                    InGen.in("Please enter the nurse's type: : ", String.class),
                    InGen.in("Please enter the nurse's hourly rate: : ", Double.class),
                    InGen.in("Please enter the nurse's hours worked: : ", Double.class)
            );

            doc.printInfo();
            nurse.printInfo();

        }




    }
}