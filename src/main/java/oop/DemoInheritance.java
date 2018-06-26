package oop;

abstract class Employee {
    String id;
    String name;

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        return 1000;
    }
}

class ContractEmployee extends Employee {

    @Override
    double calculateSalary() {
        return 2000;
    }
}

// abstract class
abstract class Report {
    abstract void genHeader();
    abstract void genBody();
    abstract void genFooter();

    public void generate() {
        genHeader();
        genBody();
        genFooter();
    }
}

class Report1 extends Report {
    @Override
    void genHeader() {

    }

    @Override
    void genBody() {

    }

    @Override
    void genFooter() {

    }
}

// interface
interface InterfaceReport {
    void genHeader();
    void genBody();
    void genFooter();
}

class Report2 implements InterfaceReport {
    @Override
    public void genHeader() {

    }

    @Override
    public void genBody() {

    }

    @Override
    public void genFooter() {

    }
}

class GenerateReport {
    void generate(InterfaceReport report) {
        report.genHeader();
        report.genBody();
        report.genFooter();
    }
}

public class DemoInheritance {

    public static void main(String[] args) {
        // use interface
        InterfaceReport report2 = new Report2();
        GenerateReport generateReport = new GenerateReport();
        generateReport.generate(report2);

        // use abstract class
        Report1 report1 = new Report1();
        report1.generate();
    }

}
