Description
This is a Java-based Secret Santa Assignment System that helps organize a Secret Santa gift exchange event. It assigns pairs of Secret Santa recipients, ensuring that:
Each participant is assigned to someone new.
The program avoids assigning the same pair as last year (based on the previous year’s data).
This program reads employee details from employees.csv and last year’s assignments from previous_assignments.csv, and then generates new assignments while avoiding repeats.
Features
1)Avoids repeat assignments from the previous year.
2)Automatically assigns Secret Santa pairs based on the data from employees.csv and previous_assignments.csv.
3)Outputs the results in output.csv.
4)Can be easily extended or customized to fit specific needs.

Installation
1)Install Java 17:Ensure you have Java 17 or a later version installed on your machine.
2)Install Maven (for building the project):
Follow the installation instructions specific to your operating system.
Steps to Install
1)Clone this repository:
git clone https://github.com/Nivedhitha05/SecretSanta.git
2)Navigate to the project directory:
cd SecretSanta
3)Compile the project using Maven:
mvn clean install
4)The output will be packaged as a JAR file under the target directory, which you can run directly.

